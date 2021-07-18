package com.example.loginpage


import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val text1 = intent.extras?.getString("kullaniciadi")
        val text2 = intent.extras?.getString("parola")

        val messageTextView: TextView=findViewById(R.id.textView)
        val messageTextView2: TextView=findViewById(R.id.textView2)

        messageTextView.text=text1
        messageTextView2.text=text2
    }
}