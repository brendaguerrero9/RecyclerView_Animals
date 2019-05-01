package com.example.recyclerview_animal

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.animal_list_item.view.*

class AnimalAdapter (val items : ArrayList<String>, val context: Context) : RecyclerView.Adapter<ViewHolder>() {

    //Numero de aniamles en la lista
    override fun getItemCount(): Int {
        return items.size
    }

    //Inflates la vista View
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.animal_list_item,p0,false))
    }

    //Binds cada animal en el array a una view
    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        p0?.tvAnimalType?.text = items.get(p1)
    }

}

class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
    //Tiene el textview que va a agregar a los animales
    val tvAnimalType = view.tv_animal_type
}