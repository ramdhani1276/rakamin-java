package firstProgram;

public class operator {
    public static void main(String[] args){
        int x = 10;
        int y = 5;

        int hasilPenjumlahan = x + y;
        int hasilPerkalian = x * y;
        boolean apakahSama = (x == y);
        boolean apakahLebihBesar = (x > y);

        System.out.println("Hasil penjumlahan: " + hasilPenjumlahan);
        System.out.println("Hasil perkalian: " + hasilPerkalian);
        System.out.println("Apakah x sama dengan y? " + apakahSama);
        System.out.println("Apakah x lebih besar dari y? " + apakahLebihBesar);
    }
}