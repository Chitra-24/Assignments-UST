import java.util.HashMap;
import java.util.Map;
public class mapExample {

	public static void main(String[] args) {

        Map<String, Integer> myHashMap = new HashMap<String, Integer>();
        myHashMap.put("apple", 10);
        myHashMap.put("banana", 20);
        myHashMap.put("orange", 30);
        myHashMap.put("pear", 40);

        System.out.println("Size of myHashMap: " + myHashMap.size());

	}

}
