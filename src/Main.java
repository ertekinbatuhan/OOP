public class Main {
    public static void main(String[] args) {


         Dikdortgen dikdortgen = new Dikdortgen(3,4);
        System.out.println(dikdortgen.alan());
        System.out.println(dikdortgen.hacim());

        Daire daire  = new Daire(3);
        System.out.println(daire.alan());
        System.out.println(daire.hacim());

        Kare kare = new Kare(4);
        System.out.println(kare.alan());
        System.out.println(kare.hacim());

        Ucgen ucgen = new Ucgen(4,5);
        System.out.println(ucgen.alan());
        System.out.println(ucgen.hacim());


        DikdortgenPrizma dikdortgenPrizma = new DikdortgenPrizma(3,4,5);
        System.out.println(dikdortgenPrizma.alan());
        System.out.println(dikdortgenPrizma.hacim());

        Kup kup = new Kup(5);
        System.out.println(kup.alan());
        System.out.println(kup.hacim());

        Kure kure = new Kure(6);
        System.out.println(kure.alan());
        System.out.println(kure.hacim());

        UcgenPrizma ucgenPrizma = new UcgenPrizma(1,2,3,6);
        System.out.println(ucgenPrizma.alan());
        System.out.println(ucgenPrizma.hacim());


        Shape3D kupp = new Kup(10);
        System.out.println(kupp.alan());
        System.out.println(kupp.hacim());



        Shape2D dairee = new Daire(2);
        System.out.println(dairee.alan());
        System.out.println(dairee.hacim());







    }
}