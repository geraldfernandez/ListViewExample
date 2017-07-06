package models;

/**
 * Created by GeraldFernandez on 05/07/2017.
 */

public class Barang {
    private String barangId, namaBarang, deskripsi, gambar;
    private int kategoriId, stok;
    private Double hargaBeli, hargaJual;

    public Barang(String barangId, String namaBarang, String deskripsi, String gambar, int kategoriId, int stok, Double hargaBeli, Double hargaJual) {
        this.barangId = barangId;
        this.namaBarang = namaBarang;
        this.deskripsi = deskripsi;
        this.gambar = gambar;
        this.kategoriId = kategoriId;
        this.stok = stok;
        this.hargaBeli = hargaBeli;
        this.hargaJual = hargaJual;
    }

    public String getBarangId() {
        return barangId;
    }

    public void setBarangId(String barangId) {
        this.barangId = barangId;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    public int getKategoriId() {
        return kategoriId;
    }

    public void setKategoriId(int kategoriId) {
        this.kategoriId = kategoriId;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public Double getHargaBeli() {
        return hargaBeli;
    }

    public void setHargaBeli(Double hargaBeli) {
        this.hargaBeli = hargaBeli;
    }

    public Double getHargaJual() {
        return hargaJual;
    }

    public void setHargaJual(Double hargaJual) {
        this.hargaJual = hargaJual;
    }
}
