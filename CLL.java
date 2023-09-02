public class CLL {
    Node last;
    public class Node{
        int item;
        Node next;
        public int getitem(){
        return item;
    }
    public Node getnext(){
        return next;
        
    }
    public void setitem(int data){
        item=data;
    }
    public void setNode(Node n){
        next=n;
    }
    }
    public void checkempty(){
        if(last==null){
            System.out.println("The list is empty");
        }
        else{
            System.out.println("The list is not empty");
        }
    }
    //Inserting an element at the beginning of the list
    public void insertelebeginning(int data){
        Node n=new Node();
        n.item=data;
        if(last==null){
            last=n;
            
        }else{
        
        n.next=last;
        last.next=n;
        }
    }
    //Inserting elements at the end
    public void insertend(int data){
        Node n=new Node();
        n.item=data;
        if(last==null){
            last=n;
        }
        else{
            n.next=last.next;
            last.next=n;
            last=n;
        }
        
    }
    //Searching the element
    // can use do while with while(temp!=last.next)
    public void searchele(int data){
        Node temp=last.next;
        int flag=0;
        if(last.item==data){
            flag=1;
        }
        else{
        while(temp!=last){
            if(temp.item==data){
                flag=1;
            }
            else{
                flag=0;
        }
        temp=temp.next;
        }
    }
    if(flag==1){
        System.out.println("Element exists in the list");
    }
    else{
        System.out.println("Element does not exist in the list");
    }
    }
    //Inserting element in between
    public void inserthelebetween(int data,int new_data){
        Node n=new Node();
        n.item=new_data;
        Node temp=last.next;
        int flag=0;
        if(last.item==data){
            flag=1;
        }
        else{
        while(temp!=last){
            if(temp.item==data){
                flag=1;
                break;
            }
            else{
                flag=0;
        }
        temp=temp.next;
        }
    }
    if(flag==1){
        n.next=temp.next;
        temp.next=n;
    }
    else{
        System.out.println("element cannot be input at desired place");
    }
    }
    //Delete element beginning
    public void deleteb(){
        if(last==null){
            System.out.println("No element to delete");
            
        }
        else if(last.next==null){
            last=null;
        }
        else{
            last.next=last.next.next;
        }
    }
    //Deleting element from the end
    public void deletened(){
        if(last==null){
            System.out.println("No element to delete");
            
        }
        else if(last.next==null){
            last=null;
        }
        else{
            Node temp=last.next;
            while(temp.next!=last){
                temp=temp.next;
            }
            last=temp;
            last.next=last.next.next;
        }
        
    }
    public void deletebetween(int data){
        
        Node temp=last.next;
        int flag=0;
        if(last.item==data){
            
            while(temp.next!=last){
                temp=temp.next;
            }
            last=temp;
            last.next=last.next.next;
        }
        else{
        while(temp.next!=last){
            if(temp.next.item==data){
                flag=1;
                break;
            }
            else{
                flag=0;
        }
        temp=temp.next;
        }
    }
    if(flag==1){
        temp.next=temp.next.next;
    }
    else{
        System.out.println("element cannot be input at desired place");
    }
    }
    
    //Printing the elements
    public void printelements(){
        Node temp=last;
        while(temp.next!=last){
            System.out.println(temp.next.item);
            temp=temp.next;
        }
        System.out.println(temp.next.item);
        
    }
    
    public static void main(String args[]) {
      CLL c=new CLL();
      System.out.println("Checking if the list is empty");
      c.checkempty();
      System.out.println("-----*-----*-----*-----");
      System.out.println("Inserting elements in the beginning");
      c.insertelebeginning(1);
      c.insertelebeginning(2);
      System.out.println("-----*-----*-----*-----");
      System.out.println("Printing the elements");
      
      c.printelements();
      System.out.println("-----*-----*-----*-----");
      System.out.println("Inserting at the end");
      c.insertend(3);
      c.insertend(4);
      System.out.println("-----*-----*-----*-----");
      System.out.println("Printing the elements");
      c.printelements();
      System.out.println("-----*-----*-----*-----");
      System.out.println("Seaching element");
      c.searchele(3);
      System.out.println("-----*-----*-----*-----");
      System.out.println("Putting element in between");
      c.inserthelebetween(1,5);
      System.out.println("-----*-----*-----*-----");
      System.out.println("Printing the elements");
      c.printelements();
      System.out.println("-----*-----*-----*-----");
      System.out.println("Deleting element from beginning");
      c.deleteb();
      System.out.println("Printing the elements");
      c.printelements();
      System.out.println("-----*-----*-----*-----");
      System.out.println("Deleting element from end");
      c.deletened();
      System.out.println("Printing the elements");
      c.printelements();
      System.out.println("-----*-----*-----*-----");
      System.out.println("Deleting element from between");
      c.deletebetween(5);
      System.out.println("Printing the elements");
      c.printelements();
      System.out.println("-----*-----*-----*-----");
      
      
      
      
    }
}
