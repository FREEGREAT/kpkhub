package com.example.kpkhub

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AboutAdapter (private val aboutList: ArrayList<About>) : RecyclerView.Adapter<AboutAdapter.AboutHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AboutAdapter.AboutHolder {
        val AboutView = LayoutInflater.from(parent.context).inflate(
            R.layout.about_items,
            parent, false
        )
        return AboutAdapter.AboutHolder(AboutView)
    }

    override fun onBindViewHolder(holder: AboutAdapter.AboutHolder, position: Int) {
        val currentAbout = aboutList[position]

        holder.aboutTitle.text = currentAbout.Title
        holder.aboutDate.text = currentAbout.date
        holder.aboutTitleHistory.text = currentAbout.TitleHistory
        holder.aboutHistory.text = currentAbout.History
    }

    override fun getItemCount(): Int {
        return aboutList.size
    }

    class AboutHolder(aboutView: View) : RecyclerView.ViewHolder(aboutView) {
        val aboutTitle: TextView = itemView.findViewById(R.id.aboutTitle)
        val aboutDate: TextView = itemView.findViewById(R.id.aboutDesc)
        val aboutTitleHistory: TextView = itemView.findViewById(R.id.titleHistory)
        val aboutHistory: TextView = itemView.findViewById(R.id.historyCollage)

        //= itemView.findViewById(R.id.btn)
    }
}