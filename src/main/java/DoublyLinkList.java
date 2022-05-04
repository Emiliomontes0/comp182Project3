import java.util.*;
class Node{
        private PersonQueue letter;
        private Node next, prev;
        public Node(PersonQueue p){
        letter = p;
        next = prev = null;
        }
        public PersonQueue getPerson(){
        return letter;
        }
        public Node getNext(){
        return next;
        }
        public void setNext(Node n){
        next = n;
        }
        public Node getPrev(){
        return prev;
        }
        public void setPrev(Node p){
        prev = p;
        }
        
    }
    
    
public class DoublyLinkList {
    Node head, tail;
    public DoublyLinkList(){
		head = tail = null;
    }
    public void insert(PersonQueue c)
    {//prepend
        Node nd = new Node(c);
        nd.setNext(head);
        if(head != null)
            head.setPrev(nd);
        else
            tail = nd;
        head = nd;
    }
    
    public void insert2(PersonQueue c)
    {//append
        Node nd = new Node(c);
        nd.setPrev(tail);
        if(tail != null)
            tail.setNext(nd);
        else
            head = nd;
        tail = nd;
    }
    public void removeFirstLast(){
        if(head == tail)
            head = tail = null;
        else{
            head = head.getNext();
            head.getPrev().setNext(null);
            head.setPrev(null);
        }
        
    }
    public PersonQueue getPersonQ()
    {
        return head.getPerson();
    }
    public PersonQueue getNextPerson()
    {
        Person temp;
        Node curr;
        curr = head.getNext();
        temp =(Person) curr.getPerson();
        return temp;
    }

}

