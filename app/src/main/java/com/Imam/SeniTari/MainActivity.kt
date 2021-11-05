package com.Imam.SeniTari

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var data: ArrayList<DataModel>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inisialisasi Array
        data = ArrayList()

        //Simpan data

        data?.add(DataModel(R.drawable.saman,"Saman","ACEH","Tari Saman adalah sebuah tarian suku Gayo yang biasa ditampilkan untuk merayakan peristiwa-peristiwa penting dalam adat" +
                "Syair dalam tarian saman mempergunakan bahasa Gayo. " +
                "Selain itu biasanya tarian ini juga ditampilkan untuk merayakan kelahiran Nabi Muhammad SAW"))

        data?.add(DataModel(R.drawable.kecak,"Kecak","BALI", "Kecak adalah pertunjukan dramatari seni khas Bali yang lebih utama menceritakan mengenai Ramayana dan dimainkan terutama oleh laki-laki " +
                "Namun, Kecak berasal dari ritual sanghyang, yaitu tradisi tarian yang penarinya akan berada pada kondisi tidak sadar" +
                "melakukan komunikasi dengan Tuhan atau roh para leluhur dan kemudian menyampaikan harapan-harapannya kepada masyarakat."))

        data?.add(DataModel(R.drawable.gambyong,"Gambyong ", "JAWA", "Gambyong merupakan sebuah tarian jawa klasik yang berasal dari surakarta " +
                " Gambyong bukanlah satu tarian saja melainkan terdiri dari bermacam-macam koreografi " +
                "Pada dasarnya, gambyong dicipta untuk penari tunggal, tetapi sekarang lebih sering dibawakan oleh beberapa penari dengan menambahkan unsur blocking panggung."))

        data?.add(DataModel(R.drawable.sembah,"Sembah","Lampung", "Tari Sembah merupakan salah satu tari kreasi baru dari daerah Lampung. " +
                "Tari Sigeh Penguten merupakan perpaduan budaya antara kedua suku Lampung yakni Pepadun dan Saibatin. " +
                "Tarian ini dipentaskan dalam setiap pembukaan acara baik formal maupun non formal"))

        data?.add(DataModel(R.drawable.topeng,"Topeng","Cirebon", "Tari Topeng adalah tarian yang penarinya mengenakan topeng" +
                "Diyakini bahwa topeng berkaitan erat dengan roh-roh leluhur yang dianggap sebagai interpretasi dewa-dewa. " +
                "Cerita klasik Ramayana dan cerita Panji yang berkembang sejak ratusan tahun lalu menjadi inspirasi utama dalam penciptaan topeng di Jawa."))

        data?.add(DataModel(R.drawable.jaipong,"Jaipong","Karawang", "Jaipongan merupakan tari tradisional Karawang" +
                "aipongan merupakan garapan yang menggabungkan beberapa elemen seni tradisi Karawang seperti pencak silat, wayang golek, topeng banjet, ketuk tilu dan lain-lain. " +
                "Jaipongan di Karawang pesat pertumbuhannya di mulai tahun 1976"))


        //Set data to Adapter
        recyclerview.adapter = DataAdapter(data, object : DataAdapter.OnClickListener{
            override fun detail(item: DataModel?) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("gambar", item?.gambar)
                intent.putExtra("nama", item?.nama)
                intent.putExtra("Asal", item?.lokasi)
                intent.putExtra("keterangan", item?.keterangan)
                startActivity(intent)
            }

        })


    }
}