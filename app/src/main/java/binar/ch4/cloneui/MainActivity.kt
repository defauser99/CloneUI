package binar.ch4.cloneui

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import binar.ch4.cloneui.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val drawer = binding.drawerLayout
        val drawerButton: Button = findViewById(R.id.burger_button)

        drawerButton.setOnClickListener { drawer.openDrawer(GravityCompat.START) }
    }
}