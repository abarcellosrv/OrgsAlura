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

class ProductFormActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_form)

        val saveButton = findViewById<Button>(R.id.save_button)

        saveButton.setOnClickListener {
            val name = findViewById<EditText>(R.id.name).text.toString()
            val description = findViewById<EditText>(R.id.description).text.toString()
            val priceText = findViewById<EditText>(R.id.price).text.toString()
            val price = if(priceText.isBlank()){
                BigDecimal.ZERO
            }else{
                BigDecimal(priceText)
            }
            val newProduct = Products(name, description, price)

            Log.i("ProductForm", "onCreate: $$newProduct")

        }
    }
}