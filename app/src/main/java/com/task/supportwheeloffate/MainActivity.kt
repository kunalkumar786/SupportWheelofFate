package com.task.supportwheeloffate

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import android.content.ClipData.Item
import android.widget.TextView
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val shift_schedule=findViewById<Button>(R.id.bt_alloted_shift)
        val tv_first_engineer=findViewById<TextView>(R.id.tv_first_engineer_value)
        val tv_second_engineer_value=findViewById<TextView>(R.id.tv_second_engineer_value)
        shift_schedule?.setOnClickListener {
            var list: MutableList<String> = mutableListOf<String>()
            list=anyItem()
            tv_first_engineer.setText(list.get(0))
            tv_second_engineer_value.setText(list.get(1))
            shift_schedule?.isClickable=false
        }

    }

    fun anyItem(): MutableList<String> {

        var list: MutableList<String> = mutableListOf<String>()
        list.add("Bogdan");
        list.add("Tung");
        list.add("Bala");
        list.add("Nazih");
        list.add("Huteri");
        list.add("Aldy");
        list.add("Ankur");
        list.add("Chinh");

        var randomGenerator = Random
var list_choosed : MutableList<String> = mutableListOf<String>()
        for(i in 1..2) {
            val index = randomGenerator.nextInt(list.size)

           var it = list.get(index)
            Log.e("Managers==>",""+it);
            list_choosed.add(it)
        }
       // println("Managers choice this week" + it + "our recommendation to you")
        return list_choosed;
    }
}


