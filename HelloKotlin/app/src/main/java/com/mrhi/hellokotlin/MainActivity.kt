package com.mrhi.hellokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clickBtn(view: View) {
        //XML에서 지정한 id를 곧바로 변수명으로 사용함
        tv.setText("Nice to meet you. Kotlin!!")
    }

    //onResume메소드 오버라이드
    override fun onResume(){
        super.onResume()
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show()
    }
}
