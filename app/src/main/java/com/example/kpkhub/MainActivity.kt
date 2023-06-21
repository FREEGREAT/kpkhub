package com.example.kpkhub

import android.content.Intent
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.Window
import android.view.WindowManager
import android.view.WindowManager.LayoutParams
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.fragment.app.Fragment
import com.example.kpkhub.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId){
                R.id.home -> {
                    replaceFragment(Home()){}
                }
                R.id.virtualLink -> {
                    replaceFragment(VirtualLink()){}
                }
                R.id.shedule -> {
                    showSheduleDialod()
                }
                else ->{

                }
            }
            true
        }
        binding.bottomNavigationView.selectedItemId = R.id.home

    }
    private fun showSheduleDialod() {
        val builder = AlertDialog.Builder(this)
        val customView = LayoutInflater.from(this).inflate(R.layout.fragment_shedule, null)
        builder.setView(customView)

        val dialog = builder.create()
        dialog.show()

        val lp = WindowManager.LayoutParams()
        lp.copyFrom(dialog.window?.attributes)
        lp.width = 650;
        lp.height = 390;
        lp.x = 150;
        lp.y = 800;
        dialog.window?.attributes = lp

        val lesson = customView.findViewById<Button>(R.id.lesson)
        val bells = customView.findViewById<Button>(R.id.bells)

        lesson.setOnClickListener {
            val intent = Intent(this, LessonsActivity::class.java)
            startActivity(intent)
        }
        bells.setOnClickListener {
            val intent = Intent(this, BellsSchedule::class.java)
            startActivity(intent)
        }
    }

    private fun replaceFragment(fragment: Fragment, function: () -> Unit){

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout, fragment)
        fragmentTransaction.commit()

        val lesson = findViewById<Button>(R.id.lesson)
    }
}

