package com.example.navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.setupActionBarWithNavController

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val navController = Navigation.findNavController(this, R.id.fragment)
//        setupActionBarWithNavController(navController)
    }

//    override fun onSupportNavigateUp(): Boolean {
//        val navyController = findNavController(R.id.fragment)
//        return navyController.navigateUp()||super.onSupportNavigateUp()
//    }
}