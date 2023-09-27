public class Main {
    public static void main(String[] args) {
StackLinkedList sl=new StackLinkedList();
sl.push(10);
sl.push(20);
sl.push(30);
sl.push(40);
sl.printStack();
        System.out.println();
        System.out.println(sl.pop());
        sl.printStack();

    }
}

//implement stack using array
class Stack{
    int [] arr;
    int size;
    int toss=-1;
    public Stack(int size){
        arr=new int[size];
        this.size=size;
    }
    public boolean isEmpty(){
        return toss==-1;
    }
    public boolean isOverload(){
        return toss==size-1;
    }

    public void push(int data){
        if(isOverload()){
            System.out.println("Overflow");
        }
        toss++;
        arr[toss]=data;
    }

    public int pop(){
        int data;
        if(isEmpty()){
            System.out.println("Stack is Empty");
        }
        data=arr[toss];
        toss--;
        return data;
    }
    public int peek(){
        return arr[toss];
    }

    public void printStack(){
        for(int i=0;i<=toss;i++){
            System.out.print(arr[i] + " ");
        }
    }
}

//implemented stack using linkedlist
class StackLinkedList{
    Node head;
public StackLinkedList(){
    this.head=null;
}


    public boolean isEmpty(){
        return head==null;
    }

    public void push(int x){
        Node newNode=new Node(x);
        newNode.next=head;
        head=newNode;
    }

    public int pop(){
        int data;
        if(isEmpty()){
            System.out.println("Stack us Empty");
        }
        data=head.data;
        head=head.next;
        return data;
    }

    public void printStack(){
        Node curr=head;
        while (curr!=null){
            System.out.print(curr.data + "  ");
            curr=curr.next;
        }
    }

}

 class Node {
     int data;
     Node next;


     public Node(int data) {
         this.data = data;
         this.next = null;
     }

 }



