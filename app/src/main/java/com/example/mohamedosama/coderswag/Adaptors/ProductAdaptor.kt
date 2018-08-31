package com.example.mohamedosama.coderswag.Adaptors

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.mohamedosama.coderswag.R
import com.example.mohamedosama.coderswag.model.Products

class ProductAdaptor(private val context: Context, private val dataList: List<Products>) : RecyclerView.Adapter<ProductAdaptor.ProductHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.product_list_item, parent, false)
        return ProductHolder(view)
    }

    override fun getItemCount(): Int {
        return dataList.count()
    }

    override fun onBindViewHolder(holder: ProductHolder, position: Int) {
        val currentItem = dataList[position]
        holder.productImage?.setImageResource(currentItem.image)
        holder.productName?.text = currentItem.name
        holder.productPrice?.text = currentItem.price
    }

    inner class ProductHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        val productImage = itemView?.findViewById<ImageView>(R.id.productImage)
        val productName = itemView?.findViewById<TextView>(R.id.productTitle)
        val productPrice = itemView?.findViewById<TextView>(R.id.productPrice)
    }
}