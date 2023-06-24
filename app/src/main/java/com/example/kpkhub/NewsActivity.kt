package com.example.kpkhub

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class NewsActivity : AppCompatActivity() {

    private  lateinit var newsRecyclerView: RecyclerView
    private  lateinit var newsArrayList: ArrayList<News>
    lateinit var newsTitle: Array<String>
    lateinit var newsDate: Array<String>
    lateinit var newsImg: Array<Int>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_news)

        newsImg = arrayOf(
            R.drawable.news1,
            R.drawable.news2,
            R.drawable.news3,
            R.drawable.news4,
            R.drawable.news5,
            R.drawable.news6,
            R.drawable.news7,
            R.drawable.news8,
            )
        newsTitle = arrayOf(
            getString(R.string.nTitle1),
            getString(R.string.nTitle2),
            getString(R.string.nTitle3),
            getString(R.string.nTitle4),
            getString(R.string.nTitle5),
            getString(R.string.nTitle6),
            getString(R.string.nTitle7),
            getString(R.string.nTitle8),
            )
        newsDate = arrayOf(
            getString(R.string.nDate1),
            getString(R.string.nDate2),
            getString(R.string.nDate3),
            getString(R.string.nDate4),
            getString(R.string.nDate5),
            getString(R.string.nDate6),
            getString(R.string.nDate7),
            getString(R.string.nDate8),
            )
        newsRecyclerView = findViewById(R.id.rcNews)
        newsRecyclerView.layoutManager = LinearLayoutManager(this)
        newsRecyclerView.setHasFixedSize(true)

        newsArrayList = arrayListOf<News>()
        setNewsdata()
    }

    private fun setNewsdata(){
        for(i in newsImg.indices){
            val news = News(newsTitle[i],newsDate[i],newsImg[i])
            newsArrayList.add(news)
        }
        newsRecyclerView.adapter = NewsAdapter(newsArrayList)
    }




}