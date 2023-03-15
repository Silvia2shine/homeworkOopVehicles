package org.example;

/**
 * This is a public class Car which implements the interface Vehicles.It has 7 methods.
 *
 * @ pqram - Integer fuelTankSize;
 * @ pqram - String fuelType;
 * @ pqram - Integer gearMax;
 * @ pqram - Float consumptionPer100km;
 * @ pqram - Integer currentGear;
 * @ pqram - Float consumption ;
 * @ pqram - Float availableFuel;
 * @ pqram - Integer tireSize ;
 */
abstract class Car implements Vehicles {
    Integer fuelTankSize = 60;
    String fuelType = "diesel";
    Integer gearMax = 6;
    Float consumptionPer100km = 5.8F;
    Float currentGear;
    Float consumption = 5.8F;
    Float availableFuel = 50.00F;
    Integer tireSize = 16;
    Float kmDriven;

    /**
     * A void method that override the start method from interface Vehicles;
     */
    @Override
    public void start() {
        System.out.println("The car has started");
        this.currentGear = 1.0F;
        this.consumption = consumptionPer100km;
    }

    /**
     * A void method that override the drive method from interface Vehicles;
     *
     * @param - n - the nr of the km that the car has driven;
     */
    @Override
    public void drive(float n) {
        this.kmDriven = n;
        System.out.println("The car is driving " + n + "Km");
        this.availableFuel -= (kmDriven * this.consumption / 100);

    }

    /**
     * A void method that override the stop method from interface Vehicles;
     */
    @Override
    public void stop() {
        System.out.println("The car has stopped");
        System.out.println("You have naw available fuel " + availableFuel +
                " liters and the lest recorded fuel consumption waz  " + consumption);
        currentGear = 0.0F;
    }

    /**
     * A void method that calculate the consumption of the car, depending on the currentGear;
     *
     * @param - n - the new currentGear;
     */
    public Float shiftGear(float nr) {
        System.out.println("The car change gear to " + nr);
        if ((0 < nr) && (gearMax > nr)) {
            if (currentGear <= nr) {
                consumption = consumptionPer100km - (0.10F * (nr - currentGear)); // + or - 0.10F at which curentGear


                System.out.println("The car consumption is decreasing "
                        + consumption);
            } else {
                consumption = consumptionPer100km + (0.10F * (currentGear - nr));

                System.out.println("The car consumption is increasing "
                        + consumption);
            }
        } else System.out.println("The value of currentGear is not correct ");
        currentGear = nr;
        return consumption;
    }

    /**
     * A method that get the available fuel;
     */
    public Float getAvailableFuel() {
        System.out.println("The available fuel is ");
        this.availableFuel -= consumption * kmDriven;
        return availableFuel;
    }

    /**
     * A method that get the getAverageFuelConsumption;
     */
    public Float getAverageFuelConsumption() {
        System.out.println("The average fuel consumption is " );
        return consumptionPer100km;
    }

    /**
     * A void method that calculate the consumption of the car, depending on the tires;
     *
     * @param - n - the new tire size;
     */
    public Float shiftTires(float nr) {
        System.out.println("The car change tires to " + nr);
        if ((15 < nr) && (19 > nr)) {
            if (tireSize < nr) {
                this.consumption = consumptionPer100km + (0.10F * (nr - tireSize));

                System.out.println("The car consumption is increasing "
                        + consumption);
            } else {
                this.consumption = consumptionPer100km - 0.10F * (tireSize - nr);
                System.out.println("The car consumption is decreasing "
                        + consumption);
            }
        } else System.out.println("Tire out of range ");
        return consumption;
    }

}














