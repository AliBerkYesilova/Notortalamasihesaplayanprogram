import com.sun.source.tree.NewArrayTree;

import java.util.Scanner;
public class ders {
    public static void main(String[] args) {
        int mat,fız,kım,turk,tar,muz;

        Scanner okul = new Scanner(System.in);
        System.out.print("Matematik Notunuz");
        mat = okul.nextInt();
        System.out.print("Fizik Notunuz");
        fız = okul.nextInt();
        System.out.print("Kimya Notunuz");
        kım = okul.nextInt();
        System.out.print("Türkçe Notunuz");
        turk = okul.nextInt();
        System.out.print("Tarih Notunuz");
        tar = okul.nextInt();
        System.out.print("Müzik Notunuz");
        muz = okul.nextInt();

        int toplam = (mat+fız+kım+turk+tar+muz);
        double sonuc = (toplam/6);
        System.out.println("Ortalamanız = " + sonuc);

        boolean kosul = sonuc >= 60;
        System.out.println("Durum = " + (kosul==true ? "Sınıfı Geçti" : "Sınıfta Kaldı"));



    }

}
