package com.example.gistingproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.gistingproject.adapter.GreenHouseAdapter
import com.example.gistingproject.databinding.ActivityMainBinding
import com.example.gistingproject.user.ListGreenHouse

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //data student berupa arraylist
        val listStudentData = arrayListOf(
            ListGreenHouse("Senso Suhu", R.drawable.iconsuhu),
            ListGreenHouse("Sensor Kelembapan",R.drawable.iconkelembapan),
            ListGreenHouse("Sensor PH", R.drawable.iconph),
            ListGreenHouse("Sensor Arah angin", R.drawable.iconarahangin),
            ListGreenHouse("Sensor Anemometer", R.drawable.iconanemometer),
            ListGreenHouse("Battery", R.drawable.iconbattery),
            ListGreenHouse("Sensor Curah Hujan", R.drawable.iconcurahhujan),
            ListGreenHouse("Sensor Soil Moisture", R.drawable.iconsoilmoisture),
            ListGreenHouse("Sensor tds", R.drawable.icontds),
            ListGreenHouse("Sensor Tekanan Udara", R.drawable.icontekananudara),
            ListGreenHouse("Tabel", R.drawable.icontabel),
            ListGreenHouse("Grafik", R.drawable.icongrafik)
        )

        //panggil class adapter lalu isi data berupa arraylist
        val adapterStudent = GreenHouseAdapter(listStudentData)

        //mengatur tata letak dari recyclerviewnya
        val lm = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
//        val gl = GridLayout(this)
        binding.rvGreenHouse.layoutManager = lm
        binding.rvGreenHouse.adapter = adapterStudent
    }
}