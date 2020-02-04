/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.text.DecimalFormat;

/**
 *
 * @author jules
 */
public class Flight{
    //initializing instance variables
    private int flightNumber, capacity, numberOfSeatsLeft;
    private double originalPrice;
    private String origin, destination, departureTime;
    
    
    public Flight(int flightNumber, int capacity, int numberOfSeatsLeft, double originalPrice, String origin, String destination, String departureTime) throws IllegalArgumentException {
        if (origin.equals(destination)) {
            throw new IllegalArgumentException("illegal arguments");
        }else {
            this.flightNumber = flightNumber;
            this.capacity = capacity;
            this.numberOfSeatsLeft = capacity - numberOfSeatsLeft;
            this.originalPrice = originalPrice;
            this.origin = origin;
            this.destination = destination;
            this.departureTime = departureTime;
        }
    }
    

    public int getFlightNumber() {
        return flightNumber;
    }
    
    public int getCapacity() {
        return capacity;
    }
    
    public int getNumberOfSeatsLeft() {
        return numberOfSeatsLeft;
    }
    
     public double getOriginalPrice() {
        return originalPrice;
    }
    
     public String getOrigin() {
         return origin;
     }
     
     public String getDestination() {
         return destination;
     }
     
     public String getDepartureTime() {
         return departureTime;
     }
     
      public void setFlightNumber(int x) {
        this.flightNumber = x;
    }
    
    public void setCapacity(int x) {
        this.capacity = x;
    }
    
    public void setNumberOfSeatsLeft(int x) {
        this.numberOfSeatsLeft = x;
    }
    
     public void setOriginalPrice(double x) {
        this.originalPrice = x;
    }
    
     public void setOrigin(String x) {
         this.origin = x;
     }
     
     public void setDestination(String x) {
         this.destination = x;
     }
     
     public void setDepartureTime(String x) {
         this.departureTime = x;
     }
     
     public boolean bookASeat() {
         if (numberOfSeatsLeft > 0) {
             numberOfSeatsLeft--;
             return true;
         }
         else {
             return false;
         }      
     }
     
     @Override
     public String toString() {
         DecimalFormat d = new DecimalFormat(".##");
         String formattedPrice = d.format(originalPrice);
         return (""+ "Flight" + " " + flightNumber + ", "+ origin + " to " + destination + ", " + departureTime + ", " + "original price: $" + formattedPrice);
     }
    
}
