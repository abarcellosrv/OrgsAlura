package br.com.alura.orgs.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import android.widget.Toast.makeText
import br.com.alura.orgs.R
import br.com.alura.orgs.model.Products
import com.google.android.gms.analytics.ecommerce.Product
import java.math.BigDecimal

class ProductFormActivity : AppCompatActivity(R.layout.activity_product_form) {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)


        val saveButton = findViewById<Button>(R.id.save_button)
        saveButton.setOnClickListener {
            val name = findViewById<EditText>(R.id.name).text
            val nameText = name.toString()
            val descriptionText = findViewById<EditText>(R.id.description).text
            val description = descriptionText.toString()


        }
    }
}