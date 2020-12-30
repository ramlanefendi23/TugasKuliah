import java.util.Scanner;
class LuasdanKeliling{
  public static void main(String[] args) {
    Scanner userInput = new Scanner (System.in);
    
    double inputPanjang = userInput.nextDouble();
    double inputLebar   = userInput.nextDouble();
    hasilkanKelilingDanLuas(inputPanjang,inputLebar);
  }
  public static void hasilkanKelilingDanLuas(double panjang, double lebar){
    System.out.println(luas(panjang, lebar));
    System.out.println(keliling(panjang, lebar));
  }
    public static double keliling (double panjang, double lebar){
      double akhir = (panjang + lebar ) *2;
      return akhir;
    }
    public static double luas(double panjang,double lebar){
      double akhir = panjang * lebar;
      return akhir;
    }
  }