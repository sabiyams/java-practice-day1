public class Linkedlistprblm {
    static class  node{
        int data;//start node head
        node next;//inconncet the net node
        public node(int data){
            this.data=data;
            this.next=null;
        }
    } 
    //It's marked static because it's likely inside another class
    //singlelinked list first node is head then we write first node using method
    static class SinglyLinkedList{
        node head;
        //then head is end null that why it write method
        public SinglyLinkedList(){
            head=null;
        }
        //it change the last node it the fist node
        public void AddFirst(int data){
            node newnode=new node(data);
            newnode.next=head;
            head=newnode;
        }
        public void AddLast(int data){
            node newnode=new node(data);
            if(head==null){
                head=newnode;
                return;
            }
            node current=head;
            while (current.next!=null) {
                current=current.next;
            }
            current.next=newnode;
        }
        public void removeFirst(){
            if(head==null){
                System.out.println("list is empty");
                return;
            }
            head=head.next;
        }
        public void display(){
            if(head==null){
                System.out.println("list isempty");
            }
            node current=head;
            while (current!=null) {
                System.out.print(current.data+"->");
                current=current.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList list=new SinglyLinkedList();
        list.AddFirst(10);//10
        list.AddFirst(20);//20->10
        list.AddFirst(30);//30->20->10
        list.AddFirst(40);//40->30->20->10
        list.AddLast(50);//40->30->20->10->50
        list.AddLast(60);//40->30->20->10->50->60

        System.out.println("linked list:");
        list.display();//it display the all items
        list.removeFirst();
        list.removeFirst();
        list.display();
    
    }
}

