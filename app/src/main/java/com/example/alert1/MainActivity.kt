package com.example.alert1

import android.content.DialogInterface
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.RelativeLayout
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import java.util.concurrent.Executors


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun valider(v: View?) {
         lateinit var nom : EditText
         lateinit var prenom : EditText
         lateinit var email : EditText
        nom =findViewById(R.id.nom)
        prenom =findViewById(R.id.prenom)
        email =findViewById(R.id.email)
        if (nom.getText().isEmpty() || prenom.getText().isEmpty() || email.getText().isEmpty()
        ) {
            val ad = AlertDialog.Builder(this)
            ad.setMessage("Les champs ne doivent pas être vide")
            ad.setTitle("Error")
            ad.setIcon(android.R.drawable.btn_dialog)
            ad.setPositiveButton("yes",
                DialogInterface.OnClickListener { dialogInterface, i -> finish() })
            val a: AlertDialog = ad.create()
            a.show()
        }

    }
}