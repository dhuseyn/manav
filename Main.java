/*
Manav Kasa Programı
Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

Meyveler ve KG Fiyatları

Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL
Örnek Çıktı;

Armut Kaç Kilo ? :0
Elma Kaç Kilo ? :1
Domates Kaç Kilo ? :1
Muz Kaç Kilo ? :2
Patlıcan Kaç Kilo ? :3
Toplam Tutar : 21.68 TL
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double armF = 2.14, elmF = 3.67, domatF = 1.11, muzF =0.95, patlcF = 5, tutar;
        Scanner inp = new Scanner(System.in);

        System.out.print("Armut kaç kilo? : ");
        double armut = inp.nextDouble();
        System.out.print("Elma kaç kilo? : ");
        double elma = inp.nextDouble();
        System.out.print("Domates kaç kilo? : ");
        double domat = inp.nextDouble();
        System.out.print("Muz kaç kilo? : ");
        double muz = inp.nextDouble();
        System.out.print("Patlıcan1" + " kaç kilo? : ");
        double patlcn = inp.nextDouble();

        tutar = armut*armF + elma*elmF + domat*domatF + muz*muzF + patlcn*patlcF;
        System.out.print("Manav alışverişi toplam: "+tutar);

    }
}