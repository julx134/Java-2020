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
public class FlightTicket {
   private Passenger passenger;
   private Flight flight;
   private double price;
   private int number;
   private static int ticketNumber;
   
   public FlightTicket(Passenger p, Flight flight, double price) {
       this.passenger = p;
       this.flight = flight;
       this.price = price;
       ticketNumber++;
       number = ticketNumber;
   }
   
   public Passenger getPassenger() {
       return passenger;
   }
   
   public Flight getFlight() {
       return flight;
   }
   
   public double price() {
       return price;
   }
   
   public int getTicketNumber() {
       return number;
   }
   
   public void setPassenger(Passenger p) {
       passenger = p;
   }
   
   public void setFlight(Flight f) {
       flight = f;
   }
   
   public void setPrice(double d) {
       price = d;
   }
   
   public void setTicketNumber(int number) {
       this.number = number;
   }
   
   @Override
   public String toString() {
       DecimalFormat d = new DecimalFormat(".##");
       String formattedPrice = d.format(price);
       return (""+flight.toString()+", ticket price: $"+ formattedPrice +"\n");
   }
}
