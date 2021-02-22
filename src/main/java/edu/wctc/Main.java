package edu.wctc;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws MissingNameException {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter First Name> ");
        String FirstName=keyboard.toString();
        System.out.print("Enter Middle initial> ");
        String Middle=keyboard.toString();
        FirstNameUtility f=new FirstNameUtility();
        f.encodeFirstName(FirstName, Middle);
        System.out.print("Enter Last Name> ");
        String Last=keyboard.toString();
        System.out.print("Enter Month(1-12)> ");
        int month=keyboard.nextInt();
        System.out.print("Enter Day(1-31)> ");
        int Day=keyboard.nextInt();
        System.out.print("Enter Year> ");
        int Year=keyboard.nextInt();
        System.out.print("Enter Gender(M or F)> ");
        char Gender=keyboard.next().charAt(0);
        MonthDayGenderUtility m= new MonthDayGenderUtility(Year, month,Day, Gender);
        LastNameUtility l=new LastNameUtility(Last);
        


    }
}
