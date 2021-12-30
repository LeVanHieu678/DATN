package com.hieu.levan.videocalldatn.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hieu.levan.videocalldatn.databinding.ItemUserOnlineBinding
import com.hieu.levan.videocalldatn.signalingserver.model.UserInfo

class UserInfoAdapter : RecyclerView.Adapter<UserInfoAdapter.UserHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserHolder {
        val binding = ItemUserOnlineBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return UserHolder(binding)
    }

    override fun onBindViewHolder(holder: UserHolder, position: Int){
    }

    inner class UserHolder(binding: ItemUserOnlineBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(userInfo: UserInfo){
            with(itemView){

            }
        }

    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}