package com.services.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practice)

        // Initialize RadioGroup and RadioButtons
        val rGroup = findViewById<RadioGroup>(R.id.rg1)
        val radio1 = findViewById<RadioButton>(R.id.r1)
        val radio2 = findViewById<RadioButton>(R.id.r2)
        val radio3 = findViewById<RadioButton>(R.id.r3)

        // Initialize CheckBoxes for toppings
        val chk1 = findViewById<CheckBox>(R.id.c1)
        val chk2 = findViewById<CheckBox>(R.id.c2)
        val chk3 = findViewById<CheckBox>(R.id.c3)

        // Initialize the Button
        val btn = findViewById<Button>(R.id.btn1)

        // Set OnClickListener for the button to show the toast
        btn.setOnClickListener {
            // Get selected pizza size from the radio group
            val selectedRadioButtonId = rGroup.checkedRadioButtonId
            val pizzaSize = when (selectedRadioButtonId) {
                R.id.r1 -> "Medium"
                R.id.r2 -> "Large"
                R.id.r3 -> "Small"
                else -> "No size selected"
            }

            // Collect selected toppings
            val toppings = mutableListOf<String>()
            if (chk1.isChecked) toppings.add("Chk1")

            if (chk2.isChecked) toppings.add("Topping 2")
            if (chk3.isChecked) toppings.add("Topping 3")

            // Prepare and display the order summary
            val orderSummary = "Pizza Size: $pizzaSize\nToppings: ${if (toppings.isEmpty()) "No toppings selected" else toppings.joinToString()}"
            Toast.makeText(this, orderSummary, Toast.LENGTH_LONG).show()
        }
    }
}
