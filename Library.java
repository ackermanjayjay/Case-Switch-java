import java.util.Scanner;
public class TabelBuku {

    public static void main(String[] args) {
        int JumlahBayar, denda, biaya,hargasewa;
      
        Scanner kode=new Scanner (System.in);
        System.out.println("PERPUSTAKAAN  ");
        System.out.println("------------------------------");
         System.out.println("Golongan Buku | | Nama Buku | | Harga Sewa Per 7 Hari | |");
          System.out.println("A             | |  SBP    | |              Rp.200,-  | |");
                 System.out.println("B             | |  DDP    | |              Rp.150,-  | |");
                 System.out.println("C             | |  DAA    | |              Rp.250,-  | |");
        System.out.println("Peminjaman maksimal 1 Minggu [7 hari] ");
        System.out.println("Denda sebanyak Rp.100 per hari untuk setiap koleksi");
        System.out.println("------------------------------");
        System.out.println("\nMasukkan Nama Peminjam = ");
        String nama=kode.next();
        System.out.println("Masukan Golongan buku = ");
        String huruf=kode.next();
        switch (huruf)
        {
            case "A":
         System.out.println("Nama Buku : SBP " );
                break;
                case "B":
                     System.out.println("Nama Buku : DDP " );
                     break;
                case "C":
                    System.out.println("Nama Buku : DAA");
                     break;
        }
        System.out.println("Lama peminjaman = ");
        int lama=kode.nextInt();
    if(lama>7)
    {
        if(huruf == "A")
        {
            biaya = 200;
        }
        else if (huruf =="B")
        {
            biaya = 150;
        }
        else 
        {
            biaya = 250;
        }
        denda = (lama-7) * 100;
        hargasewa =(lama*biaya);
    }
    else
    {
    if (huruf=="A")
    {
    biaya = 200;
    }
    else if (huruf=="B")
    {
    biaya = 150;
    }
    else
    {
    biaya = 250;
    }
    hargasewa=0;
    denda =0;
    }
     System.out.println("");
//menampilkan biaya sewa dan denda
System.out.println("Nama Peminjam : "+nama);
System.out.println("Lama Meminjam : "+lama);
System.out.println("Biaya sewa : Rp. "+biaya);
System.out.println("Biaya yang harus Anda Bayar : Rp. "+hargasewa);

JumlahBayar = hargasewa + denda;
System.out.println("");
System.out.println("Total Biaya yang harus dibayar : Rp. "+JumlahBayar);
System.out.println("");
}
}
