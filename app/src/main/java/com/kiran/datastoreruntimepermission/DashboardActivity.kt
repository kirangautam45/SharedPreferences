package com.kiran.datastoreruntimepermission

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DashboardActivity : AppCompatActivity() {
    private lateinit var btnPermission : Button
    private lateinit var btnSharedPref : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        btnSharedPref = findViewById(R.id.btnSharedPref)
        btnPermission = findViewById(R.id.btnPermission)

        btnSharedPref.setOnClickListener {
            startActivity(Intent(this@DashboardActivity,SharedpreferencesActivity::class.java))
        }

        btnPermission.setOnClickListener {
            startActivity(Intent(this@DashboardActivity,PermissionActivity::class.java))
        }
    }
}