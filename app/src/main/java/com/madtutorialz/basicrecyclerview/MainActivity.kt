package com.madtutorialz.basicrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() ,RecyclerViewClickListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val androidVersionRecycler = findViewById<RecyclerView>(R.id.androidVersionRecycler)
        androidVersionRecycler.adapter = AndroidVersionRecyclerAdapter(resources.getStringArray(R.array.anroid_names),this)
    }

    override fun onClickName(position: Int, versionName: String) {
        Toast.makeText(applicationContext,"Clicked Android version $versionName at position = $position",Toast.LENGTH_SHORT).show()
    }
}