package LinkedList;

public class Search {
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
           

        }
    }
    public static Node head;
    public static Node tail;
    
    public void add(int index,int data){
        Node newNode = new Node(data);
        if(index < 1){
            System.out.print("Invalid position");
        }
        if(index == 1){
            newNode.next = head;
            head = tail = newNode;

        }
        else{
            Node temp = head;
            int i =1;
            while(i < index-1){
                temp = temp.next;
                i++;
    
            }
            newNode.next= temp.next;
            temp.next = newNode;

        }
       
    }
    public int search(int key){
        Node temp = head;
        int i =1;
        
        while(temp!=null){
           
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
            
        }
        return -1;
    }
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args){
        Search ll = new Search();
        
        ll.add(1,2);
        ll.add(2,3);
        ll.add(3,4);
        ll.add(4, 5);
        ll.print();
        System.out.print(ll.search(3));


    }
    
    
}
