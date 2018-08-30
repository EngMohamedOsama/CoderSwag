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
    val products = listOf(
            Products("Hat Black", "$10", "hat01"),
            Products("Hat Black", "$10", "hat01"),
            Products("Hat Black", "$10", "hat01"),
            Products("Hat Black", "$10", "hat01"),
            Products("Hat Black", "$10", "hat01"),
            Products("Hat Black", "$10", "hat01"),
            Products("Hat Black", "$10", "hat01"),
            Products("Hat Black", "$10", "hat01"),
            Products("Hat Black", "$10", "hat01")
    )
}