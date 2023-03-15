package org.example;
/** This is a public class wich extends Car.

 * @param -  String chassisNumber;
 * @param - Integer model;
 */
public class VWGolf extends Volkswagen{

    String chassisNumber;
    Integer model;
    /** This is the constructor of the class.
     *
     * @param - model;
     * @param - chassisNumber;
     */
    public VWGolf(Integer model, String chassisNumber){
        this.chassisNumber = chassisNumber;
        this.model = model;

    }
}
