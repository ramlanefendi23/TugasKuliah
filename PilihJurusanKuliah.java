import java.util.Scanner;
class PilihJurusanKuliah{
  public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
        String[] jurusan = new String[5];
        jurusan[0] = "Teknik Informatika";
        jurusan[1] = "Sistem Informasi";
        jurusan[2] = "Teknik Elektro";
        jurusan[3] = "Teknik Industri";
        jurusan[4] = "Matematika Terapan";
        for (int i = 0; i < jurusan.length; i++) {
        }
        int kodeJurusan = input.nextInt();
        System.out.println( "Selamat datang di jurusan " + jurusan[kodeJurusan-1] );

    }
}