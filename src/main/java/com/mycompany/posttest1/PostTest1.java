package com.mycompany.posttest1;
import java.util.ArrayList;
public class PostTest1 {
    public static void main(String[] args) {
        ArrayList<Laptop> laptops = new ArrayList<>();
        
        System.out.println("Spesifiksi Berbagai Merk Laptop");
        System.out.println("---------------------------------------------------------------------------------------------------");
        
        // Isi ArrayList dengan objek Laptop
        laptops.add(new Laptop("Dell", "XPS 13", 16, 512, 12000000));
        laptops.add(new Laptop("HP", "Spectre x360", 8, 256, 8300000));
        laptops.add(new Laptop("Lenovo", "ThinkPad X1 Carbon", 16, 512, 12150000));
        laptops.add(new Laptop("Apple", "MacBook Air", 8, 256, 9000000));
        laptops.add(new Laptop("Asus", "ROG Zephyrus", 32, 1000, 15000000));

        // Tampilkan informasi tentang laptop-laptop tersebut dalam perulangan
        for (Laptop laptop : laptops) {
            // Menggunakan penggabungan string (string concatenation) untuk mencetak informasi laptop
            String sentence = "Spesifikasi Laptop Merek " + laptop.brand + " " + laptop.model +
                             ", RAM " + laptop.ram + "GB, SSD " + laptop.storage + "GB dengan Harga Rp " + laptop.harga + ".";
            
            System.out.println(sentence);


        }
    }
}