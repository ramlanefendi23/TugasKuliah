import java.util.Scanner;
class GanjilGenap{
  public static void main(String[] args) {
   Scanner input=new Scanner(System.in);
        int a = 13;
        System.out.print("");
        a=input.nextInt();
        
        if (a%2==0){
            System.out.println("Genap");
        }else {
             System.out.println("Ganjil");
        }
    
  }
}  
 