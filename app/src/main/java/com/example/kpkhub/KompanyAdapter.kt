package com.example.kpkhub

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class KompanyAdapter (private val kompanyList: ArrayList<Kompany>) : RecyclerView.Adapter<KompanyAdapter.KompanyHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KompanyAdapter.KompanyHolder {
        val KompanyView = LayoutInflater.from(parent.context).inflate(
            R.layout.kompany_items,
            parent, false
        )
        return KompanyAdapter.KompanyHolder(KompanyView)
    }


    override fun onBindViewHolder(holder: KompanyAdapter.KompanyHolder, position: Int) {
        val currentKompany = kompanyList[position]
        holder.kompanyText.text = currentKompany.KompanyText

    }

    override fun getItemCount(): Int {
        return kompanyList.size
    }

    class KompanyHolder(kompanyView: View) : RecyclerView.ViewHolder(kompanyView) {
        val kompanyText: TextView = itemView.findViewById(R.id.komanyText)

    }
}