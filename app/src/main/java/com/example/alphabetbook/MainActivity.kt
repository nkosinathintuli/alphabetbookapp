package com.example.alphabetbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val buttonA: Button = findViewById(R.id.buttonA)
//        buttonA.setOnClickListener {
//            var intent = Intent(this, LetterPageActivity::class.java)
//            startActivity(intent)
//        }
    }

    fun buttonClicked(view: View) {
        when(view.getId()) {
            R.id.buttonA -> {
                var intent = Intent(this, LetterPageActivity::class.java)
                intent.putExtra("name", "slide01" )
                startActivity(intent)
            }
            R.id.buttonB -> {
                var intent = Intent(this, LetterPageActivity::class.java)
                intent.putExtra("name", "slide02" )
                startActivity(intent)
            }
            R.id.buttonC -> {
                var intent = Intent(this, LetterPageActivity::class.java)
                intent.putExtra("name", "slide03" )
                startActivity(intent)
            }
            R.id.buttonD -> {
                var intent = Intent(this, LetterPageActivity::class.java)
                intent.putExtra("name", "slide04" )
                startActivity(intent)
            }
            R.id.buttonE -> {
                var intent = Intent(this, LetterPageActivity::class.java)
                intent.putExtra("name", "slide05" )
                startActivity(intent)
            }
            R.id.buttonF -> {
                var intent = Intent(this, LetterPageActivity::class.java)
                intent.putExtra("name", "slide06" )
                startActivity(intent)
            }
            R.id.buttonG -> {
                var intent = Intent(this, LetterPageActivity::class.java)
                intent.putExtra("name", "slide07" )
                startActivity(intent)
            }
            R.id.buttonH -> {
                var intent = Intent(this, LetterPageActivity::class.java)
                intent.putExtra("name", "slide08" )
                startActivity(intent)
            }
            R.id.buttonI -> {
                var intent = Intent(this, LetterPageActivity::class.java)
                intent.putExtra("name", "slide09" )
                startActivity(intent)
            }
            R.id.buttonJ -> {
                var intent = Intent(this, LetterPageActivity::class.java)
                intent.putExtra("name", "slide10" )
                startActivity(intent)
            }
            R.id.buttonK -> {
                var intent = Intent(this, LetterPageActivity::class.java)
                intent.putExtra("name", "slide11" )
                startActivity(intent)
            }
            R.id.buttonL -> {
                var intent = Intent(this, LetterPageActivity::class.java)
                intent.putExtra("name", "slide12" )
                startActivity(intent)
            }
            R.id.buttonM -> {
                var intent = Intent(this, LetterPageActivity::class.java)
                intent.putExtra("name", "slide13" )
                startActivity(intent)
            }
            R.id.buttonN -> {
                var intent = Intent(this, LetterPageActivity::class.java)
                intent.putExtra("name", "slide14" )
                startActivity(intent)
            }
            R.id.buttonO -> {
                var intent = Intent(this, LetterPageActivity::class.java)
                intent.putExtra("name", "slide15" )
                startActivity(intent)
            }
            R.id.buttonP -> {
                var intent = Intent(this, LetterPageActivity::class.java)
                intent.putExtra("name", "slide16" )
                startActivity(intent)
            }
                R.id.buttonQ -> {
                var intent = Intent(this, LetterPageActivity::class.java)
                intent.putExtra("name", "slide17" )
                startActivity(intent)
            }
            R.id.buttonR -> {
                var intent = Intent(this, LetterPageActivity::class.java)
                intent.putExtra("name", "slide18" )
                startActivity(intent)
            }
            R.id.buttonS -> {
                var intent = Intent(this, LetterPageActivity::class.java)
                intent.putExtra("name", "slide19" )
                startActivity(intent)
            }
            R.id.buttonT -> {
                var intent = Intent(this, LetterPageActivity::class.java)
                intent.putExtra("name", "slide20" )
                startActivity(intent)
            }
            R.id.buttonU -> {
                var intent = Intent(this, LetterPageActivity::class.java)
                intent.putExtra("name", "slide21" )
                startActivity(intent)
            }
            R.id.buttonV -> {
                var intent = Intent(this, LetterPageActivity::class.java)
                intent.putExtra("name", "slide22" )
                startActivity(intent)
            }
            R.id.buttonW -> {
                var intent = Intent(this, LetterPageActivity::class.java)
                intent.putExtra("name", "slide23" )
                startActivity(intent)
            }
            R.id.buttonX -> {
                var intent = Intent(this, LetterPageActivity::class.java)
                intent.putExtra("name", "slide24" )
                startActivity(intent)
            }
            R.id.buttonY -> {
                var intent = Intent(this, LetterPageActivity::class.java)
                intent.putExtra("name", "slide25" )
                startActivity(intent)
            }
            R.id.buttonZ -> {
                var intent = Intent(this, LetterPageActivity::class.java)
                intent.putExtra("name", "slide26" )
                startActivity(intent)
            }

        }
    }
}