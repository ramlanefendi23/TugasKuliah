import java.util.Scanner;
class ProgramKelulusan{
  public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        int nilai = input.nextInt();
        if (nilai > 54) {
            System.out.println("Selamat! Anda lulus dengan nilai"+" " + nilai+ "\n"+ "Program selesai");
        } else {
            System.out.println("Program selesai");
        }

    }
}


 