package Perulangan;

public class While {
    public static void main(String[] args) {
        int IsiGelas = 0;
        int penuh = 225;

        System.out.println("Isi Gelas Sekarang : " + IsiGelas + "ml");
        System.out.println("Isi Gelas Ketika Penuh : " + penuh + "ml");

        while(IsiGelas != penuh){
            IsiGelas++;
            System.out.println("Sedang mengisi gelas..");
            System.out.println("Isi Gelas Sekarang : " + IsiGelas + "ml");
        }
        System.out.println("Final: Isi Gelas Sekarang adalah : " + IsiGelas + "ml");
    }
}
