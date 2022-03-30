package s31_s40.s36_constructorThisKullanimi;

public class Car {
    String marka;
    String model;
    int yil;


    public Car(String mrk, String mdl) {
        marka=mrk;
        model=mdl;
    }

    public Car(){

    }

    public Car(String marka, String model, int yil) {
        this.marka=marka;
        this.model=model;
        this.yil=yil;
    }
}
