package cohort15.nedAir;

import java.security.SecureRandom;
import java.time.LocalDate;

public class NedAir {
    private final boolean[] seats;
    private final int FIRST_CLASS_TICKET_CATEGORY = 1;
    private final int ECONOMY_CLASS_TICKET_CATEGORY = 2;
    private final String SECTION_FULL_ERROR_MESSAGE ="Section don full";

    private int currentSeatNumber;

    private static SecureRandom random = new SecureRandom();
    private static String[] gates = {"A", "B", "C", "D"};




    public int getFirstClassTicketCategory() {
        return FIRST_CLASS_TICKET_CATEGORY;
    }

    public int getEconomyClassTicketCategory() {
        return ECONOMY_CLASS_TICKET_CATEGORY;
    }

    public String getSectionFullErrorMessage() {
        return SECTION_FULL_ERROR_MESSAGE;
    }


    public NedAir(){
        int numberOfSeatsOnPlane = 10;
        this.seats=new boolean[numberOfSeatsOnPlane];
    }

    public boolean[] getSeats() {
        return seats;
    }


    public void bookTicket(int bookingCategory) {
        boolean isFirstClassBookingRequest = bookingCategory==1;
        boolean isEconomyClassBookingRequest =bookingCategory==2;
        int lastFirstClassSeat = 4;
        int lastEconomyClassSeat = 9;
        boolean isFirstClassSectionFull = seats[lastFirstClassSeat];
        boolean isEconomyClassSectionFull = seats[lastEconomyClassSeat];
        if ((isFirstClassSectionFull&&isFirstClassBookingRequest)||
                (isEconomyClassSectionFull&&isEconomyClassBookingRequest))
            throw new RuntimeException(SECTION_FULL_ERROR_MESSAGE);
        boolean isValidBookingCategory = isFirstClassBookingRequest||isEconomyClassBookingRequest;
        if (!isValidBookingCategory)
            throw new RuntimeException("invalid booking category, enter 1 for first class booking and 2 for economy class booking");
        if (bookingCategory== FIRST_CLASS_TICKET_CATEGORY) bookFirstClassSeat();
        else bookEconomyClassSeat();
    }

    private void bookEconomyClassSeat() {
        for (int counter = 5; counter < seats.length; counter++) {
            boolean isOccupiedSeat = seats[counter];
            if (!isOccupiedSeat) {
                seats[counter] = true;
                currentSeatNumber=counter+1;
                break;
            }
        }
    }

    private void bookFirstClassSeat() {
        for (int counter = 0; counter < seats.length-5; counter++) {
            boolean isOccupiedSeat = seats[counter];
            if (!isOccupiedSeat) {
                seats[counter] = true;
                currentSeatNumber=counter+1;
                break;
            }
        }
    }

    public String getEconomyClassSectionFilledErrorMessage() {
        return SECTION_FULL_ERROR_MESSAGE;
    }


    public String getBoardingPass(FlightForm flightForm) {
        return buildBoardingPass(flightForm);
    }

    private String buildBoardingPass(FlightForm flightForm){
        return " ".repeat(20)+ "Ned Air\n"+ "Ticket Number: "+" ".repeat(6) + generateTicketNumber()
                +"\n"+"Seat Number: "+" ".repeat(8)+ currentSeatNumber+"\n"
                +"Flight Date: "+" ".repeat(8)+ LocalDate.now() +"\n"
                +"Gate Number: "+" ".repeat(8)+ gates[random.nextInt(3)]
                +"\nOrigin: "+" ".repeat(13)+flightForm.getOrigin()
                +"\nDestination: "+" ".repeat(8)+flightForm.getDestination()
                +"\nFlight Category: "+" ".repeat(4)+getFlightCategory();
    }

    private String getFlightCategory(){
        boolean isFirstClassFlightCategory=currentSeatNumber>0&&currentSeatNumber<=5;
        if (isFirstClassFlightCategory) return "FIRST CLASS";
        else return "ECONOMY";
    }

    private static String generateTicketNumber(){
        StringBuilder   generatedTicketNumber = new StringBuilder("NedAir-");
        for (int i = 0; i < 9; i++) {
            generatedTicketNumber.append(random.nextInt( 9));
        }
        return generatedTicketNumber.toString();
    }



}
