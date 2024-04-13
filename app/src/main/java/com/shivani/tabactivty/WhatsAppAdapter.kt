package com.shivani.tabactivty

import android.text.Layout
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class WhatsAppAdapter (var recyclerView: MainActivity):RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    inner class ViewHolderClass(var view: View) : RecyclerView.ViewHolder(view) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ViewHolderClass(view = View())
    }

    override fun getItemCount(): Int {
        return 0
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

    }
}