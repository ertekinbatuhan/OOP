public class Main {
    public static void main(String[] args) {


         Dikdortgen dikdortgen = new Dikdortgen(3,4);
        System.out.println("Dikdörtgen alanı : " + dikdortgen.alan());
        System.out.println("Dikdörtgen hacim : " + dikdortgen.hacim());

        Daire daire  = new Daire(3);
        System.out.println("Diare alanı : " + daire.alan());
        System.out.println("Daire hacim : " + daire.hacim());

        Kare kare = new Kare(4);
        System.out.println("Kare alanı " + kare.alan());
        System.out.println("Kare hacim : " +kare.hacim());

        Ucgen ucgen = new Ucgen(4,5);
        System.out.println("Üçgen alan " + ucgen.alan());
        System.out.println(" Üçgen hacim " + ucgen.hacim());


        DikdortgenPrizma dikdortgenPrizma = new DikdortgenPrizma(3,4,5);
        System.out.println("DikdörtgenPrizma alan " + dikdortgenPrizma.alan());
        System.out.println("DiktörtgenPrizma hacim " +dikdortgenPrizma.hacim());

        Kup kup = new Kup(5);
        System.out.println("Küp alan " + kup.alan());
        System.out.println("Küp hacim + " +kup.hacim());

        Kure kure = new Kure(6);
        System.out.println(" Küre alan " +kure.alan());
        System.out.println("Küre hacim " + kure.hacim());

        UcgenPrizma ucgenPrizma = new UcgenPrizma(1,2,3,6);
        System.out.println("UcgenPrizma alan " + ucgenPrizma.alan());
        System.out.println( "UgcenPrizma hacim " +ucgenPrizma.hacim());


        Shape3D kupp = new Kup(10);
        System.out.println(kupp.alan());
        System.out.println(kupp.hacim());



        Shape2D dairee = new Daire(2);
        System.out.println(dairee.alan());
        System.out.println(dairee.hacim());







    }
}