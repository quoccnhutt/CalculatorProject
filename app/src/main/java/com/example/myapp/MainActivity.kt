package com.example.myapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnCong.setOnClickListener {
            var sothu1 :Int = (num1.text.toString().toInt())
            var sothu2 :Int = (num2.text.toString().toInt())
            var kq = sothu1 + sothu2
            ketqua.text = kq.toString()
        }
        btnTru.setOnClickListener {
            var sothu1 :Int = (num1.text.toString().toInt())
            var sothu2 :Int = (num2.text.toString().toInt())
            var kq = sothu1 - sothu2
            ketqua.text = kq.toString()
        }
        btnNhan.setOnClickListener {
            var sothu1 :Int = (num1.text.toString().toInt())
            var sothu2 :Int = (num2.text.toString().toInt())
            var kq = sothu1 * sothu2
            ketqua.text = kq.toString()
        }
        btnChia.setOnClickListener {
            var sothu1 :Int = (num1.text.toString().toInt())
            var sothu2 :Int = (num2.text.toString().toInt())

            var kq = sothu1 / sothu2
            ketqua.text = kq.toString()
        }
    }
}