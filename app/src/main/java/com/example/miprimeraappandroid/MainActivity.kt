package com.example.miprimeraappandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    var miString = ""
    var miInt = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.w(javaClass.name, "Estoy en onCreate")

        /*miString = getString(R.string.texto)

        savedInstanceState?.let {
            miInt = it.getInt("Mi clave")
        }

        if (miInt == 0) {
            miInt = Random.nextInt()
        }

        getString(R.string.texto)
        tvInicio.text = miString + miInt*/

        tvInicio.text = getString(R.string.texto)

        savedInstanceState?.let {
            tvInicio.text = it.getString("MiClave")
        }

    }

    override fun onStart() {
        super.onStart()
        Log.w(javaClass.name, "Estoy en onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.w(javaClass.name, "Estoy en onResume")
    }


    override fun onPause() {
        super.onPause()
        Log.w(javaClass.name, "Estoy en onPause")

    }

    override fun onStop() {
        super.onStop()
        Log.w(javaClass.name, "Estoy en onStop")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.w(javaClass.name, "Estoy en onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.w(javaClass.name, "Estoy en onRestart")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        //outState.putInt("Mi clave", miInt)
        outState.putString("MiClave", tvEdit.text.toString())
    }
}