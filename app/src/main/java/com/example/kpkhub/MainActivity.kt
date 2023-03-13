package com.example.kpkhub

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.kpkhub.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId){
                R.id.home -> replaceFragment(Home())
                R.id.virtualLink -> {
                    val openVirtualURL = Intent(Intent.ACTION_VIEW, Uri.parse("https://dn.khnu.km.ua/kpk/default.aspx"))
                    startActivity(openVirtualURL)
                    true
                }
                R.id.shedule -> replaceFragment(Shedule())

                else ->{

                }
            }

            true
        }
        binding.bottomNavigationView.selectedItemId = R.id.home
    }

    private fun replaceFragment(fragment : Fragment){

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout, fragment)
        fragmentTransaction.commit()
    }
}