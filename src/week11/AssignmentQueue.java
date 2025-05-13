package week11;

public class AssignmentQueue{
    Assignment[] data;
    int front, rear, size, max, approvedCount;
    int max_approved = 30;

    public AssignmentQueue(int n){
        max = n;
        data = new Assignment[max];
        size = 0;
        front = 0;
        rear = -1;
        approvedCount = 0;
    }

    int getApprovedCount(){
        return approvedCount;
    }

    int getRemainingQuota(){
        return max_approved-approvedCount;
    }
    boolean isEmpty(){
        if (size == 0){
            return true;
        } else {
            return false;
        }
    }

    boolean isFull(){
        if (size == max){
            return true;
        }else{
            return false;
        }
    }

    void clear(){
        if (!isEmpty()){
            front = rear = -1;
            size = 0;
            System.out.println("All data has been successfully removed!");
        }else{
            System.out.println("Queue is already empty!!");
        }
    }

    void enqueue(Assignment dt){
        if(isFull()){
            System.out.println("Queue is full!!");
            return;
        }
        rear = (rear+1) % max;
        data[rear] = dt;
        size++;
        System.out.printf("%s is successfully added at index %d\n", dt.name, rear);
    }

    Assignment[] dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty!!");
            return null;
        }
        if (approvedCount >= max_approved){
            System.out.println("Cannot process KRS more than 30 students!!");
            return null;
        }

        int processCount = Math.min(2, size);
        processCount = Math.min(processCount, max_approved - approvedCount);
            
        Assignment[] processed = new Assignment[processCount];        
            
        for(int i = 0; i< processCount; i++){
            Assignment dt = data[front];
            System.out.print("Processing KRS: ");
            dt.print();
            processed[i] = dt;
            front = (front + 1)% max;
            size--;
            approvedCount++;
        }
        return processed;
        // if (isEmpty()){
        //     System.out.println("Queue is empty!!");
        //     return null;
        // }
        // Assignment dt = data[front];
        // front = (front + 1) % max;
        // size--;
        // return dt;
    }

    void peek2(){
        if(!isEmpty()){
            if(size == 1){
                System.out.println("Front data: ");
                data[front].print();
            } else {
                int temp = front;
                System.out.println("Front data: ");
                data[temp].print();

                temp = (temp+1) %max;
                System.out.println("Front data2: ");
                data[temp].print();
            }
        } else {
            System.out.println("Queue is empty!!!");
        }
    }

    void displayRear(){
        if (!isEmpty()){
            System.out.println("Rear data: ");
            data[rear].print();
        } else {
            System.out.println("Queue is empty!!!");
        }
    }

    void print(){
        if(isEmpty()){
            System.out.println("Queue is empty!!");
            return;
        }
        int i = front;
        while(i != rear){
            data[i].print();
            i = (i+1) % max;
        }
        data[i].print();
        System.out.println("Number of element: "+size); 
    }

}