package org.example;
/** This is a public class wich extends Car.
 * @param -  String chassisNumber;
 * @param - Integer model;
 */
public class SKlasse extends Mercedes{
    String chassisNumber;
    Integer model;
    /** This is the constructor of the class.
     *
     * @param - model;
     * @param - chassisNumber;
     */
    public SKlasse(Integer model, String chassisNumber){
        this.chassisNumber = chassisNumber;
        this.model = model;

    }

}
