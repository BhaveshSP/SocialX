package com.bhaveshsp.socialx.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bhaveshsp.socialx.R
import com.bhaveshsp.socialx.models.Category
import com.bhaveshsp.socialx.models.Offer

class BackToCityAdapter(var categories : ArrayList<Category>) : RecyclerView.Adapter<BackToCityAdapter.ViewHolder>(){

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var image : ImageView = itemView.findViewById(R.id.categoryImage)
        var name : TextView = itemView.findViewById(R.id.categoryName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val itemView = layoutInflater.inflate(R.layout.category_item_view_layout,parent,false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.image.setImageResource(categories[position].image)
        holder.name.text = categories[position].name
    }

    override fun getItemCount(): Int {
        return categories.size
    }
}