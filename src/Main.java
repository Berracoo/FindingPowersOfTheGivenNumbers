import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner num = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int chosenNum = num.nextInt();
        System.out.println("**********");

   for(int i = 1; i < chosenNum; i++){
       // Math.ceil method rounds the specified double value to the upward integer while Math.floor does the opposite.
       // Math.log returns the natural logarithm (base is e).
        // this condition finds out if the ceil value of i equals to floor value by comparing their logarithm values.

          if((int)(Math.ceil((Math.log(i) / Math.log(2)))) ==
                  (int)Math.floor((Math.log(i) / Math.log(2)))){
              System.out.println("i is a power of 2 : " + i);
          }
        }
        //Another way of doing it
      /*  int i = 1;
        while( i < chosenNum){
            System.out.println(i);
            i *= 2;
        }*/
        //Another way of doing it
       /* int i = 1;
        int n = 0;
        while(i < chosenNum){
            if(i == Math.pow(2,n)){
                n++;
                System.out.println("Powers of 2 are : " + i);
            }
            i++;
        }*/
    }
}
