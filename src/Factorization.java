import java.util.ArrayList;
import java.util.Scanner;

public class Factorization {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        while(run) {
            System.out.print("Enter A Number:");
            int input = scanner.nextInt();
            if(input==0){
                run=false;
            }
            else {
                int numberToUse = 2;
                ArrayList<String> factors = new ArrayList<>();
                while (numberToUse < input) {
                    if (input % numberToUse == 0) {
                        factors.add(String.valueOf(numberToUse));
                    }
                    numberToUse++;
                }
                String sentence = "There are " + factors.size() + " factors for the number " + input + ":";
                for (int x = 0; x < factors.size(); x++) {
                    sentence = sentence + " " + factors.get(x);
                }
                System.out.println(sentence);
            }
        }
    }
}