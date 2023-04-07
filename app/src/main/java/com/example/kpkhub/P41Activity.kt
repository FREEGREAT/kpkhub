package com.example.kpkhub

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.firestore.*

class P41Activity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var userArrayList: ArrayList<User>
    private lateinit var db: FirebaseFirestore

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_p41)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        userArrayList = arrayListOf()

        db = FirebaseFirestore.getInstance()

        db.collection("p41").get().addOnSuccessListener {
            if (!it.isEmpty) {
                for (data in it.documents) {
                    val user: User? = data.toObject(User::class.java)
                    if (user != null) {
                        userArrayList.add(user)
                    }
                }
                recyclerView.adapter = ScheduleAdapter(userArrayList)
            }
        }
            .addOnFailureListener {
                Toast.makeText(this, it.toString(), Toast.LENGTH_SHORT).show()
            }


    }
}