package org.test.diana

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Поки просто тест, можна додати Kivy/Flutter/Jetpack Compose пізніше
        Toast.makeText(this, "Diana запущена!", Toast.LENGTH_LONG).show()
    }
}
