import java.io.*;
 
class GFG {
 

static int numberOfDivisors(int num)
{
    int c = 0;
 
    
    for (int i = 1; i <= num; i++) {
        if (num % i == 0) {
            c += 1;
        }
    }
    return c;
}
 

static int countNumbers(int n)
{
    int c = 0;
 
    
    for (int i = 1; i <= n; i++) {
        
        if (numberOfDivisors(i) == 9)
            c += 1;
    }
    return c;
}
 
       // Driver Code
    public static void main (String[] args) {
    int n = 1000;
 
    System.out.print(countNumbers(n));
    }
}