import java.util.Scanner;
public class TabelBuku {

    public static void main(String[] args) {
        int JumlahBayar, denda, biaya,hargasewa;
      
        Scanner kode=new Scanner (System.in);
        System.out.println("PERPUSTAKAAN HMIF BEM FTUMJ ");
        System.out.println("------------------------------");
         System.out.println("Golongan Buku | | Nama Buku | | Harga Sewa Per 7 Hari | |");
          System.out.println("1             | |  SBP    | |              Rp.200,-  | |");
                 System.out.println("2             | |  DDP    | |              Rp.150,-  | |");
                 System.out.println("3             | |  DAA    | |              Rp.250,-  | |");
        System.out.println("Peminjaman maksimal 1 Minggu [7 hari] ");
        System.out.println("Denda sebanyak Rp.100 per hari untuk setiap koleksi");
System.out.println("------------------------------");
        System.out.println("\nMasukkan Nama Peminjam");
        String nama=kode.next();
        System.out.println("Masukan Golongan buku = ");
        String huruf=kode.next();
        switch (huruf)
        {
            case "A":
         System.out.println("Nama Buku : SBP " );
           String sbp=kode.next();
           biaya = 200;
           System.out.println("Nama Buku : "+sbp);
                break;
                case "B":
                     System.out.println("Nama Buku : DDP " );
                     String ddp=kode.next();
                     break;
                case "C":
                    System.out.println("Nama Buku : DAA");
                     String daa=kode.next();
                     break;
      
        }
          System.out.println("Nama Peminjam : "+nama);
             
          
//menampilkan biaya sewa dan denda


}
}
