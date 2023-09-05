public class Queues {
    int rear;
    int front;
    int ptr[];
    Queues(int size){
        rear=-1;
        front=-1;
        ptr=new int[size];
    }
    //We cannot insert element when the queue is full
    public void insertele(int data){
        if (isFull()){
            System.out.println("Cannot insert the element");

            
        }
        else{
            if(isEmpty()){
            front=0;
            rear=0;
            ptr[rear]=data;
                
            }
            else if(rear==ptr.length-1){
                rear=0;
                ptr[rear]=data;
            }
            else {
            rear=rear+1;
            ptr[rear]=data;
            }
        }
    }
    public int frontele(){
        return ptr[front];
    }
    public int rearele(){
        return ptr[rear];
    }
    public void deleteele(){
        if(isEmpty()){
            System.out.println("No elements to delete");
            
        }
        //When front and rear are equal that means there is just one element.
        else if(front == rear){
            front=-1;
            rear=-1;
        }
        else if((front==ptr.length-1) && (rear<front) ){
            front=0;
            
        }
        else{
            front=front+1;
        }
    }
    public void print(){
        System.out.println("The queue is");
        for(int i=front;i<=rear;i++){
            System.out.println(ptr[i]);
        }
        System.out.println("-----*-----*-----*-----*-----");
    }
    public void countele(){
        if (front==-1 && rear==-1){
            System.out.println("No element");
        }
        else if(front==rear){
            System.out.println("1 element");
        }
        else if(front<=rear){
            System.out.println("Number of elements is:"+((rear-front)+1));
            
        }
        else if(rear<front){
            System.out.println("Number of elements is:"+(ptr.length-(front-rear)+1));
        }
    }
    public boolean isEmpty(){
        if(front==-1){
            return true;
        }
        return false;
    }
    public boolean isFull(){
        if(((rear==ptr.length-1) && (front==0)) ||(rear+1==front) ){
            return true;
        }
        return false;
    }
    public static void main(String args[]) {
        Queues q=new Queues(5);
        q.insertele(1);
        q.insertele(2);
        System.out.println("Front is :"+q.frontele());
        System.out.println("Rear is :"+q.rearele());
        q.print();
        q.insertele(3);
        System.out.println("Front is :"+q.frontele());
        System.out.println("Rear is :"+q.rearele());
        q.print();
        q.insertele(4);
        q.deleteele();
        q.deleteele();
        System.out.println("Front is :"+q.frontele());
        System.out.println("Rear is :"+q.rearele());
        q.print();
        q.insertele(5);
        System.out.println("Front is :"+q.frontele());
        System.out.println("Rear is :"+q.rearele());
        q.print();
        q.insertele(6);
        q.insertele(7);
        System.out.println("Front is :"+q.frontele());
        System.out.println("Rear is :"+q.rearele());
        q.print();
        q.countele();
        
        
        
      
    }
}
