package com.tonussi.orgs.ui.activity

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tonussi.orgs.R
import com.tonussi.orgs.model.Product
import com.tonussi.orgs.ui.recycleview.adapter.ListProductAdapter
import java.math.BigDecimal


class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ListProductAdapter(context = this, products = listOf(
            Product(
                name = "test",
                description = "teste description",
                price = BigDecimal("19.99")
            ),
            Product(
                name = "test2",
                description = "teste description2",
                price = BigDecimal("29.99")
            ),
            Product(
                name = "test3",
                description = "teste description3",
                price = BigDecimal("39.99")
            ),
        ))
        //Pode ser setado o  layoutmanager por aqui ou no arquivo de layout => recyclerView.layoutManager = LinearLayoutManager(this)
    }
}