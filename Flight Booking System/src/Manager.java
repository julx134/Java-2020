/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author jules
 */
public class Manager {
   Flight arrayFlights[] = new Flight[10];
   ArrayList <FlightTicket> passengerTickets = new ArrayList<>(); 
    
   
    public void createFlights() {
       int flightNum = 1000;
       int seatCapacity;
       int seatsLeft;
       double price;
       String origin, destination, departureTime;
       
       String places[] = {"Toronto","New York","Washington","British Columbia", "Vancouver","Los Angeles","Miami","Chicago","Houston","Oklahoma City","San Antonio","Halifax","Ottawa"};
       String departureTimes[] = {"01/01/20 8:00am","03/10/20 10:00pm","05/10/20 12:00am","09/20/20/ 3:00pm","01/30/20/ 8:00pm","08/24/20 8:24am", "12/10/20 9:00am","04/30/20 7:00pm"};
       
       System.out.println("Creating flights...");
       for (int i = 0; i < 10; i++) {
           seatCapacity = (int)(Math.random()*100)+10;
           seatsLeft = (int)(Math.random()*seatCapacity);
           price = (Math.random()*1000 + 350);
           origin = places[(int)(Math.random()*places.length)];
           destination = places[(int)(Math.random()*places.length)];
           departureTime = departureTimes[(int)(Math.random()*departureTimes.length)];
           flightNum += 24;
           
           arrayFlights[i] = new Flight(flightNum, seatCapacity, seatsLeft, price, origin, destination, departureTime);
           System.out.println(arrayFlights[i].toString());
       }

    }
    
    public void availableFlights(String origin, String destination) {
        int checkFlight = 0;
        System.out.println("\nLooking for available flights...\n");
        
        for(Flight flight : arrayFlights) {
            if (flight.getOrigin().equalsIgnoreCase(origin) && flight.getDestination().equalsIgnoreCase(destination)) {
                if (flight.getNumberOfSeatsLeft() > 0 && flight != null) {
                    System.out.println(flight.toString());
                    System.out.println("Seats left: " + flight.getNumberOfSeatsLeft());
                    checkFlight++;
                }
            }     
        }
        if (checkFlight == 0) {
            System.out.println("No flights found with specified origin to destination");
        }
        
        
    }
    
    public Flight getFlight(int flightNumber) {
        Flight returnFlight = null;
        
        for(Flight flight : arrayFlights) {   
            if(flight.getFlightNumber() == flightNumber && flight != null) { 
                returnFlight = flight;
                break;
            }    
        }
        return returnFlight;
    }
        
    
    public void bookSeat(int flightNumber, Passenger p) {
        Flight flight = getFlight(flightNumber);
        
        if (flight != null && flight.getNumberOfSeatsLeft() > 0) {
           
            flight.bookASeat();
            if (p instanceof Member) {
                System.out.println("\nPrinting ticket...");
                passengerTickets.add(new FlightTicket(p, flight, p.applyDiscount(flight.getOriginalPrice())));
                System.out.println(passengerTickets.toString());
                System.out.println("Number of seats left: " + flight.getNumberOfSeatsLeft());
            }else {
                System.out.println("\nPrinting ticket...");
                passengerTickets.add(new FlightTicket(p, flight, p.applyDiscount(flight.getOriginalPrice())));
                System.out.println(passengerTickets.toString());
                System.out.println("Number of seats left: " + flight.getNumberOfSeatsLeft());
            }
                
        }
        else {
                System.out.println("Failed to book ticket. No seats available on this flight");
            }
        
    }
    
    public static void userChoose(int userInput, Manager m) {
        Scanner inputString = new Scanner(System.in);
        Scanner inputInt = new Scanner(System.in);
        int userFlightNumber,userAge,userMembership;
        String userOrigin, userDestination,userString, userName;
        
        if (userInput == 1) {
            System.out.print("Enter origin: ");
            userOrigin = inputString.nextLine();
            System.out.print("Enter destination: ");
            userDestination = inputString.nextLine();
            
            m.availableFlights(userOrigin,userDestination);
        }
        else if (userInput == 2) {
            System.out.print("Enter flight a number: ");
            userFlightNumber = inputString.nextInt();
            
            if(m.getFlight(userFlightNumber) != null) {
                System.out.println(m.getFlight(userFlightNumber).toString());
            }
            else {
                System.out.println("No flights with this number");
            }
        }
        else if (userInput == 3) {
            boolean isRunning = false;
            
            System.out.print("What is the flight number? ");
            userFlightNumber = inputInt.nextInt();
            
            if (m.getFlight(userFlightNumber) != null) {
                System.out.print("Are you a member or non-member? Y/N\n");
                userString = inputString.nextLine();
                
                do {
                    if (userString.equalsIgnoreCase("Y")) {
                        System.out.print("Enter your name: ");
                        userName = inputString.nextLine();
                        System.out.print("Enter your age an the number of years you have been a member: ");
                        userAge = inputInt.nextInt();
                        userMembership = inputInt.nextInt();

                        m.bookSeat(userFlightNumber, new Member(userName,userAge,userMembership));

                        isRunning = true;
                    }
                    else if (userString.equalsIgnoreCase("N")) {
                        System.out.print("Enter your name: ");
                        userName = inputString.nextLine();
                        System.out.print("Enter your age: ");
                        userAge = inputInt.nextInt();

                        m.bookSeat(userFlightNumber, new NonMember(userName,userAge));

                        isRunning = true;
                    }
                    else {
                        System.out.println("Invalid input");
                        break;
                    }
                }while(isRunning == false);
            }else {
                System.out.println("No flights with this number");
            }
        }

        
    }
    
    public static void main(String []args) {
        Manager manager = new Manager();
        Scanner input = new Scanner(System.in);
        
        int userInput;
        
        
        try {
            manager.createFlights();        
        }catch (IllegalArgumentException e) {
            System.out.println("-----------------------------------------------------------");
            System.out.println("Error when creating flight plan. Origin and destination are the same.");
            System.out.println("Continue with current flights or recompile to recreate flight plans");
        }
        
        do {
            
            System.out.println("\nTo exit program, enter 0");
            System.out.println("To check for available flights, enter 1");
            System.out.println("To check for a flight numbers, enter 2");
            System.out.println("To book a flight, enter 3\n");
            
            userInput = input.nextInt();
            
            if (userInput < 0 || userInput > 4) {
                System.out.println("Invalid input try again.");
            }
            else{
               userChoose(userInput, manager);
            }
            
        } while(userInput != 0);
    }
   
    
}
