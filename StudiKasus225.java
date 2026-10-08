import java.util.Scanner;

public class StudiKasus225 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
        String nama, jenisKegiatan;
        int jmlDokumen, peringkatJuara, kurang, status;

        System.out.print("Masukkan Nama mahasiswa : ");
        nama = sc.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        jenisKegiatan = sc.nextLine(); 

        if (jenisKegiatan.equalsIgnoreCase("belmawa") || 
            jenisKegiatan.equalsIgnoreCase("bakorma") ||
            jenisKegiatan.equalsIgnoreCase("mandiri")) {

                System.out.print("Jumlah dokumen : ");
                jmlDokumen = sc.nextInt();
                System.out.print("Peringkat juara : ");
                peringkatJuara = sc.nextInt();

                if (peringkatJuara >= 1 && peringkatJuara <=3) {
                    if (jmlDokumen == 4) {
                        System.out.println("Selamat" +nama+ ", Anda berhak memperoleh dana penghargaan.");
                    } else {
                        kurang = 4 - jmlDokumen;
                        System.out.println("Status : Dokumen tidak lengkap ( kuang "+kurang+" dokumen). dana penghargaan tidak diberikan.");
                    }
                    
                } else {
                    System.out.println("status : Hanya juara 1, 2, dan 3 yang berhak memperoleh dana penghargaan.");
                }
            
        } else if (jenisKegiatan.equalsIgnoreCase("pkm")) {
            System.out.println("Jumlah dokumen : ");
            jmlDokumen = sc.nextInt();

            System.out.println("Status pendanaan pkm (1 = lolos, 0 = tidak lolos) : ");
            status = sc.nextInt();

            if (status == 1) {

                if (jmlDokumen == 4) {
                    System.out.println("Status : Selamat " + nama + ", Anda berhak memperoleh dana penghargaan.");
                } else {
                    kurang = 4 - jmlDokumen;
                    System.out.println("Status : Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.");
                }

            } else {
                System.out.println("Status : PKM tidak lolos pendanaan. Dana penghargaan tidak diberikan.");
            }

        } else {
            System.out.println("Status : Kegiatan jenis Lainnya tidak memperoleh dana penghargaan.");
        }
        

        sc.close();
    }
    
}
