import java.util.*;

/**
 * Created by serhiiprokopchuk on 2/6/17.
 */
public class CollectionsHomework {
    public void playWithRandom() {
        System.out.println("\n Try Random:");
        int itemsCount = 1;
        List<Integer> randomIntegers = new ArrayList<>();
        while (itemsCount < 21)
        {
            randomIntegers.add(randomWithRange(1, 10));
            itemsCount++;
        }
        System.out.println("Random int list = " + randomIntegers.toString());
        System.out.println("Unique int list = " + getUnique(randomIntegers));
        System.out.println("Count >5 = " + getCount(">5", randomIntegers));
        System.out.println("Count unique = " + getCount("unique", randomIntegers));

        System.out.println("\n Get indexes of not unique integers:");
        Map<Integer, List> noneUnique = getIndexesNoneUniqueInt(randomIntegers, getUnique(randomIntegers));
        System.out.println("Not unique int Map = " + noneUnique.toString());
    }

    public static int getCount(String condition, List<Integer> randomIntegers)
    {
        int answer = 0;
        if(condition.equals(">5")) {
            for (int item : randomIntegers) {
                if(item > 5) {
                    answer++;
                }
            }

        }
        else if(condition.equals("unique")) {
            answer = getUnique(randomIntegers).size();
        }
        return answer;
    }

    public static List<Integer> getUnique(List<Integer> listIntegers)
    {
        int index = 0;
        List<Integer> uniqueList = new ArrayList<>();
        List<Integer> dirtyList = new ArrayList<>();
        for (int item : listIntegers) {
            boolean condition = (listIntegers.lastIndexOf(item) == index) && !dirtyList.contains(item);
            if(condition) {
                uniqueList.add(item);
            }
            else {
                dirtyList.add(item);
            }
            index++;
        }
        return uniqueList;
    }

    public static Map<Integer, List> getIndexesNoneUniqueInt(List<Integer> initialList, List<Integer> uniqueList) {
        Map<Integer, List> notUniqueIntegers = new HashMap<>();
        for (int i = 0; i < initialList.size(); i++) {
            int item = initialList.get(i);
            if (!uniqueList.contains(item)) {

                if (notUniqueIntegers.keySet().contains(item)) {
                    List newList = notUniqueIntegers.get(item);
                    newList.add(i);
                }
                else {
                    List<Integer> indexesList = new ArrayList<>();
                    indexesList.add(i);
                    notUniqueIntegers.put(item, indexesList);
                }
            }
        }

        return notUniqueIntegers;
    }

    public static int randomWithRange(int min, int max)
    {
        Random random = new Random();

        int result = random.nextInt(max) + min;
        return result;
    }

}
