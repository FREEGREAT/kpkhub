package com.example.kpkhub

import android.content.Intent
import android.os.Bundle
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
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
                R.id.home -> replaceFragment(Home()){
                    val specialty: Button = findViewById(R.id.specialties)
                    specialty.setOnClickListener{
                        val intent = Intent(this, SpecialtyActivity::class.java)
                        startActivity(intent)
                    }
                }
                R.id.virtualLink -> replaceFragment(VirtualLink()){}
                R.id.shedule -> replaceFragment(Shedule()) {}
                else ->{

                }
            }

            true
        }
        binding.bottomNavigationView.selectedItemId = R.id.home


    }

    private fun replaceFragment(fragment: Fragment, function: () -> Unit){

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout, fragment)
        fragmentTransaction.commit()
    }
}