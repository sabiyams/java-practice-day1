public class Exampleofstack {
    //this node is epresent the evey node in stack so create class node
    static class Node{
        //what are the variables you defined
        int data;
        Node next;//it connect  the next of the element
        public Node(int data){
            this.data=data;
            next=null;
        }
        //create the stack
        static class Stack{
            //linked list containe one head node so create that node
            public static Node head;
            //if in case the stack is empty
            public static boolean isEmpty(){
                return head==null;
            }
            //create push function
            public static void push(int data){
                //create the new node
                Node newnNode=new Node(data);
                if(isEmpty()){
                    head=newnNode;
                    return;
                }
                newnNode.next=head;
                head=newnNode;
            }
            //create pop 
            public static int pop(){
                if(isEmpty()){
                    return -1;
                }
                int top=head.data;
                head=head.next;
                return top;
            }
            //create peek
            public static int peek(){
                if(isEmpty()){
                    return -1;
                }
                return head.data;
            }
        }
        //main method
        public static void main(String[] args) {
            //create the stack object
            Stack s=new Stack();
            s.push(1);
            s.push(2);
            s.push(3);
            s.push(4);
            //return the stack 
            while(!s.isEmpty()){
                System.out.println(s.peek());//if top element will print then it will delete
                s.pop();
            }
        }
    }
}
