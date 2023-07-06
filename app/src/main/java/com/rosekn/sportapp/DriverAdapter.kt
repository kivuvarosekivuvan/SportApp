package com.rosekn.sportapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rosekn.sportapp.databinding.DriverDataBinding
import com.squareup.picasso.Picasso

class DriverAdapter(val driverData:List<DriverData>):
    RecyclerView.Adapter<DriverAdapter.DriverViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DriverViewHolder {
        val binding = DriverDataBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DriverViewHolder(binding)
    }

    override fun onBindViewHolder(holder: DriverViewHolder, position: Int) {
        val currentDriver = driverData.get(position)
        holder.bind(currentDriver)


    }


    override fun getItemCount(): Int {
        return driverData.size

    }
    inner class DriverViewHolder(val binding: DriverDataBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(driver:DriverData){
            binding.tvName.text = driver.name
            binding.tvTeam.text = driver.team
            binding.tvpoints.text = driver.points.toString()
            Picasso
                .get()
                .load(driver.image)
                .into(binding.imageView2)

        }
    }

    }



