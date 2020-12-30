import java.util.Scanner;
class HitungAngkaGanjil{
  public static void main(String[] args){
  Scanner n = new Scanner(System.in);
        int x = n.nextInt();
        int y = n.nextInt();
        int data[][] =new int [x][y];
     for (int baris =0; baris < x; baris++){
       for (int kolom = 0; kolom < y; kolom++){
         data[baris][kolom]=n.nextInt();
       }
     }
     int ganjil = 0;
       for (int baris =0; baris < x; baris++){
       for (int kolom = 0; kolom < y; kolom++){
         if (data [baris][kolom] % 2 !=0){
           ganjil++;
         }
       }
        System.out.println( ganjil );
        ganjil =0;
    }
  }
}