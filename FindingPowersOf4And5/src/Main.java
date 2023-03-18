import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner num = new Scanner(System.in);
        System.out.print("Please choose a number : ");
        int chosenNum = num.nextInt();
        System.out.println("***********************");
        int i = 1;
        while(i < chosenNum){
        // Math.ceil method rounds the specified double value to the upward integer while Math.floor does the opposite.
       // Math.log returns the natural logarithm (base is e).
             // this condition finds out if the ceil value of i equals to floor value by comparing their logarithm values.
            if((int)(Math.ceil((Math.log(i) / Math.log(4)))) ==
                    (int)Math.floor((Math.log(i) / Math.log(4))) ||
                    (int)(Math.ceil((Math.log(i) / Math.log(5)))) ==
                            (int)Math.floor((Math.log(i) / Math.log(5)))){
                System.out.println("The powers of 4 or 5 : " + i);

            }
            i++;

        }
    }
}
