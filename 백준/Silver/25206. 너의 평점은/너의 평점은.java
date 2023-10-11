
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        
        double sumTime = 0;
        double mulScore = 0;
        
        while(scanner.hasNextLine()){
            String[] sen = scanner.nextLine().split("\\s");

            double score = 0.0;

            if(sen[2].equals("A+"))score = 4.5;
            else if(sen[2].equals("A0")) score = 4.0;
            else if(sen[2].equals("B+")) score = 3.5;
            else if(sen[2].equals("B0")) score = 3.0;
            else if(sen[2].equals("C+")) score = 2.5;
            else if(sen[2].equals("C0")) score = 2.0;
            else if(sen[2].equals("D+")) score = 1.5;
            else if(sen[2].equals("D0")) score = 1.0;
            else if(sen[2].equals("F")) score = 0.0;

            if(!sen[2].equals("P")) {
                sumTime += Double.parseDouble(sen[1]);
                mulScore += Double.parseDouble(sen[1]) * score;
            }
        }
        scanner.close();
        System.out.printf("%.6f", mulScore/sumTime);


    }
}