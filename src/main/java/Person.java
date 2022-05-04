
public class Person extends PersonQueue{
   int arrivalTime;
   int departureTime;
   int processingTime;   
   public Person(int arrivalTime, int departureTime, int processingTime)
   {
       this.arrivalTime = arrivalTime;
       this.departureTime = processingTime;
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
   public void setDeparture(int departureTime)
   {
       this.departureTime = departureTime;
   }
   public void setProcess(int processingTime)
   {
       this.processingTime = processingTime;
   }
   public void setArrival(int arrivalTime)
   {
       this.arrivalTime = arrivalTime;
   }
   
}
