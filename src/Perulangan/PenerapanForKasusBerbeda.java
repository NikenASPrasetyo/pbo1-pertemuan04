package Perulangan;

public class PenerapanForKasusBerbeda {
    public static void main(String[] args) {
        int a, jumlah, akhir;
        jumlah = 0;
        akhir = 100;
        System.out.println();

        System.out.println("Angka sekarang : " + jumlah);
        System.out.println("Angka tujuan : " + akhir);

        System.out.println();

        for (a = 1; a <= akhir; a += 3)  //perintah looping/perulangannya. a+=3 adalah rumus untuk setiap angka menambahkan 3
        {
            jumlah=jumlah+a;
            System.out.println("Sedang menghitung..");
            System.out.println("Hasil angka : " + a);
            System.out.println();
        }
        System.out.println();
        System.out.println("Final: Akhirnya angka sekarang adalah : " + akhir);

        System.out.println(); //enter
        System.out.print("Total jumlah : "+jumlah); //cetak total penjumlahan

    }
}
