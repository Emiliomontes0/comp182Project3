public class Store {
Person temp;
PersonQueue[] mypq;
EventPQueue myeq;
private int numberOfQueues;
int totalDelay;
int customer;
int minJob;
int maxJob;
int minProcess;
int maxProcess;
int custCount;
int custTracker;
// will probably need an add method that adds a Person to the PersonQueue with the  
//least number of people
//will probably need a remove method that removes a person from a PersonQueue who 
//has finished the checkout process
    public Store()
    {
        
    }
    public Store(int numberOfQueues, int customer, int minJob, int maxJob, int minProcess, int maxProcess)
    {
        this.numberOfQueues = numberOfQueues;
        this.minJob = minJob;
        this.maxJob = maxJob;
        this.minProcess = minProcess;
        this.maxProcess = maxProcess;
        this.customer = customer;
        mypq = new PersonQueue [customer];
        for(int i =0; i<mypq.length; i++)
        {
           addPerson(); 
        }
    }
    public void addPerson()
    {
        Person p = new Person(Random(minJob, maxJob),0, Random(minProcess, maxProcess));
        mypq[custTracker] = (PersonQueue) p;
    }
    /*public void removePerson()
    {
        mypq [custCount] = null;
    }*/
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
