
/**
 *Jared Campbell
 *Rjn259
 */
public class ValueAnalyzer
{
    int x;
    public ValueAnalyzer(int x){
        this.x = x;        
    }
    public void setValue(int x){
        this.x = x;
    }
    public int getValue(){
        return this.x; 
    }
    public int valueAnalyzer(){
        
        if (this.x > 0){ 
            return 1;
        }else if (this.x<0){ 
            return -1;
        }else{
            return 0;
        }
        
    }
    }
