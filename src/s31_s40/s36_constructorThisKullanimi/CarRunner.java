package s31_s40.s36_constructorThisKullanimi;

public class CarRunner {
    public static void main(String[] args) {
        Car car1= new Car();
        car1.marka="Toyota";
        car1.model="Corolla";
        car1.yil=2020;

        System.out.println("Marka : " + car1.marka +
                           ", Model: " + car1.model+
                           ", Yil : " + car1.yil );
                            // Marka : Toyota Model: Corolla Yil : 2020
        Car car2=new Car("Opel","Corsa");
        System.out.println("Marka : " + car2.marka +
                            ", Model: " + car2.model);
                        // Marka : Opel, Model: Corsa

        Car car3= new Car("Tofas","Sahin");
        System.out.println("Marka : " + car3.marka +
                            ", Model: " + car3.model);
        // Marka : Tofas, Model: Sahin

        Car car4=new Car("Nissan", "Micra",2022);
        System.out.println("Marka : " + car4.marka +
                            ", Model: " + car4.model+
                            ", Yil : " + car4.yil );
        // Marka : Nissan, Model: Micra, Yil : 2022


        Car car5=new Car("WW","Jetta",2023);
        System.out.println("Marka : " + car5.marka +
                            ", Model: " + car5.model+
                            ", Yil : " + car5.yil );
        // Marka : WW, Model: Jetta, Yil : 2023


    }
}
