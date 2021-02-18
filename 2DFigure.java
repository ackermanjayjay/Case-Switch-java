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
                      System.out.println("A             | | Area of the Rectangle | |   ");
                      System.out.println("B             | |  Perimeter of the Rectangle   | |");
                      System.out.println("\nMencari = A?, B? (Harus dalam huruf kapital)");
                      String persegi=kode.next();
                      System.out.println("");
                      switch (persegi){
                          
                             case "A":
                     System.out.println("Masukkan Panjang : ");
                   int   panjang=kode.nextInt();
                      
                         System.out.println("Masukkan Lebar : ");
                     int lebar=kode.nextInt();

                        System.out.println("");


                            double luas = panjang* lebar;
                               System.out.println(" Hasil Area persegi panjaang : "+luas );
                          
                          break; 
                            case "B":
                     System.out.println("Masukkan Panjang : ");
                   int   panjang1=kode.nextInt();
                      
                         System.out.println("Masukkan Lebar : ");
                     int lebar1=kode.nextInt();

                        System.out.println("");


                            double keliling = 2* (panjang1 + lebar1);
                               System.out.println(" Hasil Keliling persegi panjaang : "+keliling );
                               
                               break; 
                      }
                     break;
                case "C":
                    System.out.println("Nama  : Cylinder");
                    System.out.println("A             | | Volume of the Cylinder | |   ");
                      System.out.println("B             | |  Surface area   | |");
                      System.out.println("\nMencari = A?, B? (Harus dalam huruf kapital)");
                      String tabung=kode.next();
                      
                         System.out.println("");
                         switch(tabung)
                         {
                               case "A":
                        System.out.println("Masukkan Tinggi : ");
                            int   height=kode.nextInt();
                      
                         System.out.println("Masukkan Lebar : ");
                            int radius=kode.nextInt();

                                int radius2= radius*radius;

                                System.out.println("");

                            double Volume = 3.14* radius2*height;
                               System.out.println(" Hasil Volume : "+Volume );
                          
                          break; 
                          
                           case "B":
                        System.out.println("Masukkan jari-jari : ");
                            int   jari_=kode.nextInt();
                      
                         System.out.println("Masukkan Tinggi : ");
                            int tinggi_=kode.nextInt();

                           

                                System.out.println("");

                            double area = 2*3.14* jari_*(jari_+tinggi_);
                               System.out.println(" Hasil Luas Area : "+area );
                               
                               
                               
                         }
                     break;
                    }
                }
        
            }
