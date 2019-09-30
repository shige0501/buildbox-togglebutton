package net.buildbox.sample.buildbox_togglebutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.ToggleButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sampleToggle: ToggleButton = findViewById(R.id.sample_toggle)
        sampleToggle.setOnCheckedChangeListener { _, _ ->
            Toast.makeText(this, "ToggleButtonの状態が変わりました", Toast.LENGTH_SHORT).show()
        }
    }
}
