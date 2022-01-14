package com.bhaveshsp.socialx.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bhaveshsp.socialx.R
import com.bhaveshsp.socialx.models.BestSeller
import com.bhaveshsp.socialx.models.Offer

class OffersAdapter(var offerList : ArrayList<Offer>): RecyclerView.Adapter<OffersAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var image : LinearLayout = itemView.findViewById(R.id.image)
        var name : TextView = itemView.findViewById(R.id.name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val itemView = layoutInflater.inflate(R.layout.offers_item_view_layout,parent,false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.name.text = offerList[position].name
        holder.image.setBackgroundResource(offerList[position].image)

    }

    override fun getItemCount(): Int {
        return offerList.size
    }

}