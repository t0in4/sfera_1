package com.example.sfera_1

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    lateinit var textView: TextView
    lateinit var profilename: TextView
    lateinit var mRecyclerView: RecyclerView
    lateinit var mRecyclerView2: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewBinding()
        // first recycler view - start
        mRecyclerView?.layoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.HORIZONTAL, false)
        val dataset:ArrayList<Int> = ArrayList()
        dataset.add(R.drawable.one)
        dataset.add(R.drawable.two)
        dataset.add(R.drawable.three)
        dataset.add(R.drawable.four)

        mRecyclerView.adapter = HorizontalAdapter(dataset)
        // first recycler view - end

        // second recycler view - start
        mRecyclerView2?.layoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.HORIZONTAL, false)
        val dataset2:ArrayList<Int> = ArrayList()
        dataset2.add(R.drawable.one)
        dataset2.add(R.drawable.two)
        dataset2.add(R.drawable.three)
        dataset2.add(R.drawable.four)

        mRecyclerView2.adapter = HorizontalAdapter(dataset2)
        // second recycler view - end

    }

    fun viewBinding() {
        textView = findViewById(R.id.some_id)
        mRecyclerView = findViewById(R.id.horizontalrecyclerview)
        mRecyclerView2 = findViewById(R.id.horizontalrecyclerview2)
    }

}