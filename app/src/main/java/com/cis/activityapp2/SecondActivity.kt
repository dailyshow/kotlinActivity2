package com.cis.activityapp2

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.app2SecondTv
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val data1 = intent.getIntExtra("data1",0)
        val data2 = intent.getDoubleExtra("data2", 0.0)
        app2SecondTv.text = "받은 data1 값 : ${data1}\n"
        app2SecondTv.append("받은 data2 값 : ${data2}")

        app2SecondBtn.setOnClickListener { view ->
            val intent2 = Intent()
            intent2.putExtra("value1", 22)
            intent2.putExtra("value2", 22.22)

            setResult(Activity.RESULT_OK, intent2)
            finish()
        }
    }

}
