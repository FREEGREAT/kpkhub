package com.example.kpkhub

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.firestore.FirebaseFirestore

class GroupScheduleActivity : AppCompatActivity() {

    private lateinit var recyclerViewSchedule: RecyclerView
    private lateinit var userArrayList: ArrayList<User>
    private lateinit var db: FirebaseFirestore

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_group_schedule)

        recyclerViewSchedule = findViewById(R.id.recyclerViewSchedule)
        recyclerViewSchedule.layoutManager = LinearLayoutManager(this)
        val root : String = intent.getStringExtra("root") ?: "no group"

        userArrayList = arrayListOf()

        db = FirebaseFirestore.getInstance()

        db.collection("kpfk/lessons/subjects/$root/weeks").get().addOnSuccessListener {
            if (!it.isEmpty) {
                for (data in it.documents) {
                    val user: User? = data.toObject(User::class.java)
                    if (user != null) {
                        userArrayList.add(user)
                    }
                }
                recyclerViewSchedule.adapter = GroupScheduleAdapter(userArrayList)
            }
        }
            .addOnFailureListener {
                Toast.makeText(this, it.toString(), Toast.LENGTH_SHORT).show()
            }
    }
}