package br.com.alura.orgs.ui.recyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.alura.orgs.R
import br.com.alura.orgs.model.Product

class ProductListAdapter(
    private val context: Context ,
    private val products: List<Product>
) : RecyclerView.Adapter<ProductListAdapter.ViewHolder>() {

    class ViewHolder(private val view: View) : RecyclerView.ViewHolder(view){
        fun vincula(produto: Product) {
            val nome = itemView.findViewById<TextView>(R.id.name)
            nome.text = produto.name
            val descricao = itemView.findViewById<TextView>(R.id.description)
            descricao.text = produto.description
            val valor = itemView.findViewById<TextView>(R.id.price)
            valor.text = produto.price.toPlainString()
        }
    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.item_list, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val produto = products[position]
        holder.vincula(produto)
    }

    override fun getItemCount(): Int = products.size

}
