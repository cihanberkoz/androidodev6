package com.example.odev6

import android.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.odev6.databinding.FragmentAnasayfaBinding


class AnasayfaFragment : Fragment() {
    private lateinit var tasarim:FragmentAnasayfaBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim = FragmentAnasayfaBinding.inflate(inflater, container, false)


        tasarim.toolbarAnasayfa.title = "PULL&BEAR"
        tasarim.rv.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)

        val urunlerListesi = ArrayList<Urunler>()
        val u1 = Urunler(1,"Kısa hafif ceket",329.95,"kisahafifceket")
        val u2 = Urunler(2,"Katlanmış kollu suni süet ceket",419.95,"katlanmiskollu")
        val u3 = Urunler(3,"Yama cepli şişme ceket",479.95,"yamaceplisisme")
        val u4 = Urunler(4,"Kolej yamalı bomber ceket",579.95,"kolejyamali")
        val u5 = Urunler(5,"Kontrast fermuarlı blok renkli ceket",329.95,"kontrastfermuarli")
        val u6 = Urunler(6,"Cepli suni deri ince ceket",419.95,"ceplisunideri")
        val u7 = Urunler(7,"Pacific Republic şişme mont",479.95,"pacificrepublic")
        urunlerListesi.add(u1)
        urunlerListesi.add(u2)
        urunlerListesi.add(u3)
        urunlerListesi.add(u4)
        urunlerListesi.add(u5)
        urunlerListesi.add(u6)
        urunlerListesi.add(u7)

        val adapter = UrunlerAdapter(requireContext(),urunlerListesi)
        tasarim.rv.adapter = adapter


        return tasarim.root
    }
}