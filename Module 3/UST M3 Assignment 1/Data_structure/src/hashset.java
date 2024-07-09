import java.util.HashSet;
import java.util.Iterator;
public class hashset {

	public static void main(String[] args) {

		    HashSet<String> languages = new HashSet();

		    languages.add("Java");
		    languages.add("Python");
		    languages.add("JavaScript");
		    languages.add("Java");

		    System.out.println("Size of the hash set: " + languages.size());

		    System.out.println("Does the hash set contain Java: " + languages.contains("Java"));

		    languages.remove("Python");
		    System.out.println("Does the hash set contain Python: " + languages.contains("Python"));

		    Iterator<String> iterator = languages.iterator();
		    while (iterator.hasNext()) {
		      String language = iterator.next();
		      System.out.println(language);
		    }

	}

}
