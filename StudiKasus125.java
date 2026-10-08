import java.util.Scanner;

public class StudiKasus125 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        
        int harga_percup = 18000;
        int jumlah_cup, uang_bayar, total_harga, diskon, total_bayar, kembalian, kurang;

        System.out.print("masukan jumlah cup : ");
        jumlah_cup = sc.nextInt();
        
        System.out.print("masukan uang bayar : ");
        uang_bayar = sc.nextInt();

        total_harga = jumlah_cup * harga_percup;
        diskon=0;

         if (total_harga >= 100000) {
            diskon = total_harga * 10 / 100;
        }

        total_bayar = total_harga - diskon;
        System.out.println("Total harga: " + total_harga);
        System.out.println("Diskon: " + diskon);
        System.out.println("Total yang harus dibayar :Rp " + total_bayar);

        if (uang_bayar >= total_bayar) {
            kembalian = uang_bayar - total_bayar;
            System.out.println("Kembalian :Rp " + kembalian);

        } else {
            kurang = total_bayar - uang_bayar;
            System.out.println("Uang tidak cukup, kurang: " + kurang);
        }
        
    
        sc.close();
    }
}
