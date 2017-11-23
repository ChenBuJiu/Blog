  
  
import java.util.ArrayList;  
import java.util.List;  
  
public class MemoryLeakDemo {  
  
    public static void main(String[] args) {  
  
        List<String> list = new ArrayList<String>();  
        while (true) {  
            list.add("OutOfMemoryError soon");  
        }  
    }  
  
}  