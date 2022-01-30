package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_tambah.setOnClickListener {
//            val awal = edt_satu.text.toString().toInt()
//            val kedua = edt_dua.text.toString().toInt()
//            val hasil = awal + kedua
//
//            tv_hasil.text = hasil.toString()

            validasi(edt_satu.text.toString(), edt_dua.text.toString(), '+')
        }

        btn_kali.setOnClickListener {
            validasi(edt_satu.text.toString(), edt_dua.text.toString(), '*')
        }
        btn_kurang.setOnClickListener {
            validasi(edt_satu.text.toString(), edt_dua.text.toString(), '-')
        }
        btn_bagi.setOnClickListener {
            validasi(edt_satu.text.toString(), edt_dua.text.toString(), '/')
        }
    }

    private fun validasi(awal: String, kedua: String, operator: Char) {
        if (awal.isEmpty()) {
            edt_satu.error = "isi panteq"

        }
        if (kedua.isEmpty()) {
            edt_dua.error = "isi panteq"

        }
        if (kedua.isNotEmpty() && awal.isNotEmpty()) {
            kalkulasi(awal.toDouble(),kedua.toDouble(), operator)

        }
    }

    private fun kalkulasi(awal: Double, kedua: Double, operator: Char){

        var hasil = 0.0
        when(operator){
            '+' ->hasil = awal + kedua
            '-' ->hasil = awal - kedua
            '*' ->hasil = awal * kedua
            '/' ->hasil = awal / kedua
        }

        tv_hasil.text = hasil.toString()

    }

}