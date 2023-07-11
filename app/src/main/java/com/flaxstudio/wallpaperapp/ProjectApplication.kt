package com.flaxstudio.wallpaperapp

import android.app.Application

class ProjectApplication : Application() {
    // No need to cancel this scope as it'll be torn down with the process

    // Using by lazy so the database and the repository are only created when they're needed
    // rather than when the application starts
//    private val database by lazy { WallpaperDatabase.getInstance(this) }
//    val wallpaperRepository by lazy { WallpaperRepository(database.wallpaperDao()) }
//    val categoryRepository by lazy { CategoriesRepo(database.categoryDao()) }

    override fun onCreate() {
        super.onCreate()
    }
}