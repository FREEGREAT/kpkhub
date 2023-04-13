package com.example.kpkhub

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList


class LessonsActivity : AppCompatActivity() {
    private  lateinit var recyclerView: RecyclerView
    private lateinit var groupList: ArrayList<Lesson>
    private var db = Firebase.firestore

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lessons)

        recyclerView = findViewById(R.id.groupRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        groupList = arrayListOf()

        db = FirebaseFirestore.getInstance()

        db.collection("Groups").get().addOnSuccessListener {
            if(!it.isEmpty){
                for(data in it.documents){
                    val group:Lesson? = data.toObject(Lesson::class.java)
                    if (group != null) {
                        groupList.add(group)
                    }
                }
                recyclerView.adapter = LessonAdapter(groupList, this)
            }
        }

            .addOnFailureListener{
                Toast.makeText(this, it.toString(), Toast.LENGTH_SHORT).show()
            }
    }
     fun onClick(position: Int) {
        when(position){
            0 -> showPopupGroups("P-41")
            1 -> showPopupGroups("P-42")
        }
    }

    @SuppressLint("MissingInflatedId")
    private fun showPopupGroups(group:String){
        val builder = AlertDialog.Builder(this)
        val customViewGroup = LayoutInflater.from(this).inflate(R.layout.popup_lesson, null)
        builder.setView(customViewGroup)

        val popupTeacher = builder.create()
        popupTeacher.show()

        recyclerView = customViewGroup.findViewById(R.id.groupPopupRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        db = FirebaseFirestore.getInstance()

        db.collection("groups").document(group).collection(
            SimpleDateFormat("EEEE", Locale.ENGLISH).format(
                Date().time
            ))
            .document("subjects").get().addOnSuccessListener {
                recyclerView.adapter = LessonPopupAdapter((it.data?.get("subject") as ArrayList<String>))
            }

            .addOnFailureListener{
                Toast.makeText(this, it.toString(), Toast.LENGTH_SHORT).show()
            }

    }
}
