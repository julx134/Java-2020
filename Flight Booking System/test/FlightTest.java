/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jules
 */
public class FlightTest {
    
    public FlightTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    /**
     * Test of constructor method, of class Flight.
     */
    @Test
    public void testConstructor() {
       boolean test;
       try {
           Flight testFlight = new Flight(1030, 30, 5, 1000, "Toronto", "Kolkata","03/02/99 7:50 pm");
           test = true;
       }
       catch (IllegalArgumentException e) {
           test = false;
       }
       assertTrue(test);
    }
    
    @Test
    public void testInvalidConstructor() {
       boolean test;
       try {
           Flight testFlight = new Flight(1030, 30, 5, 1000, "Toronto", "Toronto","03/02/99 7:50 pm");
           test = false;
       }
       catch (IllegalArgumentException e) {
           test = true;
       }
       assertTrue(test);
    }
    

    /**
     * Test of getFlightNumber method, of class Flight.
     */
    @Test
    public void testGetFlightNumber() {
        System.out.println("getFlightNumber");
        Flight testFlight = new Flight(1030, 30, 5, 1000, "Toronto", "Kolkata","03/02/99 7:50 pm");
        int expResult = 1030;
        int result = testFlight.getFlightNumber();
        assertEquals(expResult, result);

    }

    /**
     * Test of getCapacity method, of class Flight.
     */
    @Test
    public void testGetCapacity() {
        System.out.println("getCapacity");
        Flight testFlight = new Flight(1030, 30, 5, 1000, "Toronto", "Kolkata","03/02/99 7:50 pm");
        int expResult = 30;
        int result = testFlight.getCapacity();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNumberOfSeatsLeft method, of class Flight.
     */
    @Test
    public void testGetNumberOfSeatsLeft() {
        System.out.println("getNumberOfSeatsLeft");
        Flight testFlight = new Flight(1030, 30, 5, 1000, "Toronto", "Kolkata","03/02/99 7:50 pm");
        int expResult = 25;
        int result = testFlight.getNumberOfSeatsLeft();
        assertEquals(expResult, result);
    }

    /**
     * Test of getOriginalPrice method, of class Flight.
     */
    @Test
    public void testGetOriginalPrice() {
        System.out.println("getOriginalPrice");
        Flight testFlight = new Flight(1030, 30, 5, 1000, "Toronto", "Kolkata","03/02/99 7:50 pm");
        double expResult = 1000.0;
        double result = testFlight.getOriginalPrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getOrigin method, of class Flight.
     */
    @Test
    public void testGetOrigin() {
        System.out.println("getOrigin");
        Flight testFlight = new Flight(1030, 30, 5, 1000, "Toronto", "Kolkata","03/02/99 7:50 pm");
        String expResult = "Toronto";
        String result = testFlight.getOrigin();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDestination method, of class Flight.
     */
    @Test
    public void testGetDestination_0args() {
        System.out.println("getDestination");
        Flight testFlight = new Flight(1030, 30, 5, 1000, "Toronto", "Kolkata","03/02/99 7:50 pm");
        String expResult = "Kolkata";
        String result = testFlight.getDestination();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDepartureTime method, of class Flight.
     */
    @Test
    public void testGetDepartureTime() {
        System.out.println("getDepartureTime");
        Flight testFlight = new Flight(1030, 30, 5, 1000, "Toronto", "Kolkata","03/02/99 7:50 pm");
        String expResult = "03/02/99 7:50 pm";
        String result = testFlight.getDepartureTime();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFlightNumber method, of class Flight.
     */
    @Test
    public void testSetFlightNumber() {
        System.out.println("setFlightNumber");
        int x = 1;
        Flight testFlight = new Flight(1030, 30, 5, 1000, "Toronto", "Kolkata","03/02/99 7:50 pm");
        testFlight.setFlightNumber(x);
        assertEquals(x, testFlight.getFlightNumber());
    }

    /**
     * Test of setCapacity method, of class Flight.
     */
    @Test
    public void testSetCapacity() {
        System.out.println("setCapacity");
        int x = 1;
        Flight testFlight = new Flight(1030, 30, 5, 1000, "Toronto", "Kolkata","03/02/99 7:50 pm");
        testFlight.setCapacity(x);
        assertEquals(x, testFlight.getCapacity());
    }

    /**
     * Test of setNumberOfSeatsLeft method, of class Flight.
     */
    @Test
    public void testSetNumberOfSeatsLeft() {
        System.out.println("setNumberOfSeatsLeft");
        int x = 1;
        Flight testFlight = new Flight(1030, 30, 5, 1000, "Toronto", "Kolkata","03/02/99 7:50 pm");
        testFlight.setNumberOfSeatsLeft(x);
        assertEquals(x, testFlight.getNumberOfSeatsLeft());
    }

    /**
     * Test of setOriginalPrice method, of class Flight.
     */
    @Test
    public void testSetOriginalPrice() {
        System.out.println("setOriginalPrice");
        double x = 1.0;
        Flight testFlight = new Flight(1030, 30, 5, 1000, "Toronto", "Kolkata","03/02/99 7:50 pm");
        testFlight.setOriginalPrice(x);
        assertEquals(x, testFlight.getOriginalPrice(),0.0);
    }

    /**
     * Test of setOrigin method, of class Flight.
     */
    @Test
    public void testSetOrigin() {
        System.out.println("setOrigin");
        String x = "USA";
        Flight testFlight = new Flight(1030, 30, 5, 1000, "Toronto", "Kolkata","03/02/99 7:50 pm");
        testFlight.setOrigin(x);
        assertEquals(x, testFlight.getOrigin());
    }

    /**
     * Test of getDestination method, of class Flight.
     */
    @Test
    public void testSetDestination() {
        System.out.println("setDestination");
        String x = "USA";
        Flight testFlight = new Flight(1030, 30, 5, 1000, "Toronto", "Kolkata","03/02/99 7:50 pm");
        testFlight.setDestination(x);
        assertEquals(x, testFlight.getDestination());
    }

    /**
     * Test of setDepartureTime method, of class Flight.
     */
    @Test
    public void testSetDepartureTime() {
        System.out.println("setDepartureTime");
        String x = "01/01/01 10:00pm";
        Flight testFlight = new Flight(1030, 30, 5, 1000, "Toronto", "Kolkata","03/02/99 7:50 pm");
        testFlight.setDepartureTime(x);
        assertEquals(x,testFlight.getDepartureTime());
    }

    /**
     * Test of bookASeat method, of class Flight.
     */
    @Test
    public void testBookASeat() {
        System.out.println("bookASeat");
         Flight testFlight = new Flight(1030, 30, 5, 1000, "Toronto", "Kolkata","03/02/99 7:50 pm");
        boolean expResult = true;
        boolean result = testFlight.bookASeat();
        assertEquals(expResult, result);
    }

    /**
     * Test of toSTring method, of class Flight.
     */
    @Test
    public void testToSTring() {
        System.out.println("toSTring");
         Flight testFlight = new Flight(1030, 30, 5, 1000, "Toronto", "Kolkata","03/02/99 7:50pm");
        String expResult = "Flight 1030, Toronto to Kolkata, 03/02/99 7:50pm, original price: $1000.0";
        String result = testFlight.toString();
        assertEquals(expResult, result);
    }
    
}
