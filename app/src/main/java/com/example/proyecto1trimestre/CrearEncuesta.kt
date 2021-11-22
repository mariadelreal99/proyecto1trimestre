package com.example.proyecto1trimestre
import Encuesta
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.proyecto1trimestre.databinding.ActivityCrearEncuestaBinding
import com.example.proyecto1trimestre.databinding.ActivityMainBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.ktx.Firebase


import kotlinx.android.synthetic.main.activity_crear_encuesta.*

class CrearEncuesta : AppCompatActivity() {

    private lateinit var binding: ActivityCrearEncuestaBinding

    //private lateinit var database : DatabaseReference
    private lateinit var db: FirebaseFirestore


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCrearEncuestaBinding.inflate(layoutInflater)
        db = FirebaseFirestore.getInstance()
        setContentView(binding.root)

        binding.botonGuardar.setOnClickListener {



                db.collection("encuestas").document()
                    .set(
                        hashMapOf(
                            "pregunta" to pregunta.text.toString(),
                            "respuesta1" to respuesta1.text.toString(),
                            "respuesta2" to respuesta2.text.toString(),
                            "respuesta3" to respuesta3.text.toString(),
                            "respuesta4" to respuesta4.text.toString(),


                            )
                    )




        }

    }
}