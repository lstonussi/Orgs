package com.tonussi.orgs.ui.recycleview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.tonussi.orgs.R
import com.tonussi.orgs.model.Product

class ListProductAdapter(
    private val context: Context,
    private val products:List<Product>
) : RecyclerView.Adapter<ListProductAdapter.ViewHolder>() {

    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        fun link(product: Product) {
            val name = itemView.findViewById<TextView>(R.id.name)
            name.text = product.name
            val description = itemView.findViewById<TextView>(R.id.description)
            description.text = product.description
            val price = itemView.findViewById<TextView>(R.id.price)
            price.text = product.price.toPlainString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(context)
        val inflate = inflater.inflate(R.layout.product_item, parent, false)
        return ViewHolder(inflate)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val product = products[position]
        holder.link(product)
    }

    override fun getItemCount(): Int = products.size


}
