import java.util.Scanner;
class HitungAngkaGanjil{
  public static void main(String[] args){
  Scanner n = new Scanner(System.in);
  int angka = 0;
  int ganjil = 0;
  try {
    while(true){
      angka=n.nextInt();
      if (angka %2 != 0){
        ganjil++;
      }
    }
  }catch(NumberFormatException Err){
    System.out.println(ganjil);
  }catch(Exception Err){
    System.out.println(ganjil);
    }
  }
}
  