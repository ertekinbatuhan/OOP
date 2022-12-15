public interface Shape3D {


     double alan();
     double hacim();

}





class UcgenPrizma implements  Shape3D{

    public  double kenar1 ;
    public  double kenar2 ;
    public  double kenar3 ;
    public double yukseklik ;


    public  UcgenPrizma(double kenar1 , double kenar2 , double kenar3 , double yukseklik){
        this.kenar1 = kenar1;
        this.kenar2 = kenar2 ;
        this.kenar3 = kenar3;


     }


    @Override
    public double alan() {
       return  ( kenar2 * kenar3 + kenar3 + kenar1 + kenar2)* yukseklik ;

    }

    @Override
    public double hacim() {

         return (yukseklik * kenar1);

    }
}



class Kure implements Shape3D{

    public double yaricap;


    public Kure(double yaricap){
        this.yaricap = yaricap;
    }
    @Override
    public double alan() {
        return 4 * Math.PI * yaricap*yaricap;

    }

    @Override
    public double hacim() {
        return  4/3 * Math.PI * yaricap* yaricap * yaricap;

    }
}


class Kup implements Shape3D {


    public  double kenar ;


    public  Kup(double kenar){
        this.kenar = kenar;

    }
    @Override
    public double alan() {
        return  6 * (kenar *kenar) ;

    }

    @Override
    public double hacim() {
        return  kenar * kenar * kenar ;

    }
}


class DikdortgenPrizma implements Shape3D {

     public  double kenar1 ;
     public  double kenar2 ;
     public  double kenar3 ;


     public  DikdortgenPrizma(double kenar1 , double kenar2 , double kenar3 ){


         this.kenar1 = kenar1;
         this.kenar2 = kenar2 ;
         this.kenar3 = kenar3 ;

     }


    @Override
    public double alan() {
       return 2 * (kenar1*kenar2 + kenar2* kenar3 + kenar1 * kenar3) * (kenar1*kenar2 + kenar2* kenar3 + kenar1 * kenar3);
    }

    @Override
    public double hacim() {
       return  ( kenar3 * kenar2 * kenar1);

    }
}
