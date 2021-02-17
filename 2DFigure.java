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
                    System.out.println("A             | | Circle area  | |   ");
                 System.out.println("B             | |  Circumference   | |");
                System.out.println("\nMencari = A?, B? (Harus dalam huruf kapital)");
                 String hitung=kode.next();
                 
                 System.out.println("");
                                
                 switch (hitung){
                     case "A":
                     System.out.println("Masukkan Tinggi : ");
                      tinggi=kode.nextInt();
                      
                     System.out.println("Masukkan Jari-jari : ");
                    jari=kode.nextInt();
                    
                    System.out.println("");
                    
                    System.out.println(" Tinggi yang dimasukkan : "+tinggi );
                    System.out.println(" Jari-Jari yang dimasukkan : "+jari );
                     
                      System.out.println("");
                      
                    jarikuadrat = jari*jari;
                    
                    double  luas = 3.14* jarikuadrat;
                 
                   System.out.println(" Hasil Area: "+luas );
                 
                 break;
                 


                 case "B":
                       System.out.println("Masukkan Jari-jari : ");
                       int jari1=kode.nextInt();
                       
                      double keliling = 3.14*2*jari1;
                        System.out.println(" Hasil Circumference : "+keliling );
        
        }
          break;
                case "B":
                     System.out.println("Nama  : Rectangle " );
                     System.out.println("Nama  : Rectangle " );
                      System.out.println("A             | | Area of the Rectangle | |   ");
                      System.out.println("B             | |  Perimeter of the Rectangle   | |");
                      System.out.println("\nMencari = A?, B? (Harus dalam huruf kapital)");
                      String persegi=kode.next();
                      System.out.println("");
                      switch (persegi){
                          
                      }
                     break;
                case "C":
                    System.out.println("Nama  : Tube");
                     break;
        }
        }
        
        //else if (bangun)
    }
