import java.util.Scanner;
class LulusatauGagal{
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
    
      int nilai = input.nextInt();
      if (nilai > 55) {
        String output = "LULUS";
        System.out.println(output);
      } else { 
        String output = "GAGAL";
        System.out.println(output);
      } 
  }
}