package com.example.data.view.binding.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.data.view.binding.Language
import com.example.data.view.binding.databinding.LayoutViewBindingAdapterBinding

class ViewBindingAdapter(var languageList: List<Language>) :
    RecyclerView.Adapter<ViewBindingAdapter.BindingViewHolder>() {

    inner class BindingViewHolder(private val bindingAdapter: LayoutViewBindingAdapterBinding) :
        RecyclerView.ViewHolder(bindingAdapter.root) {
            fun bind(language: Language){
                bindingAdapter.txtLanguageName.setText(language.name)
                bindingAdapter.txtLanguageExperiance.setText(language.exp)
            }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BindingViewHolder {
        val binding = LayoutViewBindingAdapterBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return BindingViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return languageList.size
    }

    override fun onBindViewHolder(holder: BindingViewHolder, position: Int) {
        val language_item = languageList[position]
        holder.bind(language_item)
    }
}