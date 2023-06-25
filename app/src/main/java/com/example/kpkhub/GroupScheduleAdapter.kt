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
        if(position == 0) {
            val currentItem = user[1]
            holder.day.text = "Monday"
            holder.firstLsn.text = currentItem.subj1
            holder.secondLsn.text = currentItem.subj2
            holder.thirdLsn.text = currentItem.subj3
            holder.fourthLsn.text = currentItem.subj4
            holder.fifthLsn.text = currentItem.subj5
            holder.sixthLsn.text = currentItem.subj6
        }
        else if(position == 1) {
            val currentItem = user[3]
            holder.day.text = "Tuesday"
            holder.firstLsn.text = currentItem.subj1
            holder.secondLsn.text = currentItem.subj2
            holder.thirdLsn.text = currentItem.subj3
            holder.fourthLsn.text = currentItem.subj4
            holder.fifthLsn.text = currentItem.subj5
            holder.sixthLsn.text = currentItem.subj6
        }
        else if(position == 2) {
            val currentItem = user[4]
            holder.day.text = "Wednesday"
            holder.firstLsn.text = currentItem.subj1
            holder.secondLsn.text = currentItem.subj2
            holder.thirdLsn.text = currentItem.subj3
            holder.fourthLsn.text = currentItem.subj4
            holder.fifthLsn.text = currentItem.subj5
            holder.sixthLsn.text = currentItem.subj6
        }
        else if(position == 3) {
            val currentItem = user[2]
            holder.day.text = "Thursday"
            holder.firstLsn.text = currentItem.subj1
            holder.secondLsn.text = currentItem.subj2
            holder.thirdLsn.text = currentItem.subj3
            holder.fourthLsn.text = currentItem.subj4
            holder.fifthLsn.text = currentItem.subj5
            holder.sixthLsn.text = currentItem.subj6
        }
        else if(position == 4) {
            val currentItem = user[0]
            holder.day.text = "Friday"
            holder.firstLsn.text = currentItem.subj1
            holder.secondLsn.text = currentItem.subj2
            holder.thirdLsn.text = currentItem.subj3
            holder.fourthLsn.text = currentItem.subj4
            holder.fifthLsn.text = currentItem.subj5
            holder.sixthLsn.text = currentItem.subj6
        }
    }

    override fun getItemCount(): Int {
        return user.size
    }

    public class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {

        val day : TextView = itemView.findViewById(R.id.tvday)
        val firstLsn : TextView = itemView.findViewById(R.id.subj1)
        val secondLsn : TextView = itemView.findViewById(R.id.subj2)
        val thirdLsn : TextView = itemView.findViewById(R.id.subj3)
        val fourthLsn : TextView = itemView.findViewById(R.id.subj4)
        val fifthLsn : TextView = itemView.findViewById(R.id.subj5)
        val sixthLsn : TextView = itemView.findViewById(R.id.subj6)
    }

}