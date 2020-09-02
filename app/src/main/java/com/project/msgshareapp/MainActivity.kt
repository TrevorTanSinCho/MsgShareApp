package com.project.msgshareapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShowToast.setOnClickListener {
            Log.i(TAG, "onCreate: Button was clicked !")
            Toast.makeText(this,"Button was clicked !", Toast.LENGTH_SHORT).show()
        }

        btnSendMsgToNextActivity.setOnClickListener {
            Toast.makeText(this,"Second Button was clicked !", Toast.LENGTH_SHORT).show()

            val message = etUserMessage.text.toString()

            val intent = Intent(this,SecondActivity::class.java)
            intent.putExtra("user_message", message)
            startActivity(intent)
        }
    }
}