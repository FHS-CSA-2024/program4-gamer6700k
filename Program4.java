//Youre on your own!
//Jk ask for help if you need it (but also look at previous programs!!)

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) { 
    int variable1 = 0; 
    int variable2 = 0; 
    int variable3 = 0;
    int variable4 = 0; 
    int sum = 0; 
    double average = 0;
    Scanner numScanner = new Scanner(System.in);
    System.out.println("Enter the first number");
    variable1 = numScanner.nextInt();
    System.out.println("Enter the second number"); 
    variable2 = numScanner.nextInt(); 
    System.out.println("Enter the third number");
    variable3 = numScanner.nextInt();
    System.out.println("Enter the fourth number");
    variable4 = numScanner.nextInt();
    sum = variable1 + variable2 + variable3 + variable4;
    System.out.println("The sum of the four numbers is: " + sum);
    average=(variable1 + variable2 + variable3 + variable4)/4.0;
    System.out.println("The average of the four numbers is: " + average);
    
    }






}

//Paste console output below:
/*


*/
