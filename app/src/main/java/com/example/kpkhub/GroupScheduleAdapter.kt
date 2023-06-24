package com.example.kpkhub

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class GroupScheduleAdapter (private val user: ArrayList<User>) : RecyclerView.Adapter<GroupScheduleAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GroupScheduleAdapter.MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.group_schedule_item_list,
            parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: GroupScheduleAdapter.MyViewHolder, position: Int) {
        val currentItem = user[position]

//        holder.day.text = currentItem.day
        holder.firstLsn.text = currentItem.firstLsn
        holder.secondLsn.text = currentItem.secondLsn
        holder.thirdLsn.text = currentItem.thirdLsn
        holder.fourthLsn.text = currentItem.fourthLsn
        holder.fifthLsn.text = currentItem.fifthLsn
        holder.sixthLsn.text = currentItem.sixthLsn
    }

    override fun getItemCount(): Int {
        return user.size
    }

    public class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {

//        val day : TextView = itemView.findViewById(R.id.tvday)
        val firstLsn : TextView = itemView.findViewById(R.id.subj1)
        val secondLsn : TextView = itemView.findViewById(R.id.subj2)
        val thirdLsn : TextView = itemView.findViewById(R.id.subj3)
        val fourthLsn : TextView = itemView.findViewById(R.id.subj4)
        val fifthLsn : TextView = itemView.findViewById(R.id.subj5)
        val sixthLsn : TextView = itemView.findViewById(R.id.subj6)
    }

}