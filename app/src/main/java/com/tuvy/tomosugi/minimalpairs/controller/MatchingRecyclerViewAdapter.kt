package com.tuvy.tomosugi.minimalpairs.controller

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tuvy.tomosugi.minimalpairs.R
import com.tuvy.tomosugi.minimalpairs.view.PartnerViewHolder

/**
 * Created by tomosugi on 2017/09/12.
 */

class MatchingRecyclerViewAdapter(private val data: String) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflate: View
        inflate = LayoutInflater.from(parent.context).inflate(R.layout.partner, parent, false)
        return PartnerViewHolder(inflate)
    }

    override fun getItemViewType(position: Int): Int {
        super.getItemViewType(position)
        return position
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        holder as PartnerViewHolder
        //holder.idView = data[].id
    }

    override fun getItemCount(): Int {
        return 1
    }
}
