package com.example.healthapps.view.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout
import android.widget.TextView
import com.example.healthapps.R


class loginActivity : AppCompatActivity() {
 // 1_. creamos las variables para despues asocuelas

    lateinit var iniciobutton: Button
    lateinit var registrobutton:Button
    lateinit var recuperarbutton: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // 2_.asocia la variable como vemos acontinuecion "iniciobutton=findViewById(nombre)" esto es
        //que la variable esta asociada acada uno de los nombres qeu dimos en el xml en el layout

        iniciobutton=findViewById(R.id.bini)
        registrobutton=findViewById(R.id.bregis)
        recuperarbutton=findViewById(R.id.brecor)

        // 3_. programamos que cuando yo de click en dicho botton alga algo

        iniciobutton.setOnClickListener{
            startActivity(Intent( this, ragmentActivity::class.java))
        }

        registrobutton.setOnClickListener{
            startActivity(Intent( this, registroActivity::class.java))
        }
        recuperarbutton.setOnClickListener{
            startActivity(Intent( this, recuperarActivity::class.java))

        }

    }

}