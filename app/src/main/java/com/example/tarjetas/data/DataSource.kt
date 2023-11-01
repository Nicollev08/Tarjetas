package com.example.tarjetas.data

import com.example.tarjetas.R
import com.example.tarjetas.model.RecyclerData

class DataSource {

    fun loadAffirmations(): List<RecyclerData>{
        return listOf<RecyclerData>(
            RecyclerData(R.string.title1, R.drawable.ironman),
            RecyclerData(R.string.title2, R.drawable.hulk),
            RecyclerData(R.string.title3, R.drawable.capitan),
            RecyclerData(R.string.title4, R.drawable.spiderman),
            RecyclerData(R.string.title5, R.drawable.thor),

            RecyclerData(R.string.title1, R.drawable.ironman),
            RecyclerData(R.string.title2, R.drawable.hulk),
            RecyclerData(R.string.title3, R.drawable.capitan),
            RecyclerData(R.string.title4, R.drawable.spiderman),
            RecyclerData(R.string.title5, R.drawable.thor),

        )
    }
}