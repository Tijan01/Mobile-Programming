package com.example.app41

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

//    fun displayToast(message: String) {
//        Toast.makeText(applicationContext, message, Toast.LENGTH_SHORT).show()
//    }
fun displayToast(message: String, textColor: Int) {
    val toast = Toast.makeText(applicationContext, message, Toast.LENGTH_SHORT)
    val toastView = toast.view
    val toastMessage = toastView?.findViewById<TextView>(android.R.id.message)
    if (toastMessage != null) {
        toastMessage.setTextColor(textColor)
    }
    toast.show()
}

//    fun showMotor(view: View) {
//        displayToast(getString(R.string.pesanMotor))
//    }
//    fun showMobil(view: View) {
//        displayToast(getString(R.string.pesanMobil))
//    }
//    fun showSepeda(view: View) {
//        displayToast(getString(R.string.pesanSepeda))
//    }
    fun showMotor(view: View) {
        val textColor = resources.getColor(R.color.redwine) // Replace `your_color` with the desired color resource
        displayToast(getString(R.string.pesanMotor), textColor)
    }

    fun showMobil(view: View) {
        val textColor = resources.getColor(R.color.redwine) // Replace `your_color` with the desired color resource
        displayToast(getString(R.string.pesanMobil), textColor)
    }

    fun showSepeda(view: View) {
        val textColor = resources.getColor(R.color.redwine) // Replace `your_color` with the desired color resource
        displayToast(getString(R.string.pesanSepeda), textColor)
    }
}