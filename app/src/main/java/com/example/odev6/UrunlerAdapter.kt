package com.example.odev6

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.odev6.databinding.CardTasarimBinding
import com.google.android.material.snackbar.Snackbar

class UrunlerAdapter(var mContext:Context,var urunlerListesi:List<Urunler>) : RecyclerView.Adapter<UrunlerAdapter.CardTasarimTutucu>() {
    inner class CardTasarimTutucu(tasarim:CardTasarimBinding) : RecyclerView.ViewHolder(tasarim.root){
        var tasarim:CardTasarimBinding
        init {
            this.tasarim = tasarim
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val layoutInflater = LayoutInflater.from(mContext)
        val tasarim = CardTasarimBinding.inflate(layoutInflater,parent,false)
        return CardTasarimTutucu(tasarim)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val urun = urunlerListesi.get(position)
        val t = holder.tasarim

        t.imageViewUrunResim.setImageResource(
            mContext.resources.getIdentifier(urun.urunResimAdi,"drawable",mContext.packageName))

        t.textViewUrunAdi.text = urun.urunAdi
        t.textViewUrunFiyat.text ="${urun.urunFiyat} TL"

        t.imageViewFavori.setOnClickListener {
            Snackbar.make(it,"${urun.urunAdi} favorilere eklendi",Snackbar.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return urunlerListesi.size
    }
}