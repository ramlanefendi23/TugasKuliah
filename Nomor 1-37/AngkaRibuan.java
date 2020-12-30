import java.util.Scanner;
import java.util.Locale;
 
class AngkaRibuan {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int harga = input.nextInt();
    Locale negara = new Locale("id");
    System.out.printf(negara,"Rp%,d,-", harga);

  }
}