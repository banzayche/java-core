import java.util.*;

public class HomeworkClass {

    public static void main(String args[])
    {
        System.out.println("\n Try Collections:");
        CollectionsHomework test = new CollectionsHomework();
        test.tryArrayList();

        System.out.println("\n Creating of an Employee:");
        while (true)
        {
            homework();
            System.out.println("The End:");
            Scanner in = new Scanner(System.in);
            String ans = in.nextLine();
            if (ans.equals("y")) { break; }
        }
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