package com.example.kpkhub

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class LessonPopupAdapter(private val groupPopupList: ArrayList<String>) :
    RecyclerView.Adapter<LessonPopupAdapter.GroupPopupViewHolder>() {

    class GroupPopupViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val subject: TextView = itemView.findViewById(R.id.subject)
//        val day: TextView = itemView.findViewById(R.id.day)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GroupPopupViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.lesson_item_popup, parent, false)
        return GroupPopupViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return groupPopupList.size
    }

    override fun onBindViewHolder(holder: GroupPopupViewHolder, position: Int) {
        holder.subject.text = groupPopupList[position]
//        holder.day.text = groupPopupList[position]
    }
}