package com.madtutorialz.basicrecyclerview

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AndroidVersionRecyclerViewHolder(view: View): RecyclerView.ViewHolder(view){
    val nameTextView = view.findViewById<TextView>(R.id.versionNames)

    fun bind(position:Int,versionName:String,recyclerViewClickListener: RecyclerViewClickListener){
        nameTextView.text = versionName
        nameTextView.setOnClickListener {
            recyclerViewClickListener.onClickName(position,versionName)
        }
    }
}