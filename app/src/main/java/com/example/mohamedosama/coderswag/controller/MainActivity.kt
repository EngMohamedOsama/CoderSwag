package com.example.mohamedosama.coderswag.controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.example.mohamedosama.coderswag.Adaptors.CategoryAdaptor
import com.example.mohamedosama.coderswag.R
import com.example.mohamedosama.coderswag.services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var categoryAdaptor: CategoryAdaptor
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        categoryAdaptor = CategoryAdaptor(this,DataService.categories)
        categoryList.adapter = categoryAdaptor
        categoryList.layoutManager = LinearLayoutManager(this)
    }
}
