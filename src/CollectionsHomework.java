import java.util.*;

/**
 * Created by serhiiprokopchuk on 2/6/17.
 */
public class CollectionsHomework {
    public void tryArrayList() {
        // Try COLLECTIONS
        String javascript = "JavaScript";
        List<String> strings = new ArrayList<>();
        List<String> strings2 = new ArrayList<>();
        strings2.add("PHP");
        strings.add("Java");
        strings.add(javascript);
        System.out.println("Should be Java: " + strings.get(0));
        System.out.println("Should transformed to [Java, JavaScript]: " + strings.toString());
        System.out.println("Should be true: " + strings.contains(javascript));

        strings.addAll(strings2);
        System.out.println("Should be PHP: " + strings.get(2));
    }

}
