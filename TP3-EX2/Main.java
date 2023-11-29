import java.util.*;

public class Main {

  public static void main(String args[]) {
    ArrayList<Employees> Emps = new ArrayList<>();

    Employees efw1 = new PayFixWeek("efw1", "rachid", "rue 122", 1200);
    Employees efw2 = new PayFixWeek("efw2", "ahmed", "rue 16", 1000);
    Employees efw3 = new PayFixWeek("efw3", "hassan", "rue 76", 900);

    Emps.add(efw1);
    Emps.add(efw1);
    Emps.add(efw2);

    System.out.println(" salary of emp1 : " + Emps.get(0).getSalary() + " per week .");
  }
}
