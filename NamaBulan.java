import java.util.Scanner;
class NamaBulan{
     public static void main(String[] args) {
        String[] bulan =  {
                "Januari",
                "Februari",
                "Maret",
                "April",
                "Mei",
                "Juni",
                "Juli",
                "Agustus",
                "September",
                "Oktober",
                "November",
                "Desember",
        };
        Scanner input = new Scanner(System.in);
        int angka = input.nextInt();
        int jan = 0;
        if (angka > 0 && angka <+12){
        System.out.println(bulan[angka-1] );
        } else {
        System.out.println("Nomor tidak valid");
        }
   }
  
}
