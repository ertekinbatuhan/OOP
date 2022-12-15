interface Shape2D {
    double alan();
    double hacim();

}

class Dikdortgen implements Shape2D {

    private double uzunluk;
    private double genislik;

    public Dikdortgen(double uzunluk, double genislik) {
        this.uzunluk = uzunluk;
        this.genislik = genislik;
    }

    @Override
    public double alan() {

        return  uzunluk * genislik;
    }

    @Override
    public double hacim() {

        return 0 ;

    }
}

class Daire implements Shape2D {

    private double radius;

    public Daire(double radius) {
        this.radius = radius;

    }

    @Override
    public double alan() {

        return Math.PI * radius * radius;
    }

    @Override
    public double hacim() {

        return 2 * Math.PI * radius;
    }



}
class Ucgen implements Shape2D{

    private double taban ;
    private double yukseklik ;


    public   Ucgen(double taban , double yukseklik){
        this.taban = taban;
        this.yukseklik = yukseklik;

    }





    @Override
    public double alan() {
        return (taban * yukseklik) / 2 ;

    }

    @Override
    public double hacim() {
       return  0 ;
    }





}
class Kare implements Shape2D{

    private double kenar ;


    public  Kare(double kenar){
        this.kenar = kenar;

    }

    @Override
    public double alan() {
        return (kenar * kenar);

    }

    @Override
    public double hacim() {
        return 0 ;


    }




}

