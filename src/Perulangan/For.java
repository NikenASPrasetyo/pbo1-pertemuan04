package Perulangan;

public class For {
        public static void main(String[] args) {
            int IsiGelas = 0;
            int penuh = 225;

            System.out.println("Isi Gelas Sekarang : " + IsiGelas + "ml");
            System.out.println("Isi Gelas Ketika Penuh : " + penuh + "ml");

            for(IsiGelas = 0 ; IsiGelas <= penuh ; IsiGelas++){
                System.out.println("Sedang mengisi gelas..");
                System.out.println("Isi Gelas Sekarang : " + IsiGelas + "ml");
            }
            System.out.println("Final: Isi Gelas Sekarang adalah : " + IsiGelas + "ml");
        }
}
