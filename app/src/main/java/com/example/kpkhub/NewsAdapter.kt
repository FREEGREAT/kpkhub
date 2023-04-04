package com.example.kpkhub

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NewsAdapter(private val newsList: ArrayList<News>) : RecyclerView.Adapter<NewsAdapter.NewsHolder>(){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsAdapter.NewsHolder {
        val NewsView = LayoutInflater.from(parent.context).inflate(R.layout.news_item,
            parent, false)
        return NewsAdapter.NewsHolder(NewsView)
    }

    override fun onBindViewHolder(holder: NewsAdapter.NewsHolder, position: Int) {
        val currentNews = newsList[position]

        holder.newsTitle.text = currentNews.Title
        holder.newsDate.text = currentNews.date
        holder.newsImg.setImageResource(currentNews.Img)
    }

    override fun getItemCount(): Int {
        return  newsList.size
    }

    class NewsHolder(newsView: View) : RecyclerView.ViewHolder(newsView) {
        val newsTitle : TextView = itemView.findViewById(R.id.title)
        val newsDate : TextView = itemView.findViewById(R.id.date)
        val newsImg : ImageView = itemView.findViewById(R.id.img)


    }


}