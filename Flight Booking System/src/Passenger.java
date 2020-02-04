/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author jules
 */
public abstract class Passenger {
    protected String name;
    protected int age;
    
    protected Passenger(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    abstract double applyDiscount(double p);
    
}
