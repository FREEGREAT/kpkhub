package com.example.kpkhub

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class LessonsActivity : AppCompatActivity() {
    private  lateinit var gRecyclerView: RecyclerView
    private  lateinit var gArrayList: ArrayList<Group>
    lateinit var gName: Array<String>
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lessons)

        gName = arrayOf(
            "p11",
            "p12",
            "p21",
            "p22",
            "p31",
            "p32",
            "p41",
            "p42",
            )

        gRecyclerView = findViewById(R.id.gView)
        gRecyclerView.setLayoutManager(GridLayoutManager(this, 2))
        gRecyclerView.setHasFixedSize(true)

        gArrayList = arrayListOf<Group>()

        setNewsdata();
    }

    private fun setNewsdata(){
        for(i in gName.indices){

            val group = Group(gName[i])
            gArrayList.add(group)
        }

        gRecyclerView.adapter = GroupAdapter(gArrayList)

    }

}