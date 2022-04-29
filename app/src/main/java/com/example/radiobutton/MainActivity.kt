package com.example.radiobutton

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        radioButtonA.setOnClickListener(this)
        radioButtonB.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        if (view === radioButtonA) {
            Toast.makeText(this@MainActivity, "A Clicked.", Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(this@MainActivity, "B Clicked.", Toast.LENGTH_LONG).show()
        }
    }
}