import java.util.Scanner;
public class two_dimentional_figure {

    public static void main(String[] args) {
        int 
        jari,
        tinggi,
        jarikuadrat,
        hasil;
        
        Scanner kode=new Scanner (System.in);
        System.out.println("Calculator 2 two dimentional figure  ");
        System.out.println("------------------------------");
         System.out.println("Figure| | Nama Figure | | ");
          System.out.println("A             | |  Square    | |");
                 System.out.println("B             | | Rectangle    | |   ");
                 System.out.println("C             | |  Tube   | |");
                 System.out.println("Untuk Phie kelipatan = 3,14");
        System.out.println("------------------------------");
        System.out.println("\nMasukkan Bangun Ruang= ");
        String bangun=kode.next();
        switch (bangun)
        {
                case "A":
                System.out.println("Name : Square  " );
                break;
                case "B":
                     System.out.println("Nama  : Rectangle " );
                     break;
                case "C":
                    System.out.println("Nama  : Tube");
                     break;
        }
        if(bangun =="A")
        {
            
                 //System.out.println("Masukkan Jari-Jari : ");
                // jari=kode.nextInt();
                  
                  System.out.println("Masukkan Tinggi : ");
                  tinggi=kode.nextInt();
                  
                  System.out.println(" Tinggi yang dimasukkan : "+tinggi );
                  
                    System.out.println(" jari-jari yang dimasukkan : "+jari );
                    
                    jarikuadrat = jari*jari;
                    
                 double  volume = 3.14* jarikuadrat;
        }
        //else if (bangun)
    }
}
// ONGOING
