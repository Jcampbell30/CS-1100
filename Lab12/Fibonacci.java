
/**
 * Jared Campbell
 * RJN259
 * 
 */
public class Fibonacci
{
int position = 0;
public Fibonacci(int value)
{
    position = value;
}

    public long getFiboNumber()
    {
        
        long fold1 = 1;
        long fold2 = 1;
        long fnew = 0;
        for (long i = 3; i <= position; i++) 
        {  
            fnew = fold1 + fold2;
            fold1 = fold2;
            fold2 = fnew;
            
        
  
     
    }

    return fnew;
    
}
}