
public class Event {
//can be “arrival” or “departure”
//if “arrival”, this will be the arrival time of a job
//if “departure”, //this will be the departure time of a job
    
    String type = ""; 
    int time; 
    int numQueue;
    int process;
    
    public Event(int time,String type,int numQueue,int process)
    {
        this.process=process;
        this.type=type;
        this.numQueue= numQueue;
        this.time=time;
        numQueue = numQueue+1;
        
        if (type.equals("arrival"))
        {
                   /*System.out.println();
                   System.out.println();
                   System.out.println();*/
            System.out.println(time + "\t\t\tCustomer Arrives (Processing time is " +process + ") -Cusomer Joins Queue " + numQueue);
        }
    }
    public Event(int time, String type, int numQueue)
    {
        this.time=time;
        this.type = type;
        this.numQueue=numQueue;
        numQueue = numQueue+1;
        if(type.equals("departure"))
        {
            System.out.println(time+ "\t\t\tCustomer Departs Queue " + numQueue);
        }
    }
    
//“departure”, this will be the checkout line that had a departure event   
}
