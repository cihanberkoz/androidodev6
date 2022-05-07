package com.example.odev6

import java.io.Serializable

data class Urunler(var urunId:Int,var urunAdi:String,var urunFiyat:Double,var urunResimAdi:String) : Serializable {
}