package com.example.optionsbuttons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onRadioButtonClicked(view: View) {
        if (view is RadioButton) {

            val checked = view.isChecked

            // Check which radio button was clicked
            when (view.getId()) {
                R.id.radio_opcion1 ->
                    if (checked) {
                        val toast = Toast.makeText(this, "Se ha seleccion la Opcion 1", Toast.LENGTH_LONG)
                        toast.show()
                    }
                R.id.radio_opcion2 ->
                    if (checked) {
                        val toast = Toast.makeText(this, "Se ha seleccion la Opcion 2", Toast.LENGTH_LONG)
                        toast.show()
                    }
                R.id.radio_opcion3 ->
                    if (checked) {
                        val toast = Toast.makeText(this, "Se ha seleccion la Opcion 3", Toast.LENGTH_LONG)
                        toast.show()
                    }
            }
        }
    }
}