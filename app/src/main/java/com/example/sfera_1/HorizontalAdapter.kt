package com.example.sfera_1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.squareup.picasso.Picasso


class HorizontalAdapter(val list: ArrayList<Int>) :
    RecyclerView.Adapter<HorizontalAdapter.MyView>() {

    class MyView(view: View) : RecyclerView.ViewHolder(view) {



        var imageView: ImageView
        init {
            imageView = view
                .findViewById<ImageView>(R.id.image)



        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyView {
        val itemView: View = LayoutInflater
            .from(parent.context)
            .inflate(
                R.layout.recycler_item,
                parent,
                false
            )
        return MyView(itemView)
    }

    override fun onBindViewHolder(holder: MyView, position: Int) {
        val listData = list[position]


        //Glide.with(context).load(list.get(position)).into(holder.imageView)



        //Loading Image into view
        Picasso.get().load(listData).placeholder(R.mipmap.ic_launcher).into(holder.imageView)


    }

    override fun getItemCount(): Int {
        return list.size
    }


}