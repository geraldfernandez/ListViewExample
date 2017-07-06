package dataaccess;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import models.Barang;

/**
 * Created by GeraldFernandez on 05/07/2017.
 */

public final class DataProvider {
    public static List<Barang> barangList = new ArrayList<>();
    public static Map<String, Barang> barangMap = new HashMap<>();

    public static void addBarang(String barangId, int kategoriId, String namaBarang,
                        String deskripsi, int stok, double hargaBeli,
                        double hargaJual, String gambar) {
        Barang barang = new Barang(barangId,namaBarang,deskripsi,gambar,kategoriId,stok,hargaBeli,hargaJual);
        barangList.add(barang);
        barangMap.put(barangId,barang);
    }

    public static List<String> getBarangName(){
        List<String> list = new ArrayList<>();
        for(Barang barang : barangList){
            list.add(barang.getNamaBarang());
        }

        return list;
    }

    public static List<Barang> getFilteredList(String searchString){
        List<Barang> filterList = new ArrayList<>();
        for(Barang barang : barangList){
            if(barang.getBarangId().contains(searchString)){
                filterList.add(barang);
            }
        }
        return filterList;
    }

    static {
        addBarang("shirt101", 1, "Cross-back training tank", "Our cross-back training tank is made from organic cotton with 10% Lycra for form and support, and a flattering feminine cut.", 35, 90000, 100000, "shirt101.png");
        addBarang("jacket101", 1, "Bamboo thermal ski coat", "You’ll be the most environmentally conscious skier on the slopes - and the most stylish - wearing our fitted bamboo thermal ski coat, made from organic bamboo with recycled plastic down filling.", 128, 90000, 100000, "jacket101.png");
        addBarang("pants101", 1, "Stretchy dance pants", "Whether dancing the samba, mastering a yoga pose, or scaling the climbing wall, our stretchy dance pants, made from 80% organic cotton and 20% Lycra, are the most versatile and comfortable workout pants you’ll ever have the pleasure of wearing.", 85, 90000, 100000, "jacket102.png");
        addBarang("shirt102", 1, "Ultra-soft tank top", "This versatile tank can be worn in the gym, under a blazer, or for a day out in the sun. Made from our patented organic bamboo and cotton mix, our ultra-soft tank never stops feeling soft, even when you forget the fabric softener.", 23, 90000, 100000, "jacket103.png");
        addBarang("shirt103", 1, "V-neck t-shirt", "Our pre-shrunk organic cotton t-shirt, with its slightly fitted waist and elegant V-neck is designed to flatter. You’ll want one in every color!", 26, 90000, 100000, "jacket104.png");
        addBarang("sweater101", 1, "V-neck sweater", "This medium-weight sweater, made from organic knitted cotton and bamboo, is the perfect solution to a chilly night at the campground or a misty walk on the beach.", 65, 90000, 100000, "jacket105.png");
        addBarang("shirt104", 1, "Polo shirt", "Our pre-shrunk organic cotton polo shirt is perfect for weekend activities, lounging around the house, and casual days at the office. With its triple-stitched sleeves and waistband, our polo has maximum durability.", 38, 90000, 100000, "jacket106.png");
        addBarang("shirt105", 1, "Skater graphic T-shirt\n", "Hip at the skate park or around down, our pre-shrunk organic cotton graphic T-shirt has you covered.", 45, 90000, 100000, "jacket107.png");
        addBarang("jacket102", 1, "Thermal fleece jacket", "Our thermal organic fleece jacket, is brushed on both sides for ultra softness and warmth. This medium-weight jacket is versatile all year around, and can be worn with layers for the winter season.", 85, 90000, 100000, "jacket106.png");
        addBarang("shirt106", 1, "V-neck pullover", "This organic hemp jersey pullover is perfect in a pinch. Wear for casual days at the office, a game of hoops after work, or running your weekend errands.", 35, 90000, 100000, "jacket107.png");
        addBarang("shirt107", 1, "V-neck T-shirt", "Our pre-shrunk organic cotton V-neck T-shirt is the ultimate in comfort and durability, with triple stitching at the collar, sleeves, and waist. So versatile you’ll want one in every color!", 28, 90000, 100000, "jacket106.png");
        addBarang("pants102", 1, "Grunge skater jeans", "Our boy-cut jeans are for men and women who appreciate that skate park fashions aren’t just for skaters. Made from the softest and most flexible organic cotton denim.", 75, 90000, 100000, "jacket107.png");
        addBarang("vest101", 1, "Thermal vest", "Our thermal vest, made from organic bamboo with recycled plastic down filling, is a favorite of both men and women. You’ll help the environment, and have a wear-easy piece for many occasions.", 95, 90000, 100000, "jacket101.png");
    }
}