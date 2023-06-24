package com.example.kpkhub

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class LessonAdapter(private val groupList: ArrayList<Lesson>, val listener: LessonsActivity) : RecyclerView.Adapter<LessonAdapter.LessonViewHolder>() {
    inner class LessonViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val gName : Button = itemView.findViewById(R.id.nameGroup)

        init {
            gName.setOnClickListener{
                val position = adapterPosition
                listener.onClick(position)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LessonViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.lesson_item, parent,false)
        return LessonViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return groupList.size
    }

    override fun onBindViewHolder(holder: LessonViewHolder, position: Int) {
        holder.gName.text = groupList[position].groupName
    }
    interface LessonClickListener{
        fun onClick(position: Int)
    }
}