import java.util.Scanner;

public class soalmudah {
    public static void main(String[] args) {
        double angka;
        Scanner s = new Scanner(System.in);
        System.out.println("Masukkan total pembelian: ");
        angka = s.nextDouble(); 

        if(angka < 100000) {
            System.out.println("Anda tidak mendapatkan diskon"); 

        }else if(angka >= 100000 && angka <=200000 ) {
            System.out.println("Anda mendapatkan diskon 10%");

        }else if (angka >= 200000) {
            System.out.println("Anda mendapatkan diskon 20%");
        }
        System.out.println("Terimakasih sudah berbelanja");


         
    
             
        }
}