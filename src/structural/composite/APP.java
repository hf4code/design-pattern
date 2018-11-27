package structural.composite;

public class APP {
    public static void main(String[] args) {

        Employee CEO = new Employee("John", "CEO", 30000);

        Employee headMarketing = new Employee("Robert", "Head Marketing", 20000);
        Employee headSales = new Employee("Anna", "Head Sales", 20000);

        Employee clerk1 = new Employee("Laura", "Marketing", 10000);
        Employee clerk2 = new Employee("Tom", "Marketing", 10000);

        Employee salesExecutive1 = new Employee("Bob", "Sales", 10000);
        Employee salesExecutive2 = new Employee("Lucy", "Sales", 10000);

        CEO.add(headMarketing);
        CEO.add(headSales);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);

        //print all employees of the organization
        System.out.println(CEO);

        for (Employee headEmployee : CEO.getSubordinates()) {
            System.out.println(headEmployee);

            for (Employee employee : headEmployee.getSubordinates()) {
                System.out.println(employee);
            }
        }
    }
}
