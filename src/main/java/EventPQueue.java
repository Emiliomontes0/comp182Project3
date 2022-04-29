
public class EventPQueue {
    //because this is a priority queue, you will need enqueue(), dequeue(), isEmpty()
    public EventPQueue()
    {
        int numQueues;
        PersonQueue [] pq;
        PersonQueue queue = new PersonQueue();
        pq =queue.getQueue();
        numQueues = queue.getNumQueue();
        
        
        
        
        
        
        
        //storage[0] = new IntNode(head_data, head_ptr);
        //syntax to create linklist in object array
        
        /*
         for(int i = 0;i<peopleQueued.length;i++)
        {
            peopleQueued[i][0]=0;
        }
        for(int i=0;i<departArray.length;i++)
        {
            for(int j =0; j<departArray[i].length;i++)
            {
                departArray[i][j]=0;
            }
        }
        
        //simulation processes
        while(numPeopleCounter!=temp.length)
        {
            //enqueue
            PersonQueue p = temp[numPeopleCounter];
            Person n = (Person)p;
            int personTime = n.getArrival();
            if(personArrivalChecker == personTime)
            {
                //enqueue();
                personArrivalChecker=0;
            }  
            else
                personArrivalChecker++;
            
            //dequeue
            
            for(int i=0;i<peopleQueued[i][0];i++)
            {
                for(int j =0; departArray[i][j]==0 && j<peopleQueued[i][0];j++)
                {
                    if(j>0)
                    {
                        delay = departArray[i][j-1] - ((Person)array[i]).getArrival();
                    }
                    departArray[i][j] = ((Person)array[i]).getArrival()+((Person)array[i]).getProcess()+delay;
                    if(totalTime==departArray[i][j])
                    {
                        //dequeue(j);
                    }
                }
            }
            totalTime++;
        }*/
    }
    /*public void enqueue()
    {
        int tracker=0;
        while(true)
        {
            //if(!isEmpty(tracker))
            if(peopleQueued[tracker][0]!= 0)
            {
             tracker++;
              if(peopleQueued[tracker][0]==0)
              {
                array[tracker] = temp[numPeopleCounter];
                peopleQueued[tracker][0] += 1;
                numPeopleCounter++;
                break;
               }
                
            }
            else 
            {
            array[tracker] =temp[numPeopleCounter];
            peopleQueued[tracker][0] += 1;
            numPeopleCounter++;
            break;
            }
        }
        
    }
    public void dequeue(int n)
    {
       int helper =0;
       do
       {
       array[n] = array[n];
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
    }*/
    
}
