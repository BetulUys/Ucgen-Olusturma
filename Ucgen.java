package advenced02;

public class Ucgen {
    static int deger;

    public static void main(String[] args) {
        System.out.println("*");
        for (int i = 0; i < 9; i++) {
            System.out.print("*");
            for (int j = 0; j < i; j++) {
                System.out.print("  ");//çift boşluk
            }
            System.out.println(" *");
            deger = i + 2;
        }
        System.out.print("*");

        for (int k = 0; k < deger; k++) {//en sondaki döngü i+1 kadar dönmeli .yukarıda i 4 tü, bu döngü 5 için çalışıyor gibi düşünülmeli
            System.out.print(" *");
        }
    }
}
