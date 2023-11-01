package com.example.tarjetas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tarjetas.adapter.RecyclerViewAdapter
import com.example.tarjetas.data.DataSource

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var dataSource: DataSource

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myDataset = DataSource().loadAffirmations()
        val recyclerView = findViewById<RecyclerView>(R.id.idCourseRV)

        //Linear sin columnas
      //  val layoutManager = LinearLayoutManager(this)

        //DOS COLUMNAS

       val layoutManager = GridLayoutManager(this, 2)

        //lINEAR PARA HACER RECYCLER HORIZONTAL

       // val layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)

        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = RecyclerViewAdapter(this, myDataset)
        recyclerView.setHasFixedSize(true)

    }
}