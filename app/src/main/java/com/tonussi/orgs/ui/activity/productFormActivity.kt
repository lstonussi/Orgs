package com.tonussi.orgs.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.tonussi.orgs.R

class productFormActivity : AppCompatActivity(R.layout.activity_product_form) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val button_save = findViewById<Button>(R.id.button_save);
        button_save.setOnClickListener {
            val fildName = findViewById<EditText>(R.id.name)
            val name = fildName.text.toString()
            Log.i("productFormActivity", "onCreate:$name");
        }
    }

}