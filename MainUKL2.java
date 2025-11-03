import java.util.Scanner;

public class MainUKL2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        UKLSoal2 kalkulator = new UKLSoal2();
        SilinderUKL2 tabung = new SilinderUKL2();

        System.out.println("Masukkan bilangan bulat positif: ");
        int bil = input.nextInt();
        kalkulator.hitungFaktorial(bil);

        System.out.println();
        System.out.println("====== Hitung volume tabung ======");
        System.out.println("Masukkan jari-jari: ");
        double r = input.nextDouble();
        System.out.println("Masukkan tinggi: ");
        double t = input.nextDouble();
        tabung.hitungVolumeTabung(r, t);


    }
    
}
