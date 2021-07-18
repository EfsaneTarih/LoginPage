package com.example.loginpage

import android.content.Intent
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.widget.*
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private lateinit var kullanıcıAdı:TextView
    private lateinit var parola :TextView
    private lateinit var img_invisible :ImageView
    override fun onStart() {
        super.onStart()
        Toast.makeText(applicationContext, "onstart başladı", Toast.LENGTH_SHORT).show()

    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(applicationContext, "onpause başladı", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(applicationContext, "onresume başladı", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(applicationContext, "onstop başladı", Toast.LENGTH_SHORT).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var isVisible = true

        kullanıcıAdı = findViewById<TextView>(R.id.kullanıcıAdıtxt)
        parola = findViewById<TextView>(R.id.parolatxt)
        kullanıcıAdı.hint = "Kullanıcı Adı: "
        parola.hint = "Parola: "

        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            openActivity2()
        }

        val GösterGizleButonu: ImageButton = findViewById(R.id.GösterGizleButonu)
        GösterGizleButonu.setOnClickListener {
            if (isVisible) {
                parola.transformationMethod = HideReturnsTransformationMethod.getInstance()
                GösterGizleButonu.setBackgroundResource(R.drawable.ic_eye)
                isVisible=false
            }
            else {
                parola.transformationMethod = PasswordTransformationMethod.getInstance()
                GösterGizleButonu.setBackgroundResource(R.drawable.ic_eye_invisible)
                isVisible=true
            }
        }
    }

    fun openActivity2() {
        val intent = Intent(this, MainActivity2::class.java)
        intent.putExtra("kullaniciadi", kullanıcıAdı.text.toString())
        intent.putExtra("parola",parola.text.toString())
        startActivity(intent)
    }


}