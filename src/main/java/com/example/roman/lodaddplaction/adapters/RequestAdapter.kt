package com.example.roman.lodaddplaction.adapters

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.roman.lodaddplaction.R
import com.example.roman.lodaddplaction.models.RequestDetailsActivity
import com.example.roman.lodaddplaction.models.RequestModel
import kotlinx.android.synthetic.main.item_request.view.*

class RequestAdapter(
        private val context: Context, private val list: List<RequestModel>
): RecyclerView.Adapter<RequestAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
            ViewHolder(LayoutInflater.from(context)
                .inflate(R.layout.item_request, parent, false))

    override fun getItemCount() = list.size
//
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvRequestTilte.text = list[position].title
        holder.tvTags.text = list[position].tags.joinToString(", ")
        Glide.with(context)
                .load(list[position].user?.avaUrl)
                .into(holder.ivAvatar)
        holder.container.setOnClickListener {
            Intent(context, RequestDetailsActivity::class.java).apply {
                putExtra("data", list[position])
                context.startActivity(this)
            }

        }

    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)  {
        val ivAvatar = itemView.iv_avatar
        val tvRequestTilte = itemView.tv_request_title
        val tvTags = itemView.tv_tags
        val container = itemView.container_request
    }
}