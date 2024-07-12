package LinkedList;

public class Basics {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }

    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data){
        //step1 : create new node
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head = tail = newNode;
            return;

        }
        
        //step2 : newnode.next = oldhead;
        newNode.next = head;
        //step3 : head = new node
        head = newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void addMid(int data,int index){
      
        if(index==1){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i =0;
        while(i<index-1){
            
            temp = temp.next;
            i++;

        }
        newNode.next= temp.next;
        temp.next = newNode;
       

    }
    public int removefirst(){
        if(size==0){
            System.out.print("Linked list is empty");
            return Integer.MAX_VALUE;
        }
        else if(size==1){
            int val = head.data;
            head = tail = null;
            size =0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
        
        
    }
    public int removeLast(){
        //prev.next = null;
        //tail = prev;
        if(size==0){
            System.out.print("Linked list is empty");
            return Integer.MAX_VALUE;
        }
        else if(size==1){
            int val = head.data;
            head = tail = null;
            size =0;
            return val;
        }
        //prev = size-2
        Node temp = head;
        for(int i =0;i<size-2;i++){
            temp = temp.next;

        }
        int val = temp.next.data;
        temp.next = null;
        tail = temp;
        size--;
        return val;
    }
    public void reverseLL(){
      
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev= curr;
            curr = next;

        }
        head = prev;
     

    }
    public  void print(){
        if(head==null){
            System.out.print("Linked List is empty");
        }
        Node temp = head;
        while(temp!=null){
            
            System.out.print(temp.data + " ");
            temp= temp.next;

        }
        System.out.println();
    }

    public static void main(String[] args){
        Basics ll = new Basics();
       
        ll.addFirst(1);
        
        ll.addFirst(2);
        
        ll.addLast(4);
        
        ll.addLast(5);
      
        ll.addMid(3, 2);
        
       
        // ll.removefirst();
      
        // ll.removeLast();
        ll.print();
        ll.reverseLL();
        ll.print();
      
       

    }
    
}
