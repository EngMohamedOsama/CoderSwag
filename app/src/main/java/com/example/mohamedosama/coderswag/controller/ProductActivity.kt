package com.example.mohamedosama.coderswag.controller

import android.content.res.Configuration
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import com.example.mohamedosama.coderswag.Adaptors.ProductAdaptor
import com.example.mohamedosama.coderswag.R
import com.example.mohamedosama.coderswag.Utils.CATEGORY_NAME
import com.example.mohamedosama.coderswag.services.DataService
import kotlinx.android.synthetic.main.activity_product.*

class ProductActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)
        val categoryName: String = intent.getStringExtra(CATEGORY_NAME)
        val productAdapter = ProductAdaptor(this, DataService.getProducts(categoryName))

        var spanCount = 2

        val orientation = resources.configuration.orientation
        val screenSize = resources.configuration.screenWidthDp

        if (orientation == Configuration.ORIENTATION_LANDSCAPE || screenSize > 720)
            spanCount = 3

        productList.layoutManager = GridLayoutManager(this, spanCount)
        productList.adapter = productAdapter
    }
}
