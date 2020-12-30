import java.util.Scanner;
class ArrayTerbalik2{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int hasil = input.nextInt();
    int[] nilai = new int[hasil];
    
    for (int i = 0; i <hasil; i++){
      nilai[i] = input.nextInt();
    }
    for (int i = hasil- 1; i >=0; i--){
      System.out.print(nilai[i] + " ");
    }
  }
}