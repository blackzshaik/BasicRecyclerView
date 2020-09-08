package com.madtutorialz.basicrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
class AndroidVersionRecyclerAdapter(private val versionList:Array<String>, private val recyclerViewClickListener: RecyclerViewClickListener)
    :RecyclerView.Adapter<AndroidVersionRecyclerViewHolder>() {
        override fun onCreateViewHolder(
            parent: ViewGroup,
            viewType: Int
        ): AndroidVersionRecyclerViewHolder {

        return  AndroidVersionRecyclerViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.recycler_list_view,parent,false))
    }

    override fun getItemCount(): Int  = versionList.size

    override fun onBindViewHolder(holder:AndroidVersionRecyclerViewHolder, position: Int) {
        holder.bind(position,versionList[position],recyclerViewClickListener)
    }


}