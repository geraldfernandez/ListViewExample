package com.example.geraldfernandez.listviewexample;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;

import dataaccess.DataProvider;
import models.Barang;

import static java.security.AccessController.getContext;

public class DetailBarangActivity extends AppCompatActivity {
    private ImageView imageDetailBarang;
    private EditText txtDetailBarangId, txtDetailKategoriId, txtDetailNamaBarang, txtDetailDeskripsiBarang, txtDetailStok, txtDetailHargaBeli;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_barang);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        imageDetailBarang = (ImageView) findViewById(R.id.imageDetailBarang);
        txtDetailBarangId = (EditText) findViewById(R.id.txtDetailBarangId);
        txtDetailKategoriId = (EditText) findViewById(R.id.txtDetailKategoriId);
        txtDetailNamaBarang = (EditText) findViewById(R.id.txtDetailNamaBarang);
        txtDetailDeskripsiBarang = (EditText) findViewById(R.id.txtDetailDeskripsiBarang);
        txtDetailStok = (EditText) findViewById(R.id.txtDetailStok);
        txtDetailHargaBeli = (EditText) findViewById(R.id.txtDetailHargaBeli);

        String barangId = getIntent().getStringExtra("barangId");
        Barang barang = DataProvider.barangMap.get(barangId);
        Bitmap bitmap = getBitmapFromAsset(barang.getBarangId());
        imageDetailBarang.setImageBitmap(bitmap);

        txtDetailBarangId.setText(barang.getBarangId());
        txtDetailNamaBarang.setText(barang.getNamaBarang());
        txtDetailKategoriId.setText(String.valueOf(barang.getKategoriId()));
        txtDetailDeskripsiBarang.setText(barang.getDeskripsi());
        txtDetailStok.setText(String.valueOf(barang.getStok()));
        txtDetailHargaBeli.setText(String.valueOf(barang.getHargaBeli()));
    }

    private Bitmap getBitmapFromAsset(String barangId){
        AssetManager assetManager = getAssets();
        InputStream stream = null;

        try{
            stream = assetManager.open(barangId+".png");
            return BitmapFactory.decodeStream(stream);
        }
        catch (IOException e){
            e.printStackTrace();
            return null;
        }
    }
}
