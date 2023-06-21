package com.example.kpkhub

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlin.coroutines.coroutineContext

class IntroSliderAdapter(private val introSlides: List<IntroSlider>) : RecyclerView.Adapter<IntroSliderAdapter.IntroSlideViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IntroSlideViewHolder {
        return IntroSlideViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.slide_item_container,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: IntroSlideViewHolder, position: Int) {
        holder.bind(introSlides[position])
    }

    override fun getItemCount(): Int {
        return introSlides.size
    }

    inner class IntroSlideViewHolder(view: View) : RecyclerView.ViewHolder(view){
        private val icon = view.findViewById<ImageView>(R.id.imageSlideIcon)
        private val textTitle = view.findViewById<TextView>(R.id.titleCard)
        private val textDescription = view.findViewById<TextView>(R.id.descCard)

        fun bind(introSlide: IntroSlider){
            icon.setImageResource(introSlide.icon)
            textTitle.text = introSlide.title
            textDescription.text = introSlide.desc
        }
    }
}