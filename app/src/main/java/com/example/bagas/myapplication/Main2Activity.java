package com.example.bagas.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        String ShowMenuMakanan = getIntent().getStringExtra("Menu");
        String ShowPorsiMakanan = getIntent().getStringExtra("Porsi");
        String NamaTempat = getIntent().getStringExtra("Tempat");
        String HargaMakanan = getIntent().getStringExtra("Harga");

        int total_harga = Integer.valueOf(ShowPorsiMakanan)*Integer.valueOf(HargaMakanan);

        TextView Menu = (TextView) findViewById(R.id.menu_makanan_show);
        TextView Porsi = (TextView)findViewById(R.id.porsi_makanan_show);
        TextView Tempat = (TextView) findViewById(R.id.tempat_show);
        TextView Harga = (TextView) findViewById(R.id.text_harga_show);

        Menu.setText(ShowMenuMakanan);
        Porsi.setText(ShowPorsiMakanan);
        Tempat.setText(NamaTempat);
        Harga.setText(String.valueOf(total_harga));

        if (total_harga > 65500) {
            Toast toast = Toast.makeText(this, "Jangan disini makan malamnya, uang kamu akan tidak cukup", Toast.LENGTH_LONG);
            toast.show();
        } else {
            Toast toast = Toast.makeText(this, "Disini aja makan malamnya murah", Toast.LENGTH_LONG);
            toast.show();
        }
    }
}