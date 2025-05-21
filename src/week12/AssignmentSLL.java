package week12;

public class AssignmentSLL{
    AssignmentNode head;
    AssignmentNode tail;

    boolean isEmpty(){
        return(head == null);
    }

    boolean isFull(){
        return false;
    }

    void print(){
        if(!isEmpty()){
            AssignmentNode tmp = head;
            System.out.println("LinkedList Data: ");
            while(tmp != null){
                tmp.data.print();
                tmp = tmp.next;
            }
        }else{
            System.out.println("LinkedList is empty!!");
        }
    }

    void add(Assignment std){
        AssignmentNode newNode = new AssignmentNode(std, null);
        if (isEmpty()){
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    void removeFirst(){
        if(isEmpty()){
            System.out.println("LinkedList is empty!!");
        } else if (head == tail){
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    void peek(){
        if(!isEmpty()){
            System.out.println("Front data: ");
            head.data.print();
        } else {
            System.out.println("LinkedList is empty!!!");
        }
    }

    void displayRear(){
        if(!isEmpty()){
            System.out.println("Rear data: ");
            tail.data.print();
        } else {
            System.out.println("LinkedList is empty!!!");
        }
    }
    void clear(){
        if(!isEmpty()){
            head = tail = null;
            System.out.println("All data has been successfully removed!!");
        } else {
            System.out.println("LinkedList is already empty!!");
        }
    }

    void callNextStudent(){
        if (isEmpty()){
            System.out.println("LinkedList is empty!!");
            return;
        }

        System.out.println("Processing student:");
        head.data.print();
        System.out.println("========================");

        removeFirst();

        if(!isEmpty()){
            System.out.println("The next student:");
            head.data.print();
        } else {
            System.out.println("No more students in the LinkedList!!");
        }
    }
}