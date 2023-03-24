package com.example.kpkhub

import android.os.Bundle
import android.view.View
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.get
import androidx.viewpager2.widget.ViewPager2

class SpecialtyActivity : AppCompatActivity(){

    private val introSliderAdapter = IntroSliderAdapter(
        listOf(
            IntroSlider(
                "Облік і оподаткування»/ ОПП «Облік і оподаткування»",
                "«Інформація про спеціальність Освітньо-професійний ступінь − фаховий молодший бакалавр. Освітньо-професійна програма – Облік і оподаткування. Спеціальність – 071 Облік і оподаткування. Галузь знань – 07 Управління та адміністрування. Освітня кваліфікація – фаховий молодший бакалавр з обліку і оподаткування.",
                "01"
            ),
            IntroSlider(
                "«Фінанси, банківська справа та страхування» / ОПП «Фінанси, банківська справа та страхування»",
                "«Інформація про спеціальність Освітньо-професійний ступінь − фаховий молодший бакалавр. Освітньо-професійна програма – Облік і оподаткування. Спеціальність – 071 Облік і оподаткування. Галузь знань – 07 Управління та адміністрування. Освітня кваліфікація – фаховий молодший бакалавр з обліку і оподаткування.",
                "02"
            ),
            IntroSlider(
                "«Менеджмент» / ОПП «Менеджмент»",
                "«Інформація про спеціальність Освітньо-професійний ступінь − фаховий молодший бакалавр. Освітньо-професійна програма – Облік і оподаткування. Спеціальність – 071 Облік і оподаткування. Галузь знань – 07 Управління та адміністрування. Освітня кваліфікація – фаховий молодший бакалавр з обліку і оподаткування.",
                "03"
            )

        )
    )

    override fun onCreate( savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_specialty)
        val intro = findViewById<ViewPager2>(R.id.introSliderViewPager)
        intro.adapter = introSliderAdapter
        setupIndicators()
        setCurrentIndicator(0)
    }
    private fun setupIndicators(){
        val indicators = arrayOfNulls<ImageView>(introSliderAdapter.itemCount)
        val layoutParams: LinearLayout.LayoutParams = LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT)
        layoutParams.setMargins(8, 0, 8, 0)
        for (i in indicators.indices){
            val indicator = findViewById<LinearLayout>(R.id.indicatorsContainer)
            indicators[i] = ImageView(applicationContext)
            indicators[i].apply {
                this?.setImageDrawable(
                    ContextCompat.getDrawable(
                        applicationContext,
                        R.drawable.indicator_inactive
                    )
                )
                this?.layoutParams = layoutParams
            }
            indicator.addView(indicators[i])
        }
    }
    private fun setCurrentIndicator(index: Int){
        val indicator = findViewById<LinearLayout>(R.id.indicatorsContainer)
        val childCount = indicator.childCount
        for(i in 0 until childCount){
            if (indicator[i] is ImageView) {
                val imageView = indicator[i] as ImageView
                if (i == index) {
                    imageView.setImageDrawable(
                        ContextCompat.getDrawable(
                            applicationContext,
                            R.drawable.indicator_active
                        )
                    )
                } else {
                    imageView.setImageDrawable(
                        ContextCompat.getDrawable(
                            applicationContext,
                            R.drawable.indicator_inactive
                        )
                    )
                }
            }
        }
    }
}