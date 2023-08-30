package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import java.util.ArrayList


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val findFlowerButton = findViewById<Button>(R.id.bFindFlowers)

        findFlowerButton.setOnClickListener{
            val spinner = findViewById<Spinner>(R.id.sColors)
            val color = spinner.selectedItem.toString()
            val flowers = getFlowers(color)

            // for converting flower val to string

            var flowerString = ""
            for( flower in flowers){
                flowerString = flowerString + flower + "\n"
            }

            val flowersTextView = findViewById<TextView>(R.id.tvFlowers)
            flowersTextView.text = flowerString
        }
    }

    fun getFlowers(color : String) : List<String>{
        return when(color){
            "White" -> arrayListOf<String>("Lily", "Daisy")
            "Red" -> arrayListOf<String>("Rose","Tulip")
            "Yellow" -> arrayListOf<String>("Sunflower")
            else -> {arrayListOf<String>("None")}
        }
    }
}