package com.bhaveshsp.socialx.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bhaveshsp.socialx.R
import com.bhaveshsp.socialx.models.BestSeller

class BestSellerAdapter(var bestSellersList : ArrayList<BestSeller>): RecyclerView.Adapter<BestSellerAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val itemView = layoutInflater.inflate(R.layout.best_sellers_item_view_layout,parent,false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.name.text = bestSellersList[position].name
        holder.image.setImageResource(bestSellersList[position].image)

    }

    override fun getItemCount(): Int {
        return bestSellersList.size
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var image : ImageView = itemView.findViewById(R.id.bestSellerImage)
        var name : TextView = itemView.findViewById(R.id.bestSellerName)
    }
}