/**
 * Pemilihan2Percobaan1-04
 */
import java.util.Scanner;
public class Pemilihan2Percobaan104 {
public static void main(String[] args) {
    
    Scanner input04 = new Scanner(System.in);
    int tahun;
    System.out.println("Masukkan Tahun : ");
    tahun = input04.nextInt();

    if ((tahun % 400) == 0) {
        if ((tahun % 100) == 0) {
            System.out.println("Tahun Kabisat");
        }
    } else {
        System.out.println("Bukan Tahun Kabisat");
    }
}
    
}