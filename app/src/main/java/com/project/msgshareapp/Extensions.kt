package com.project.msgshareapp

import android.content.Context
import android.widget.Toast

//fun Activity.showToast(message: String){}
fun Context.showToast(message: String, duration: Int = Toast.LENGTH_SHORT ){
    Toast.makeText(this,message, duration).show()
}