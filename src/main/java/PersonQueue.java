
public class PersonQueue {
int totalTime =0; 
int delayTotal;

PersonQueue [] array;
PersonQueue [] temp;
int setQueue;

//the sum of all processing times in this queue
//can use any structure
//because this is a queue, you will need enqueue(), dequeue(), isEmpty() 
    public PersonQueue()
    {
    }
    
    public void setArray(PersonQueue [] temp)
    {
       array=temp;
    }
    public void setQueue(int setQueue)
    {
        this.setQueue=setQueue;
    }
    public int getNumQueue()
    {
        return setQueue;
    }
    public void setTime (int n)
    {
        totalTime = n + totalTime;
    }
    public int getTime()
    {
        return totalTime;
    }
    public PersonQueue[] getQueue()
    {
        return array;
    }
    public void delay(int n)
    {
        delayTotal = delayTotal + n;
    }
    public int getDelay()
    {
        return delayTotal;
    }
}
