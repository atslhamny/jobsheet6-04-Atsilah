import java.util.Scanner;

public class Pemilihan2Percobaan204 {
    public static void main(String[] args) {
        Scanner input04 = new Scanner(System.in);

        System.out.println("Masukkan Sudut 1 : ");
        int sudut1 = input04.nextInt();
        System.out.println("Masukkan Sudut 2: ");
        int sudut2 = input04.nextInt();
        System.out.println("Masukkan Sudut 3: ");
        int sudut3 = input04.nextInt();

        int totalSudut = sudut1 + sudut2 + sudut3;

        if (totalSudut == 180) {
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90)) 
                System.out.println("Segitiga tersebut adalah segitiga Siku Siku");
                else if ((sudut1 == 90) && (sudut2 == 90) || (sudut3 == 90))
                System.out.println("Segitiga Sama Sisi");    
                else
                System.out.println("Segitiga Sembarang");
        } else
            System.out.println("Bukan Segitiga");
    }
}
