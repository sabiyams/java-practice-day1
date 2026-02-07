//create node class
class Node{
    int data;
    Node next;
    //create an contructor
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Likedlistanother {
    public static void main(String[] args) {
        //create an linked list
        Node p1=new Node(2);
        Node p2=new Node(3);
        Node p3=new Node(4);
        //how to connect the next node
        System.out.println(p1.data);
        p1.next=p2;
        p2.next=p3;
        //if you want to print the next of the data 
        System.out.println(p1.next.data);
        System.out.println(p2.next.data);
        Node head=p1;
    }
    
}
