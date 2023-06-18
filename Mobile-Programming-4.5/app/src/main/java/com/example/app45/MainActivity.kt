package com.example.app45

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: ItemAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val items = generateDummyItems() // Fungsi untuk menghasilkan item dummy
        adapter = ItemAdapter(items)
        recyclerView.adapter = adapter
    }

    private fun generateDummyItems(): List<item> {
        val items = ArrayList<item>()
        items.add(item(getString(R.string.sepeda), getString(R.string.desk_sepeda)))
        items.add(item(getString(R.string.motor),getString((R.string.desk_motor))))
        items.add(item(getString(R.string.mobil), getString(R.string.desk_mobil)))

        return items
    }


}