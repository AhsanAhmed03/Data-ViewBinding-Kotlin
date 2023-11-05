package com.example.data.view.binding.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.data.view.binding.Language
import com.example.data.view.binding.R
import com.example.data.view.binding.adapter.ViewBindingAdapter
import com.example.data.view.binding.databinding.FragmentViewBindingBinding
import com.example.data.view.binding.databinding.LayoutViewBindingAdapterBinding

class ViewBindingFragment : Fragment() {

    private var _binding: FragmentViewBindingBinding? = null
    private val binding get() = _binding!!

    private lateinit var adapterViewBinding: ViewBindingAdapter
    private lateinit var list: List<Language>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentViewBindingBinding.inflate(layoutInflater, container, false)

        languages()

        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(requireContext())
        binding.recyclerViewBinding.layoutManager = layoutManager
        adapterViewBinding = ViewBindingAdapter(list)
        binding.recyclerViewBinding.adapter = adapterViewBinding

        return binding.root
    }

    private fun languages() {
        list = listOf(
            Language("JAVA", "1.5: Years"),
            Language("Kotlin", "5: months"),
            Language("CPP", "2: months")
        )
    }
}