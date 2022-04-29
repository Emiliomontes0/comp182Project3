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
       PersonQueue [] temp;
       
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
      // System.out.println("*");
       Store store = new Store (temp1, temp2, temp3, temp4, temp5, temp6);
       //System.out.println(store.getArray());
       
       
       
       PersonQueue pq = new PersonQueue();
       pq.setQueue(store.getQueue());
       pq.setArray(store.getArray());
       
       System.out.println();
   }
}
