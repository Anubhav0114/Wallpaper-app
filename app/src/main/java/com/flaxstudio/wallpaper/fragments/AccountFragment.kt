package com.flaxstudio.wallpaper.fragments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.flaxstudio.wallpaper.SubscriptionActivity
import com.flaxstudio.wallpaperapp.databinding.FragmentAccountBinding

class AccountFragment : Fragment() {
   private lateinit var binding: FragmentAccountBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentAccountBinding.inflate(inflater , container , false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.containerShare.setOnClickListener{
            val sendIntent : Intent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT , "Hey, I just made a really cool drawing using Draw On App .You should also download this amazing App. \n" +
                        "https://play.google.com/store/apps/details?id=com.flaxstudio.drawon")
                type = "text/plain"
            }
            val shareIntent = Intent.createChooser(sendIntent , "Share Draw On to your Friends")
            startActivity(shareIntent)
        }
        binding.containerFeedback.setOnClickListener{
            val intent = Intent().apply{
                action = Intent.ACTION_SENDTO
                data = Uri.parse("mailto:")
                putExtra(Intent.EXTRA_EMAIL, arrayOf("flaxstudiohelp@gmail.com"))
                putExtra(Intent.EXTRA_SUBJECT, "Tell about our application")
            }
            startActivity(Intent.createChooser(intent, "Send Email"))
        }
        binding.containerRateUs.setOnClickListener {
            Toast.makeText(context,"Added Soon",Toast.LENGTH_LONG).show()
        }
        binding.containerPrivacyPolicy.setOnClickListener{Toast.makeText(context,"Added Soon...",Toast.LENGTH_LONG).show()}
        binding.getPremium.setOnClickListener {
           val intent = Intent(activity, SubscriptionActivity::class.java)
            startActivity(intent)
        }
    }



}