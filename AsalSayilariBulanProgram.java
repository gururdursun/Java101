package Donguler;

public class AsalSayilariBulanProgram {
    public static void main(String[] args) {

        for (int i = 2; i < 100; i++) {
            boolean asal = true;
            for (int k = 2; k <= i - 1; k++) {
                if (i % k == 0) {
                    asal = false;
                }
            }
            if (asal) {
                System.out.print(i + " ");
            }
        }
    }
}
