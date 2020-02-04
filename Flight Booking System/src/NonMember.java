/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author jules
 */
public class NonMember extends Passenger{
    
    public NonMember(String name, int age) {
        super(name, age);
    }
    
    @Override
    public double applyDiscount(double p) {
        if(age > 65)
            return 0.5*p;
        else
            return p;
 
    }
}
