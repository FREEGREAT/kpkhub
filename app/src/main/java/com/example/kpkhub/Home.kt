package com.example.kpkhub

import android.app.ActivityOptions
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager as RecyclerViewLayoutManager

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"



/**
 * A simple [Fragment] subclass.
 * Use the [Home.newInstance] factory method to
 * create an instance of this fragment.
 */
class Home : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private  lateinit var btnRecyclerView: RecyclerView
    private  lateinit var btnArrayList: ArrayList<Btn>
    lateinit var btnName: Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?



    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)

    }



    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Home.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Home().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        Image click
        val imageView = view.findViewById<ImageView>(R.id.logo)
        var clickCount = 0
        var lastClickTime = 0L

        imageView.setOnClickListener{
            val now = System.currentTimeMillis()
            val elapsedTime = now - lastClickTime

            if(elapsedTime <= 1000){
                clickCount++
                if (clickCount == 3){
                    val intent = Intent(requireActivity(), BuyActivity::class.java)
                    startActivity(intent)

                    clickCount = 0
                    lastClickTime = 0
                }
            }else{
                clickCount = 1
                lastClickTime = now
            }
        }

        btnName = arrayOf(
            getString(R.string.news),
            getString(R.string.speciality),
            getString(R.string.courses),
            getString(R.string.campain),
            getString(R.string.about)
        )

        btnRecyclerView = view.findViewById(R.id.rcBTN)
        btnRecyclerView.layoutManager = LinearLayoutManager(context)
        btnRecyclerView.setHasFixedSize(true)

        btnArrayList = arrayListOf<Btn>()
        getBtndata()

    }

    private  fun getBtndata(){
        for (i in btnName.indices){

            val btn = Btn(btnName[i])
            btnArrayList.add(btn)
        }
        var adapter = MyAdapter(btnArrayList)
        btnRecyclerView.adapter = adapter

        adapter.setBtnClickListener(object : MyAdapter.onBtnClickListener{
            override fun onBtnClick(position: Int) {
                when (position){
                    0->{
                        val intent = Intent(requireActivity(), NewsActivity::class.java)
                        var b = ActivityOptions.makeSceneTransitionAnimation(requireActivity()).toBundle()
                        startActivity(intent, b);

                    }
                    1->{
                        val intent = Intent(requireActivity(), SpecialtyActivity::class.java)
                        var anim = ActivityOptions.makeSceneTransitionAnimation(requireActivity()).toBundle()
                        startActivity(intent, anim)
                    }
                    2->{
                        val intent = Intent(requireActivity(), KursyActivity::class.java)
                        var anim = ActivityOptions.makeSceneTransitionAnimation(requireActivity()).toBundle()
                        startActivity(intent, anim)
                    }
                    3->{
                        val intent = Intent(requireActivity(), KompanyActivity::class.java)
                        var anim = ActivityOptions.makeSceneTransitionAnimation(requireActivity()).toBundle()
                        startActivity(intent, anim)
                    }
                    4->{
                        val intent = Intent(requireActivity(), AboutActivity::class.java)
                        var anim = ActivityOptions.makeSceneTransitionAnimation(requireActivity()).toBundle()
                        startActivity(intent, anim)
                    }
                }
            }

        } )

    }




}