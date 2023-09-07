public class MyClass {
    //print n natural number using recusrion
    public static void print_natural(int n){
        if(n==0){
            return;
        }
        print_natural(n-1);
        System.out.println(n);
        
        
        
    }
    public static int sumn(int n){
        if(n==1){
            return 1;
        }
        int s=n+sumn(n-1);
        return s;
    }
    public static int sumneven(int n){
        if(n==2){
            return 2;
        }
       
        if(n%2!=0){
            return sumneven(n-1);
            
        }
        
        int s=n+sumneven(n-2);
        return s;
        
        
    }
    public static int sumnodd(int n){
        if(n==1){
            return 1;
        }
        if(n%2==0){
             return sumnodd(n-1);
        
        }
        
           
            int s=n+sumnodd(n-2);
            return s;
            
        
        
    }
    public static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        int f=n*fact(n-1);
        return f;
    }
    public static int sumdigit(int n){
        if(n<=0){
            return 0;
        }
        int s=(n%10)+sumdigit(n/10);
        return s;
    }
    public static void print_natural_reverse(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        print_natural_reverse(n-1);
    }
    
    public static void print_natural_even(int n){
        if (n<2){
            return;
        }
        if(n%2==0){
            print_natural_even(n-2);
            System.out.println(n);
            
        }
        else{
            print_natural_even(n-1);
            
        }
        
        
        
    }
    public static void print_natural_evenr(int n){
        if (n<2){
            return;
        }
        if(n%2==0){
            System.out.println(n);
            print_natural_evenr(n-2);
            
            
        }
        else{
            print_natural_even(n-1);
            
        }
        
        
        
    }
    public static void print_natural_odd(int n){
        if (n<1){
            return;
        }
        if(n%2==0){
            print_natural_odd(n-1);
            
            
        }
        else{
            
            print_natural_odd(n-2);
            System.out.println(n);
            
        }
        
        
        
    }
    public static void print_natural_oddr(int n){
        if (n<1){
            return;
        }
        if(n%2==0){
            print_natural_oddr(n-1);
            
            
        }
        else{
            System.out.println(n);
            
            print_natural_oddr(n-2);
            
            
        }
        
        
        
    }
    public static int fibonacci(int n){
        
        if(n==0 || n==1){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
        
        
    }
    public static void printDtoB(int n){
        if(n>0){
        printDtoB((n/2));
        System.out.println(n%2);
        }
    }
    public static void printDtoO(int n){
        if(n>0){
        printDtoO((n/8));
        System.out.println(n%8);
        }
    }
    public static void reverse(int n){
        if(n==0){
            return;
        }
        System.out.print(n%10);
        reverse(n/10);
    }
    public static int sumsquare(int n){
        if(n==1){
            return 1;
        }
        return n*n+sumsquare(n-1);
    }
  
    
    public static void main(String args[]) {
      System.out.println("********** Print Natural Number **********");
      print_natural(10);
      System.out.println("********** Print Natural Number(Reverse Order) **********");
      print_natural_reverse(10);
      System.out.println("********** Print Even Natural Number **********");
      print_natural_even(10);
      System.out.println("********** Print Even Natural Number(Revrse order) **********");
      print_natural_evenr(10);
      System.out.println("********** Print Odd Natural Number **********");
      print_natural_odd(10);
      System.out.println("********** Print Odd Natural Number(Revrse order) **********");
      print_natural_oddr(10);
      System.out.println("********** Print Sum Natural Number **********");
      int x=sumn(10);
      System.out.println(x);
      System.out.println("**********Even Sum of Natural number **********");
      int y=sumneven(10);
      System.out.println(y);
      System.out.println("**********Odd Sum of Natural number **********");
      int z=sumnodd(10);
      System.out.println(z);
      System.out.println("**********Print Factorial **********");
      int f=fact(5);
      System.out.println(f);
       System.out.println("**********Digit Sum**********");
      int s=sumdigit(123);
      System.out.println(s);
      System.out.println("**********Fibonnaci**********");
      int fib=fibonacci(10);
      System.out.println(fib);
      System.out.println("**********Decimal to Binary**********");
      printDtoB(10);
      
      System.out.println("**********Decimal to Octal**********");
      printDtoO(25);
      System.out.println("**********Reversing number**********");
      reverse(123);
      System.out.println("**********SumSquare**********");
      System.out.println(sumsquare(5));
     
      
    }
    
    
}
