import java.util.Scanner;
public class VucutKitleEndeksi {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double boy;
        double kilo;

        System.out.print("Boyunuzu Metre Cinsinden Giriniz : ");
        boy = input.nextDouble();

        System.out.print("Boyunuzu Kilo Cinsinden Giriniz : ");
        kilo = input.nextDouble();

        double indeks = kilo / (boy * boy);

        System.out.print("Vucut Kitle Endeksiniz : " + indeks);



    }
}
