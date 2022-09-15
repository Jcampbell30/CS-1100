
/**
 * Jared Campbell
 * Rjn259
 * Final Exam Question 2
 * Changing for into while loop
 */
public class for_While
{
    public static void main(String[] args)
    {
        int j = 24;
        int i = 2;
        int sum = 0;
        int count = 0;
        boolean valid = true;
            while(i < j|| valid)
            {
          i = i+3;
          if(i%2 != 0) 
                {
    	    sum = sum + i;
    	    count++;
    	    }
        	if(i > j) 
        	{
                valid = false;
          }  
        }
        System.out.println(sum/count);
    }
        }
