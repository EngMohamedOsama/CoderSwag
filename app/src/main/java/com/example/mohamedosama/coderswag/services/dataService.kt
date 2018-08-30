package com.example.mohamedosama.coderswag.services

import com.example.mohamedosama.coderswag.model.Categories
import com.example.mohamedosama.coderswag.model.Products

object dataService {
    val categories = listOf(
            Categories("SHIRTS","shirtimage"),
            Categories("HOODIES","hoodImage"),
            Categories("HATS","hatimage"),
            Categories("DIGITAL","digitalgoodsimage")
    )
    val products = listOf(
            Products("Hat Black","$10","hat01"),
            Products("Hat Black","$10","hat01"),
            Products("Hat Black","$10","hat01"),
            Products("Hat Black","$10","hat01"),
            Products("Hat Black","$10","hat01"),
            Products("Hat Black","$10","hat01"),
            Products("Hat Black","$10","hat01"),
            Products("Hat Black","$10","hat01"),
            Products("Hat Black","$10","hat01")
    )
}