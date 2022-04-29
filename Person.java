
public class Person extends PersonQueue{
   int arrivalTime;
   int departureTime;
   int processingTime;   
   public Person(int arrivalTime, int departureTime, int processingTime)
   {
       this.arrivalTime = arrivalTime;
       this.departureTime = departureTime;
       this.processingTime = processingTime;
   }
   public int getArrival()
   {
       return arrivalTime;
   }
   public int getDeparture()
   {
       return departureTime;
   }
   public int getProcess()
   {
       return processingTime;
   }
   
}
