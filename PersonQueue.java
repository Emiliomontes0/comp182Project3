
public class PersonQueue extends Person{
int totalTime; 
PersonQueue [][] array;
int queues;
int [] count;
int counter=0;
PersonQueue [] temp;
//the sum of all processing times in this queue
//can use any structure
//because this is a queue, you will need enqueue(), dequeue(), isEmpty() 
    public PersonQueue()
    {
        Store store = new Store();
        temp = store.getArray();
        queues = store.getQueue();
        array = new PersonQueue [queues][temp.length];
        count = new int [queues];
        for(int i = 0;i<count.length;i++)
        {
            count[i]=0;
        }
    }
    public void enqueue()
    {
        int tracker=0;
        while(true)
        {
            if(count[tracker]!= 0)
            {
             tracker++;
              if(count[1]==0)
              {
                array[tracker][count[tracker]] = temp[counter];
                count[tracker] += 1;
                counter++;
                break;
               }
                
            }
            else 
            {
            array[tracker][count[tracker]] =temp[counter];
            count[tracker] += 1;
            counter++;
            break;
            }
        }
        
    }
    public void dequeue(int n)
    {
       int helper =0;
       do
       {
       array[n][helper] = array[n][helper+1];
       helper++;
       }
       while(array[n][helper]!=null);
    }
    public boolean isEmpty(int n)
    {
        
        if(n!=0)
        {
            return false;
        }
        return true;
    }
}
