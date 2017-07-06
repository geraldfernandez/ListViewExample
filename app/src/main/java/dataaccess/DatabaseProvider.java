package dataaccess;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by GeraldFernandez on 06/07/2017.
 */

public class DatabaseProvider extends SQLiteOpenHelper{
    private static final String LOG = DatabaseProvider.class.getName();
    private static final int DATABASE_VERSION = 1;

    private static final String DATABASE_NAME = "BackendLocalDb";
    private static final String TableKategori = "Kategori";
    private static final String TableBarang = "Barang";

    //table Kategori
    private static final String KategoriId = "KategoriId";
    private static final String NamaKategori = "NamaKategori";

    //table Barang
    private static final String BarangId = "BarangId";
    private static final String NamaBarang = "NamaBarang";
    private static final String Deskripsi = "Deskripsi";
    private static final String Stok = "Stok";
    private static final String HargaBeli = "HargaBeli";
    private static final String HargaJual = "HargaJual";
    private static final String Gambar = "Gambar";
    private static final String isSync = "isSync";

    //create Table Kategori
    private static final String Create_Table_Kategori =
            "create table "+TableKategori+" (" +KategoriId+ " integer primary key," +NamaKategori+ " text);";

    //create Table Barang
    private static final String Create_Table_Barang =
            "create table "+TableBarang+" (" +BarangId+ " text primary key, "+KategoriId+" integer, "+NamaBarang+
                    " text, "+Deskripsi+" text, "+Stok+ " integer, "+HargaBeli+" real, "+HargaJual+" real, "+Gambar+
                    " text, "+isSync+" integer);";

    public DatabaseProvider(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Create_Table_Kategori);
        db.execSQL(Create_Table_Barang);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists "+TableKategori);
        db.execSQL("drop table if exists "+TableBarang);
        onCreate(db);
    }
}
