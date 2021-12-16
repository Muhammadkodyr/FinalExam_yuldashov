package kg.yuldahsov.finalexamyuldashov

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val go = findViewById<LinearLayout>(R.id.linearLayout)

        go.setOnClickListener{
            startActivity(Intent(this,SearchActivity::class.java))
        }
    }
}