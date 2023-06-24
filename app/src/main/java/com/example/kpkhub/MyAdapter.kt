package com.example.kpkhub

import android.annotation.SuppressLint
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView



class MyAdapter(private  val btnList: ArrayList<Btn>): RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    private lateinit var btnListener : onBtnClickListener

    interface  onBtnClickListener{

        fun onBtnClick(position: Int)

    }

    fun setBtnClickListener(listener: onBtnClickListener){

        btnListener = listener

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val buttonView = LayoutInflater.from(parent.context).inflate(R.layout.btn_item,
        parent, false)
        return MyViewHolder(buttonView, btnListener)
    }


    override fun getItemCount(): Int {
        return btnList.size

    }

    override fun onBindViewHolder(holder: MyViewHolder,position: Int) {
        val currentBtn = btnList[position]

        holder.btnName.setText(currentBtn.Name)

    }

    class MyViewHolder(btnView: View, listener: onBtnClickListener) : RecyclerView.ViewHolder(btnView){
        val btnName : Button = itemView.findViewById(R.id.btn)

        init {
                btnName.setOnClickListener{
                listener.onBtnClick(adapterPosition)

            }
        }

    }
}