import java.util.Scanner;
public class Driver {
   public static void main(String []args)
   {
       int temp1;
       int temp2;
       int temp3;
       int temp4;
       int temp5;
       int temp6;
       Scanner output = new Scanner (System.in);
       System.out.println("Welcome to Job Simulator");
       System.out.println("How many queues do you want to simulate?");
       temp1 = output.nextInt();
       System.out.println("How many customer do you want to simulate?");
       temp2 = output.nextInt();
       System.out.println("What is the minimum time between job arrivals?");
       temp3 = output.nextInt();
       System.out.println("What is the maximum time for a job?");
       temp4 = output.nextInt();
       System.out.println("What is the minimum processing time for a job?");
       temp5 = output.nextInt();
       System.out.println("What is the maximum processing time for a job?");
       temp6 = output.nextInt();
       
   }
}
// i dont have to use the classes professor recommended 
// use only what i need
