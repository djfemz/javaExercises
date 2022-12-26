package chapterFour;

public class PythagorasTripple {

    public static void main(String[] args) {
        boolean isValidPythagoreanTripple;
        for (int sideA = 1; sideA <= 500; sideA++) {
            for(int sideB=sideA+1;sideB<=500;sideB++){
                for (int sideC = sideB+1; sideC <= 500; sideC++) {
                    isValidPythagoreanTripple=(sideA*sideA + sideB*sideB)==sideC*sideC;
                    if (isValidPythagoreanTripple){
                        System.out.println(sideA + " " + sideB +" " + sideC);
                    }
                }
            }
        }
    }


}
