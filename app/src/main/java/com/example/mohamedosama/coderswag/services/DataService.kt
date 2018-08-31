package com.example.mohamedosama.coderswag.services

import com.example.mohamedosama.coderswag.R
import com.example.mohamedosama.coderswag.model.Categories
import com.example.mohamedosama.coderswag.model.Products

object DataService {
    val categories = listOf(
            Categories("SHIRTS", R.drawable.shirtimage),
            Categories("HOODIES", R.drawable.hoodieimage),
            Categories("HATS", R.drawable.hatimage),
            Categories("DIGITAL", R.drawable.digitalgoodsimage)
    )
    private val hats = listOf(
            Products("Black Hat", "$10", R.drawable.hat1),
            Products("Red Hat", "$15", R.drawable.hat2),
            Products("White Hat", "$20", R.drawable.hat3),
            Products("Dragon Hat", "$25", R.drawable.hat4),

            Products("Black Hat", "$10", R.drawable.hat1),
            Products("Red Hat", "$15", R.drawable.hat2),
            Products("White Hat", "$20", R.drawable.hat3),
            Products("Dragon Hat", "$25", R.drawable.hat4),

            Products("Black Hat", "$10", R.drawable.hat1),
            Products("Red Hat", "$15", R.drawable.hat2),
            Products("White Hat", "$20", R.drawable.hat3),
            Products("Dragon Hat", "$25", R.drawable.hat4),

            Products("Black Hat", "$10", R.drawable.hat1),
            Products("Red Hat", "$15", R.drawable.hat2),
            Products("White Hat", "$20", R.drawable.hat3),
            Products("Dragon Hat", "$25", R.drawable.hat4)

    )

    private val hoodies = listOf(
            Products("Black Hood", "$10", R.drawable.hoodie1),
            Products("White Hood", "$15", R.drawable.hoodie2),
            Products("Red Hood", "$20", R.drawable.hoodie3),
            Products("White&Red Hood", "$25", R.drawable.hoodie4),

            Products("Black Hood", "$10", R.drawable.hoodie1),
            Products("White Hood", "$15", R.drawable.hoodie2),
            Products("Red Hood", "$20", R.drawable.hoodie3),
            Products("White&Red Hood", "$25", R.drawable.hoodie4),

            Products("Black Hood", "$10", R.drawable.hoodie1),
            Products("White Hood", "$15", R.drawable.hoodie2),
            Products("Red Hood", "$20", R.drawable.hoodie3),
            Products("White&Red Hood", "$25", R.drawable.hoodie4),

            Products("Black Hood", "$10", R.drawable.hoodie1),
            Products("White Hood", "$15", R.drawable.hoodie2),
            Products("Red Hood", "$20", R.drawable.hoodie3),
            Products("White&Red Hood", "$25", R.drawable.hoodie4)

    )
    private val shirts = listOf(
            Products("Black Shirt", "$10", R.drawable.shirt1),
            Products("white Shirt", "$20", R.drawable.shirt2),
            Products("Red Shirt", "$30", R.drawable.shirt3),
            Products("Dragon Shirt", "$40", R.drawable.shirt4),

            Products("Black Shirt", "$10", R.drawable.shirt1),
            Products("white Shirt", "$20", R.drawable.shirt2),
            Products("Red Shirt", "$30", R.drawable.shirt3),
            Products("Dragon Shirt", "$40", R.drawable.shirt4),

            Products("Black Shirt", "$10", R.drawable.shirt1),
            Products("white Shirt", "$20", R.drawable.shirt2),
            Products("Red Shirt", "$30", R.drawable.shirt3),
            Products("Dragon Shirt", "$40", R.drawable.shirt4),

            Products("Black Shirt", "$10", R.drawable.shirt1),
            Products("white Shirt", "$20", R.drawable.shirt2),
            Products("Red Shirt", "$30", R.drawable.shirt3),
            Products("Dragon Shirt", "$40", R.drawable.shirt4)

    )

    fun getProducts(category: String): List<Products> {
        return when (category) {
            "HATS" -> hats
            "SHIRTS" -> shirts
            "HOODIES" -> hoodies
            else -> listOf()
        }
    }
}
