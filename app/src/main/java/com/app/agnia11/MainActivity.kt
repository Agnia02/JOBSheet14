package com.app.agnia11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val TO = findViewById<Button>(R.id.btnTO)
        val TPFL = findViewById<Button>(R.id.btnTPFL)
        val PPLG = findViewById<Button>(R.id.btnPPLG)
        val Kuliner = findViewById<Button>(R.id.btnKuliner)
        val Busana = findViewById<Button>(R.id.btnBusana)

        TO.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, FragmentTO())
            fragmentTransaction.commit()
        }

        TPFL.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, FragmentPengelasan())
            fragmentTransaction.commit()
        }

        PPLG.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, FragmenPplg())
            fragmentTransaction.commit()
        }

        Kuliner.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, FragmentKuliner())
            fragmentTransaction.commit()
        }

        Busana.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, FragmentBusana())
            fragmentTransaction.commit()
        }
    }
}