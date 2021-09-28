package br.com.alura.orgs.ui.activity
import android.app.Activity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import br.com.alura.orgs.R
import br.com.alura.orgs.model.Product
import br.com.alura.orgs.ui.recyclerview.adapter.ProductListAdapter
import java.math.BigDecimal


class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*val name = findViewById<TextView>(R.id.name)
        name.text = "Fruit Salad"
        val description = findViewById<TextView>(R.id.description)
        description.text = "Orange, mango and grapes"
        val price = findViewById<TextView>(R.id.price)
        price.text = "$19.99"*/
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ProductListAdapter(context = this, products = listOf(
            Product(
                name = "test" ,
                description = "test" ,
                price = BigDecimal("19.99")
            )
        )
        )
    }
}