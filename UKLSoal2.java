public class UKLSoal2 {
    public void hitungFaktorial(int bil){
        if (bil < 0 ) {
            System.out.println("Bilangan tidak valid! Masukkan bilangan positif!");
        } else {
            int hasil = 1;
            boolean overflow = false;
            for (int i = 1; i <= bil; i++) {
                if (hasil  > Integer.MAX_VALUE / i) {
                    overflow = true;
                    break;
                }
                hasil *= i;
            }
            if (overflow) {
                System.out.println("Faktorial dari " + bil + " terlalu besar untuk dihitung (overflow).");
            } else {
                System.out.println("Faktorial dari " + bil + " adalah: " + hasil);
            }

        }
    }
    
}
