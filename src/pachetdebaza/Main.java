package pachetdebaza;

/**
 * Created by roxy on 10/25/2014.
 */
public class Main {

    public static void main(String[] arguments) {

        Bicicleta MountainBike = new Bicicleta();

        MountainBike.setGear(20);
        MountainBike.setCadence(30);
        MountainBike.setSpeed(50);

        System.out.println(MountainBike.gear);
        System.out.println(MountainBike.cadence);
        System.out.println(MountainBike.speed);



    }
}
