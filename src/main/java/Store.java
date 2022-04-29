public class Store {
PersonQueue[] mypq;

int numberOfQueues;
int customer;
int minJob;
int maxJob;
int minProcess;
int maxProcess;
// will probably need an add method that adds a Person to the PersonQueue with the  
//least number of people
//will probably need a remove method that removes a person from a PersonQueue who 
//has finished the checkout process
    public Store(int numberOfQueues, int customer, int minJob, int maxJob, int minProcess, int maxProcess)
    {
        this.numberOfQueues = numberOfQueues;
        this.customer = customer;
        this.minJob = minJob;
        this.maxJob = maxJob;
        this.minProcess = minProcess;
        this.maxProcess = maxProcess;
        
        mypq = new PersonQueue [customer];
        
        for(int i =0; i<customer; i++)
        {
          Person p = new Person(Random(minJob, maxJob),0, Random(minProcess, maxProcess));
          mypq[i] = (PersonQueue) p;
        }
        
    }
    public void addPerson(int i)
    {
        Person p = new Person(Random(minJob, maxJob),0, Random(minProcess, maxProcess));
        mypq[i] = (PersonQueue) p;
    }
    public int Random(int min, int max)
    {
        int r = (int) (Math.random()*(max-min+1)+min); 
        return r;
    }
    public PersonQueue [] getArray()
    {
        return mypq;
    }
    public int getQueue()
    {
        return numberOfQueues;
    }
    public int getCustomer()
    {
        return customer;
    }
}
