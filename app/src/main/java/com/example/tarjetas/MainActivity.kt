package com.example.tarjetas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tarjetas.adapter.RecyclerViewAdapter
import com.example.tarjetas.data.DataSource
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var dataSource: DataSource
    private lateinit var adapter: RecyclerViewAdapter ///////////AGREGADO

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myDataset = DataSource(this).loadAffirmations()
        val recyclerView = findViewById<RecyclerView>(R.id.idCourseRV)

       val layoutManager = GridLayoutManager(this, 2)

        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = RecyclerViewAdapter(this, myDataset)
        recyclerView.setHasFixedSize(true)

        ////////////////agregADO

        val dataSource = DataSource(this)
        val adapter = RecyclerViewAdapter(this, myDataset)

        recyclerView.adapter = adapter

        val searchEditText = findViewById<TextInputEditText>(R.id.tietBuscar)
        searchEditText.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}

            override fun afterTextChanged(s: Editable?) {
                val query = s.toString()
                val filteredData = dataSource.search(query)
                adapter.updateData(filteredData)
            }
        })
    }

    }
