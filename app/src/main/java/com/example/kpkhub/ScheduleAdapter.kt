package com.example.kpkhub

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ScheduleAdapter (private val user: ArrayList<User>) : RecyclerView.Adapter<ScheduleAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ScheduleAdapter.MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item,
            parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ScheduleAdapter.MyViewHolder, position: Int) {
        val currentItem = user[position]

        holder.day.text = currentItem.day
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

        val day : TextView = itemView.findViewById(R.id.tvday)
        val firstLsn : TextView = itemView.findViewById(R.id.tvfirstlsn)
        val secondLsn : TextView = itemView.findViewById(R.id.tvsecondlsn)
        val thirdLsn : TextView = itemView.findViewById(R.id.tvthirdlsn)
        val fourthLsn : TextView = itemView.findViewById(R.id.tvfourthlsn)
        val fifthLsn : TextView = itemView.findViewById(R.id.tvfifthlsn)
        val sixthLsn : TextView = itemView.findViewById(R.id.tvsixthlsn)
    }

}