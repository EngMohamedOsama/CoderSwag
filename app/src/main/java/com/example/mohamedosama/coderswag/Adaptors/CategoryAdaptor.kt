package com.example.mohamedosama.coderswag.Adaptors

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.mohamedosama.coderswag.R
import com.example.mohamedosama.coderswag.Utils.CATEGORY_NAME
import com.example.mohamedosama.coderswag.controller.ProductActivity
import com.example.mohamedosama.coderswag.model.Categories

class CategoryAdaptor(val context: Context, val dataList: List<Categories>) : RecyclerView.Adapter<CategoryAdaptor.CategoryHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.category_list_item, parent, false)
        return CategoryHolder(view)
    }

    override fun getItemCount(): Int {
        return dataList.count()
    }

    override fun onBindViewHolder(categoryHolder: CategoryHolder, position: Int) {
        val currentItem = dataList[position]
        categoryHolder.itemName?.text = currentItem.name
        categoryHolder.itemImage?.setImageResource(currentItem.image)
        categoryHolder.itemView.setOnClickListener {
            val productIntent = Intent(context, ProductActivity::class.java)
            productIntent.putExtra(CATEGORY_NAME, currentItem.name)
            context.startActivity(productIntent)
        }
    }

    inner class CategoryHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        val itemImage = itemView?.findViewById<ImageView>(R.id.itemImage)
        val itemName = itemView?.findViewById<TextView>(R.id.itemText)
    }
}