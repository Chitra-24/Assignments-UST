import java.util.TreeSet;

public class setExample {

	public static void main(String[] args) {
        TreeSet<String> tSet = new TreeSet<String>();
        tSet.add("Red");
        tSet.add("Green");
        tSet.add("Black");
        tSet.add("Pink");
        tSet.add("Orange");

        System.out.println("Original TreeSet: " + tSet);
        TreeSet<String> newTSet = (TreeSet<String>) tSet.clone();

        System.out.println("Cloned TreeSet: " + newTSet);

	}

}
