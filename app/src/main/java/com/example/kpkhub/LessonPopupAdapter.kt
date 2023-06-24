package com.example.kpkhub

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class LessonPopupAdapter(private val groupPopupList: ArrayList<LessonPopup>) :
    RecyclerView.Adapter<LessonPopupAdapter.GroupPopupViewHolder>() {

    private val mTextColor = 212121;

    class GroupPopupViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val subj1: TextView = itemView.findViewById(R.id.subj1)
        val subj2: TextView = itemView.findViewById(R.id.subj2)
        val subj3: TextView = itemView.findViewById(R.id.subj3)
        val subj4: TextView = itemView.findViewById(R.id.subj4)
        val subj5: TextView = itemView.findViewById(R.id.subj5)
        val subj6: TextView = itemView.findViewById(R.id.subj6)
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

    @SuppressLint("ResourceAsColor")
    override fun onBindViewHolder(holder: GroupPopupViewHolder, position: Int) {

        val currentItem = groupPopupList[position]

        holder.subj1.text = currentItem.subj1
        holder.subj2.text = currentItem.subj2
        holder.subj3.text = currentItem.subj3
        holder.subj4.text = currentItem.subj4
        holder.subj5.text = currentItem.subj5
        holder.subj6.text = currentItem.subj6
//        holder.day.text = day
    }
}