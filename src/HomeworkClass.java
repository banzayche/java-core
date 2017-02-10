import java.util.*;

public class HomeworkClass {

    public static void main(String args[])
    {

//        System.out.println("\n Try Collections:");
//        CollectionsHomework test = new CollectionsHomework();
//        test.tryArrayList();
//
//        System.out.println("\n Creating of an Employee:");
//        while (true)
//        {
//            homework();
//            System.out.println("The End:");
//            Scanner in = new Scanner(System.in);
//            String ans = in.nextLine();
//            if (ans.equals("y")) { break; }
//        }

        System.out.println("\n Try Random:");
        int itemsCount = 1;
        List<Integer> randomIntegers = new ArrayList<>();
        while (itemsCount < 21)
        {
            randomIntegers.add(randomWithRange(1, 10));
            itemsCount++;
        }
        System.out.println("Random images list = " + randomIntegers.toString());
        System.out.println("Count >5 = " + getCount(">5", randomIntegers));
        System.out.println("Count unique = " + getCount("unique", randomIntegers));

        System.out.println("\n Get indexes of ununique integers:");
        Map<Integer, List> noneUnique = getIndexesNoneUniqueInt(randomIntegers, getUnique(randomIntegers));
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

    public static List getUnique(List<Integer> listIntegers)
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

    public static Map getIndexesNoneUniqueInt(List<Integer> initialList, List<Integer> uniqueList) {
        System.out.println("unique = " + uniqueList);
        System.out.println("randomIntegers = " + initialList);
//        for (int i = 0; i < 20; i++)
//        {
//            int item = randomIntegers.get(i);
////            System.out.println("uniqueSet = "+uniqueList);
////            System.out.println("randomIntegers = "+randomIntegers);
////            System.out.println("item = "+item);
////            System.out.println("!uniqueSet.contains(item) = "+!uniqueList.contains(item));
//            if (!uniqueList.contains(item))
//            {
//                randomIntegers.indexOf(item);
//                System.out.println("Hey"+randomIntegers.indexOf(item));
////                notUniqueIntegers.put(item, )
//            }
//        }
        Map<Integer, List> notUniqueIntegers = new HashMap<>();
        return notUniqueIntegers;
    }

    public static int randomWithRange(int min, int max)
    {
        Random random = new Random();

        int result = random.nextInt(max) + min;
        return result;
    }

    public static Employee homework()
    {
            Scanner in = new Scanner(System.in);

            System.out.println("Name:");
            String name = in.nextLine();
            System.out.println("Age:");
            String age = in.nextLine();
            System.out.println("Designation:");
            String designation = in.nextLine();
            System.out.println("Salary:");
            String salary = in.nextLine();

            /* Create object using constructor */
            Employee empOne = new Employee(name);

            // Invoking methods for each object created
            if (isNumeric(age))
            {
                empOne.empAge(Integer.valueOf(age));
            }

            empOne.empDesignation(designation);

            if (isNumeric(salary))
            {
                empOne.empSalary(Integer.valueOf(salary));
            }

            empOne.printEmployee();

            return empOne;
    }

    public static boolean isNumeric(String str)
    {
        try
        {
//            Integer.parseInt(str);
            Double.parseDouble(str);
        }
        catch(NumberFormatException nfe)
        {
            System.out.println("It seems that you try to put not numeric value at numeric value place: " + nfe.getMessage());
            return false;
        }
        return true;
    }
}