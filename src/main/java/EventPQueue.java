import java.util.*;
public class EventPQueue {
    int arrivalTime=0;
    int delay=0;
    int departure;
    int totalTime=0;
    int numQueues;
    int counter=0;
    int [] currQueued;
    int [] departureTime;
    
    Event event;
    DoublyLinkList [] prioQ; 
    PersonQueue [] pq;
    
    //because this is a priority queue, you will need enqueue(), dequeue(), isEmpty()
    public EventPQueue(PersonQueue queue)
    {
        DoublyLinkList d = new DoublyLinkList();
        pq =queue.getQueue();
        numQueues = queue.getNumQueue();
        currQueued = new int [numQueues];
        departureTime = new int [numQueues];
        prioQ = new DoublyLinkList[numQueues];
        counter = 0;
        for(int i = 0;i<currQueued.length;i++)
        {
            currQueued[i]=0;
            departureTime[i]=0;
            prioQ[i]=d;
        }
        
        
        
        enqueue();
        //simulation processes
        while(true)
        {
          //enqueue
           if(counter<pq.length)
           {
            Person p;
            p = (Person)pq[counter];
            if(p.getArrival()==arrivalTime)
            {
                 enqueue();
                 arrivalTime =0;
             }
           }
           arrivalTime++;
           
           //dequeue
           for(int i=0; i<prioQ.length;i++)
           {
               //System.out.println(i);
              Person temp = (Person)prioQ[i].getPersonQ();
              departure = temp.getArrival()+temp.getProcess();//people that join after 0
              temp.setDeparture(departure);
               if(currQueued[i]>1)
               {
                   if(temp.getDeparture()==totalTime)
                   {
                           Person after = (Person) prioQ[i].getNextPerson();
                           delay = temp.getDeparture() - after.getArrival();
                           departureTime[i] = (delay+after.getArrival()+after.getProcess());
                           dequeue(i);
                           Person updated = new Person(after.getArrival(),departureTime[i],after.getProcess());
                           //prioQ[i].removeFirstLast();
                           //prioQ[i].insert(updated);
                           
                   }
                  
               }
               else if(temp.getDeparture()==totalTime)
               {
                   System.out.println(i);

                   dequeue(i);
               }
           }
           
           //checking if Store is empty
           if(counter == pq.length && isEmpty())
           {
               break;
           }
           totalTime++;
        }
    }
    public void enqueue()
    {
        int tracker=getMinIndex();
        prioQ[tracker].insert2(pq[counter]);
        //System.out.println("index: "+tracker);
        Person temp =(Person) pq[counter];
        int process = temp.getProcess();
        
        event = new Event(totalTime,"arrival",tracker,process);
        counter++;
        currQueued[tracker] += 1;
    }
    public void dequeue(int n)
    {
       prioQ[n].removeFirstLast();
       
       event = new Event(totalTime,"departure",n);
       currQueued[n]--;
    }
    public boolean isEmpty()
    {
        if(getMaxIndex()==0)
            return true;
        return false;
    }
    public int getMinIndex()
    {
        int min=currQueued[0];
        int index =0;
        for(int i=0;i<currQueued.length;i++)
        {
            if(min>currQueued[i])
            {
                min = currQueued[i];
                index = i;
            }
        }
        return index;
    }
    public int getMaxIndex()
    {
        int max = currQueued[0];
        int index =0;
        for(int i =0;i<currQueued.length;i++)
        {
            if(max<currQueued[i])
            {
                max = currQueued[i];
                index = i;
            }
        }
        return index;
    }
}
