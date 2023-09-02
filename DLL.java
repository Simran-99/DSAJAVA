public class DLL {
    Node ptr;
    class Node{
        int item;
        Node next;
        Node prev;
        public int getitem(){
            return item;
        }
        public void setitem(int item){
            this.item=item;
            
        }
        public Node getnext(){
            return next;
        }
        public void setnext(Node next){
            this.next=next;
            
        }
        public Node getprev(){
            return prev;
            
        }
        public void sexprev(){
            this.prev=prev;
        }
    }
    public void isEmpty(){
        if(ptr==null){
            System.out.println("The list is Empty");
            
        }
        else{
            System.out.println("The list is not Empty");
            
        }
        
    }
    public void insert_beginning(int data){
        Node n=new Node();
        n.item=data;
        if(ptr==null){
            ptr=n;
        }
        else{
            n.next=ptr;
            ptr.prev=n;
            ptr=n;
        }
        
    }
    public void insert_end(int data){
        Node n=new Node();
        n.item=data;
        
        Node temp=ptr;
        while(temp.next!=null){
            temp=temp.next;
            
        }
        temp.next=n;
        n.prev=temp;
        n.next=null;
        
    }
    public void search(int data){
        Node temp=ptr;
        int flag=0;
        while(temp!=null){
            if(temp.item==data){
                flag=1;
                break;
                
            }
            else{
                flag=0;
            }
            temp=temp.next;
        }
        if(flag==1){
            System.out.println("The data has been found: "+temp.item);
        }
        else{
            System.out.println("The data has not been found");
        }
    }
    public void insert_after_node(int searchele,int data){
        Node n=new Node();
        n.item=data;
    
        Node temp=ptr;
        int flag=0;
        while(temp!=null){
            if(temp.item==searchele){
                flag=1;
                break;
                
            }
            else{
                flag=0;
            }
            temp=temp.next;
        }
        if(flag==1){
            temp.next.prev=n;
            n.next=temp.next;
            n.prev=temp;
            
            temp.next=n;
        }
        else{
            System.out.println("The data has not been found");
        }
        
    }
    public void deletefirst(){
        if(ptr==null){
            System.out.println("The list is empty");
        }
        else if(ptr.next==null){
            ptr=null;
        }
        else{
        
        ptr=ptr.next;
        ptr.prev=null;
        }
        
    }
    public void deletingend(){
        if(ptr==null){
            System.out.println("The list is empty");
        }
        else if(ptr.next==null){
            ptr=null;
        }
        else{
        Node temp=ptr;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }
    }
    public void delete_given(int data){
        if(ptr==null){
            System.out.println("The list is empty");
        }
        else if(ptr.next==null){
            ptr=null;
        }
        else{
        int flag=0;
        Node temp=ptr;
        while(temp.next!=null){
            if(temp.next.item==data){
                flag=1;
                break;
                
            }
            temp=temp.next;
        }
        if (flag==1){
        temp.next.next.prev=temp;
        temp.next=temp.next.next;
        }
    }
    }
    public void print_list(){
        Node temp=ptr;
        while(temp!=null){
            System.out.println(temp.item);
            temp=temp.next;
        }
    }
    public static void main(String args[]) {
        DLL Double_list=new DLL();
        Double_list.isEmpty();
        System.out.println("Peration:Insering elements in List at Beginning");
        System.out.println("-----------*-----------*-----------*-----------");
        Double_list.insert_beginning(2);
        Double_list.insert_beginning(1);
        
        System.out.println("Operation: Printing Elements from the list");
        
        Double_list.print_list();
        System.out.println("-----------*-----------*-----------*-----------");
        System.out.println("Operation: Inserting elements in List at End");
        System.out.println("-----------*-----------*-----------*-----------");
        Double_list.insert_end(3);
        Double_list.insert_end(4);
        System.out.println("Operation: Printing Elements from the list");
        Double_list.print_list();
        System.out.println("-----------*-----------*-----------*-----------");
        System.out.println("Searching an item");
        
        Double_list.search(3);
        Double_list.search(10);
        System.out.println("-----------*-----------*-----------*-----------");
        System.out.println("Operation: insert element in beginning");
        System.out.println("-----------*-----------*-----------*-----------");
        Double_list.insert_after_node(3,8);
        System.out.println("Operation: Printing Elements from the list");
        Double_list.print_list();
        
        System.out.println("-----------*-----------*-----------*-----------");
        System.out.println("Deleting firt element");
        System.out.println("-----------*-----------*-----------*-----------");
        Double_list.deletefirst();
        System.out.println("Operation: Printing Elements from the list");
        Double_list.print_list();
        
        System.out.println("-----------*-----------*-----------*-----------");
        System.out.println("Deleting end element");
        System.out.println("-----------*-----------*-----------*-----------");
      Double_list.deletingend();
        System.out.println("Operation: Printing Elements from the list");
        Double_list.print_list();
        
        System.out.println("-----------*-----------*-----------*-----------");
        System.out.println("Deleting middle element");
        System.out.println("-----------*-----------*-----------*-----------");
       Double_list.delete_given(3);
        System.out.println("Operation: Printing Elements from the list");
        Double_list.print_list();
        
        System.out.println("-----------*-----------*-----------*-----------");
        
        
        
        
        
        
        
        
        
        
        
        
      
    }
}
