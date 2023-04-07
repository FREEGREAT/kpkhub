package com.example.kpkhub

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class LessonsActivity : AppCompatActivity() {
    private  lateinit var gRecyclerView: RecyclerView
    private  lateinit var gArrayList: ArrayList<Group>
    lateinit var gName: Array<String>

    lateinit var button : Button
    lateinit var button3 : Button

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

        button = findViewById(R.id.button)
        button3 = findViewById(R.id.button3)

        button.setOnClickListener {
            var i = Intent(this, P41Activity::class.java)
            startActivity(i)
            finish()
        }

        button3.setOnClickListener {
            var i = Intent(this, P42Activity::class.java)
            startActivity(i)
            finish()
        }
    }

    private fun setNewsdata(){
        for(i in gName.indices){

            val group = Group(gName[i])
            gArrayList.add(group)
        }

        gRecyclerView.adapter = GroupAdapter(gArrayList)

    }

}