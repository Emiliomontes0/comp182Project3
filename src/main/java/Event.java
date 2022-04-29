
public class Event {
//can be “arrival” or “departure”
//if “arrival”, this will be the arrival time of a job
//if “departure”, //this will be the departure time of a job
    
    String type = ""; 
    int time; 
    int numQueue;
    
    public Event(int time,String type,int numQueue)
    {
        this.type=type;
        this.numQueue= numQueue;
        if (type.equals("arrival"))
        {
            System.out.println("Customer Arrives (Processing time is -" +time + ") -Cusomer Joins Queue " + numQueue);
        }
     
        else if (type.equals("departure"))
        {
            System.out.println("Customer Departs Queue " + numQueue);
        }
    }
    
//“departure”, this will be the checkout line that had a departure event   
}
