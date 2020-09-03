package com.project.msgshareapp

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.project.msgshareapp.Constants.USER_MSG_KEY
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val bundle: Bundle? = intent.extras
        bundle?.let {
            val msg = bundle.getString(USER_MSG_KEY)

            showToast(msg!!)//Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()

            txvUserMessage.text = msg
        }
//        val msg = bundle!!.getString("user_message")
//
//        showToast(msg!!)//Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
//
//        txvUserMessage.text = msg
    }
}