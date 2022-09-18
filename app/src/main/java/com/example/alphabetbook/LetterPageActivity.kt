package com.example.alphabetbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import com.example.alphabetbook.R.drawable

class LetterPageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_letter_page)

        var name: String? = intent.getStringExtra("name")
        var id: Int = resources.getIdentifier(name, "drawable", packageName)
        var imageView = findViewById<ImageView>(R.id.imageView)
        imageView.setImageResource(id)

        val prevButton: Button = findViewById(R.id.button)
        val aButton: Button = findViewById(R.id.button2)
        val zButton: Button = findViewById(R.id.button3)
        val nextButton: Button = findViewById(R.id.button4)

        aButton.setOnClickListener {
            id = resources.getIdentifier("slide01", "drawable", packageName)
            imageView.setImageResource(id)
        }
        zButton.setOnClickListener {
            id = resources.getIdentifier("slide26", "drawable", packageName)
            imageView.setImageResource(id)
        }
        nextButton.setOnClickListener {
            id = nextImage(id)
            imageView.setImageResource(id)
        }
        prevButton.setOnClickListener {
            id = prevImage(id)
            imageView.setImageResource(id)
        }
    }

    fun nextImage(id:Int): Int{
        var filesNames = listOf("slide01", "slide02", "slide03", "slide04", "slide05", "slide06",
            "slide07", "slide08","slide09","slide10","slide11","slide12","slide13","slide14","slide15",
            "slide16","slide17","slide18","slide19","slide20","slide21","slide22","slide23","slide24",
            "slide25","slide26")
        println("next pressed")
        println(id)
        var idx = id
        var i = 0
        for(fName in filesNames){
            if(fName == "slide26") break
            if(id == resources.getIdentifier(fName, "drawable", packageName)){
                i = filesNames.indexOf(fName)
                idx = resources.getIdentifier(filesNames[i+1],"drawable", packageName)
                break
            }
        }
        return idx
    }

    fun prevImage(id: Int): Int{
        var filesNames = listOf("slide01", "slide02", "slide03", "slide04", "slide05", "slide06",
            "slide07", "slide08","slide09","slide10","slide11","slide12","slide13","slide14","slide15",
            "slide16","slide17","slide18","slide19","slide20","slide21","slide22","slide23","slide24",
            "slide25","slide26")
        println("prev pressed")
        println(id)
        var idx = id
        var i = 0
        for(fName in filesNames){
            if(fName == "slide01") continue
            if(id == resources.getIdentifier(fName, "drawable", packageName)){
                i = filesNames.indexOf(fName)
                idx = resources.getIdentifier(filesNames[i-1],"drawable", packageName)
                break
            }
        }
        return idx
    }
}