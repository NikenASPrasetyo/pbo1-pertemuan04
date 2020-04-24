package Perulangan;

public class DoWhile {
        public static void main(String[] args) {
            int IsiGelas = 0;
            int penuh = 225;

            System.out.println("Isi Gelas Sekarang : " + IsiGelas + "ml");
            System.out.println("Isi Gelas Ketika Penuh : " + penuh + "ml");

            do {
                IsiGelas++;
                System.out.println("Sedang mengisi gelas..");
                System.out.println("Isi Gelas Sekarang : " + IsiGelas + "ml");
            }while(IsiGelas != penuh);

            System.out.println("Final: Isi Gelas Sekarang adalah : " + IsiGelas + "ml");
        }
    }
