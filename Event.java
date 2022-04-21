
public class Event {
//can be “arrival” or “departure”
    String type = ""; 
//if “arrival”, this will be the arrival time of a job
//if “departure”, //this will be the departure time of a job
    int time; 
    int param;
    public Event()
    {
        if (type.equals("arrival"))
        {
        time =0;
        }
     
        else if (type.equals("departure"))
        {
    
        }
    }
//“departure”, this will be the checkout line that had a departure event   
}
