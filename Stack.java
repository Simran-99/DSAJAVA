public class Stack {
    int top;
    int ptr[];
    Stack(int size){
        ptr=new int[size];
        top=-1;
    }
    public void push(int data){
        
        top=top+1;
        if((top<=ptr.length-1) && (top>=0) ){
            System.out.println("Pushing element: "+data);
            ptr[top]=data;
        }
        else{
            top=top-1;
            System.out.println("Operation not possible");
        }
    }
    public int peek(){
        return ptr[top];
    }
    public void pop(){
        System.out.println("Popping element: "+ptr[top]);
        
        top=top-1; 
        if((top>ptr.length-1) && (top<0) ){
            top=top+1;
            System.out.println("Operation not possible");
            
        }
        
        
    }
    public boolean overflow(){
        if(top>ptr.length-1){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean underflow(){
        if(top<0){
            return true;
            
        }
        else{
            return false;
        }
    }
    public void print(){
        System.out.println("Printing the elements");
        for(int i=0;i<=top;i++){
            
            System.out.println(ptr[i]);
        }
    }
    




    public static void main(String args[]) {
        Stack s=new Stack(5);
        s.push(1);
        s.push(2);
        s.print();
        s.pop();
        s.print();
        int p=s.peek();
        System.out.println("Peek is "+p);
        
        
    }
}
