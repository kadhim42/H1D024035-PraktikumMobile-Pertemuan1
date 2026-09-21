package com.example.pertemuan1.data.dummy

import com.example.pertemuan1.data.model.Category
import com.example.pertemuan1.data.model.Product

object DummyData {
    val categories = listOf(
        Category(id = 1, name = "Makanan", description = "Aneka makanan lokal", products_count = 5),
        Category(id = 2, name = "Minuman", description = "Minuman Segar", products_count = 5),
        Category(id = 3, name = "Kerajinan", description = "Kerajinan Tangan", products_count = 5)
    )
    val products = listOf(
        //makanan
        Product(1, 1, categories[0], "Kripik Singkong", "Kripik gurih", 15000.0, 50, "dummy_produuct"),
        Product(2, 1, categories[0], "Mendoan", "Mendoan asli Purbalingga", 20000.0, 30, "dummy_produuct"),
        Product(3, 1, categories[0], "Sale Pisang", "Sale pisang manis", 25000.0, 20, "dummy_produuct"),
        Product(4, 1, categories[0], "Getuk Goreng", "Getuk khas", 30000.0, 40, "dummy_produuct"),
        Product(5, 1, categories[0], "Nopia", "Nopia rasa coklat", 22000.0, 60, "dummy_produuct"),

        //minuman
        Product(6, 2, categories[1], "Es Dawet", "Dawet seger", 10000.0, 100, "dummy_produuct"),
        Product(7, 2, categories[1], "Kopi Robusta", "Kopi bubuk", 45000.0, 20, "dummy_produuct"),
        Product(8, 2, categories[1], "Wedang Jahe", "Jahe instan", 12000.0, 50, "dummy_produuct"),
        Product(9, 2, categories[1], "Teh Poci", "Teh melati", 15000.0, 40, "dummy_produuct"),
        Product(10, 2, categories[1], "Sirup Stroberi", "Sirup rasa", 35000.0, 15, "dummy_produuct"),

        //kerajinan
        Product(11, 3, categories[2], "Batik Purbalingga", "Kain batik", 150000.0, 10, "dummy_produuct"),
        Product(12, 3, categories[2], "Sandal Bandol", "Sandal awet", 40000.0, 25, "dummy_produuct"),
        Product(13, 3, categories[2], "Sapu Glagah", "Sapu lantai", 25000.0, 100, "dummy_produuct"),
        Product(14, 3, categories[2], "Gantungan Kunci", "Gantungan kayu", 5000.0, 150, "dummy_produuct"),
        Product(15, 3, categories[2], "Tas Rajut", "Tas wanita rajut", 85000.0, 5, "dummy_produuct")
    )
}