package com.example.mohamedosama.coderswag.Adaptors

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.mohamedosama.coderswag.R
import com.example.mohamedosama.coderswag.model.Categories

class CategoryAdaptor(val context: Context, val data: List<Categories>) : BaseAdapter() {

    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item, parent, false)
        val currentItem: Categories = data[position]

        val categoryImage: ImageView = categoryView.findViewById(R.id.itemImage)
        val categoryText: TextView = categoryView.findViewById(R.id.itemText)

        categoryImage.setImageResource(currentItem.image)
        categoryText.text = currentItem.name
        return categoryView
    }

    override fun getItem(position: Int): Any {
        return data[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return data.count()
    }

}