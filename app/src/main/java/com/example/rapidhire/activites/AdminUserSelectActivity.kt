package com.example.rapidhire.activites

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import androidx.cardview.widget.CardView
import com.example.rapidhire.R
import com.example.rapidhire.databinding.ActivityAdminUserSelectBinding

class AdminUserSelectActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAdminUserSelectBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityAdminUserSelectBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val btnAdmin = binding.candidate
        val btnUser = binding.cardViewRec

        btnAdmin.setOnClickListener {
            Handler().postDelayed(Runnable {
                val i = Intent(this, AuthActivity::class.java)
                startActivity(i)
            }, 3000)
        }

        btnUser.setOnClickListener {
            Handler().postDelayed(Runnable {
                val i = Intent(this, AuthActivity::class.java)
                startActivity(i)
            }, 3000)
        }
    }
}