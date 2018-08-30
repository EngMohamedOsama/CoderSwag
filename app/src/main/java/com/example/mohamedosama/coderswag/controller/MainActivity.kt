package com.example.mohamedosama.coderswag.controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.mohamedosama.coderswag.R
import com.example.mohamedosama.coderswag.model.Categories
import com.example.mohamedosama.coderswag.services.dataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adaptor: ArrayAdapter<Categories>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adaptor = ArrayAdapter(this, android.R.layout.simple_list_item_1, dataService.categories)

        categoryList.adapter = adaptor
    }
}
