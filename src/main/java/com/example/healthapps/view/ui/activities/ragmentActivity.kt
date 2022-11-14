package com.example.healthapps.view.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healthapps.R
import com.example.healthapps.databinding.ActivityRagmentBinding

class ragmentActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRagmentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRagmentBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_ragment)
    }
}