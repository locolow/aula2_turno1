package com.example.aula2_turno1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("Life Cycle: OnCreate")
    }

    override fun onStart() {
        super.onStart()
        println("Life Cycle: OnStart")
    }

    override fun onResume() {
        super.onResume()
        println("Life Cycle: OnResume")
    }

    override fun onPause() {
        super.onPause()
        println("Life Cycle: OnPause")
    }

    override fun onStop() {
        super.onStop()
        println("Life Cycle: OnStop")
    }

    override fun onRestart() {
        super.onRestart()
        println("life Cycle: OnRestart")
    }


    override fun onDestroy() {
        super.onDestroy()
        println("Life Cycle: OnDestroy")
    }
}

