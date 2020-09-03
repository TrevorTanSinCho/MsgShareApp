package com.project.msgshareapp

import android.content.Context
import android.widget.Toast

//fun Activity.showToast(message: String){}
fun Context.showToast(message: String){
    Toast.makeText(this,message, Toast.LENGTH_SHORT).show()
}