import java.util.Scanner;
class GarisPersegi{
  public static void main(String args []){
    Scanner input = new Scanner(System.in);
    int x = input.nextInt();
    for ( int i=1;i<=x;i++){
    for ( int j=1;j<=x;j++)
      {
        if((j==1||j==x)||(i==1||i==x))
        System.out.print("#");
        else
        System.out.print("");
        }
        System.out.println();
    }
      }
    }