package com.example.kpkhub

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView

class GroupAdapter (private val gList: ArrayList<Group>): RecyclerView.Adapter<GroupAdapter.MyGroupHolder>() {

//    private lateinit var gListener : onBtnClickListener
//
//    interface  onBtnClickListener{
//
//        fun onBtnClick(position: Int)
//
//    }
//
//    fun setBtnClickListener(listener: onBtnClickListener){
//
//        gListener = listener
//
//    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GroupAdapter.MyGroupHolder {
        val gView = LayoutInflater.from(parent.context).inflate(R.layout.group_item,
        parent,false)
        return MyGroupHolder(gView)
    }

    override fun onBindViewHolder(holder: GroupAdapter.MyGroupHolder, position: Int) {
        val currentG = gList[position]
        holder.gName.setText(currentG.Lessons)
    }

    override fun getItemCount(): Int {
        return gList.size
    }

    class MyGroupHolder(gView: View) : RecyclerView.ViewHolder(gView){
        val gName : Button = itemView.findViewById(R.id.nameGroup)

        }
    }

