package cohort15.nedAir;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NedAirTest {

    private  NedAir nedAir;
    private int firstClassTicketBooking;
    private int economyClassTicketBookingRequest;
    @BeforeEach
    void setUp() {
         firstClassTicketBooking = 1;
         economyClassTicketBookingRequest = 2;

        //given
        nedAir=new NedAir();
    }

    @Test
    public void testNedAirHasTenSeats(){
        //when
        boolean[] seats = nedAir.getSeats();
        //assert
        assertEquals(10, seats.length);
    }

    @Test
    public void testThatPlaneSeatsAreUnoccupiedByDefault(){
        //when
        boolean[] seats = nedAir.getSeats();
        //assert
        boolean[] expected = {false, false, false, false, false, false, false, false, false, false};
        assertEquals(10, expected.length);
        assertArrayEquals(expected, seats);

    }

    @Test
    public void testThatCustomersCanBookFirstClassPlaneTicket(){
        //when
        nedAir.bookTicket(firstClassTicketBooking);
        //assert
        int planeFirstSeat=0;
        boolean[] seats = nedAir.getSeats();
        assertTrue(seats[planeFirstSeat]);
    }

    @Test
    public void testThatCustomerCanBookEconomyClassTicket(){
        int planeFirstEconomySeat = 5;
        //when
        nedAir.bookTicket(economyClassTicketBookingRequest);
        //assert
        boolean[] seats = nedAir.getSeats();
        assertTrue(seats[planeFirstEconomySeat]);
    }

    @Test
    public void testThatExceptionIsThrownWhenBookingCategoryIsInvalid(){
        int invalidBookingCategory = 10;
        assertThrows(RuntimeException.class,
                ()->nedAir.bookTicket(invalidBookingCategory));
    }

    @Test
    public void testThatExceptionIsThrownWhenFirstClassSectionIsFilled(){
        nedAir.bookTicket(firstClassTicketBooking);
        nedAir.bookTicket(firstClassTicketBooking);
        nedAir.bookTicket(firstClassTicketBooking);
        nedAir.bookTicket(firstClassTicketBooking);
        nedAir.bookTicket(firstClassTicketBooking);
        assertThrows(RuntimeException.class, ()->nedAir.bookTicket(firstClassTicketBooking),
                nedAir.getSectionFullErrorMessage());
    }

    @Test
    public void testThatExceptionIsThrownWhenEconomyClassSectionIsFilled(){
        nedAir.bookTicket(economyClassTicketBookingRequest);
        nedAir.bookTicket(economyClassTicketBookingRequest);
        nedAir.bookTicket(economyClassTicketBookingRequest);
        nedAir.bookTicket(economyClassTicketBookingRequest);
        nedAir.bookTicket(economyClassTicketBookingRequest);
        assertThrows(RuntimeException.class, ()->nedAir.bookTicket(economyClassTicketBookingRequest),
                nedAir.getEconomyClassSectionFilledErrorMessage());
    }

    @Test
    public void testThatBoardingPassCanBeGenerated(){
        FlightForm flightForm = new FlightForm("Lagos", "Zamfara");
        String boardingPass = nedAir.getBoardingPass(flightForm);
        assertNotNull(boardingPass);
        assertTrue(boardingPass.contains("Flight Category"));
    }

}