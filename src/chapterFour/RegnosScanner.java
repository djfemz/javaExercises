package chapterFour;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class RegnosScanner {

    private final InputStream inputStream;

    public RegnosScanner(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    public int nextInt(){
        try{
            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(inputStream));
            String input = reader.readLine();
            return Integer.parseInt(input);
        }catch (IOException | NumberFormatException exception){
            System.out.println(exception.getLocalizedMessage());
            throw new RuntimeException(exception.getMessage());
        }
    }

    public double nextDouble(){
        try(BufferedReader reader =
                    new BufferedReader(new InputStreamReader(inputStream))){
            String input = reader.readLine();
            return Double.parseDouble(input);
        }catch (IOException | NumberFormatException exception){
            System.out.println(exception.getLocalizedMessage());
            throw new RuntimeException(exception.getMessage());
        }
    }
}
