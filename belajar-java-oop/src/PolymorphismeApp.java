public class PolymorphismeApp {
    public static void main(String[] args) {
        Employee employee = new Employee("Nursalim");
        employee.sayHello("Budi");

        employee = new Manager("Naura Krasiva");
        employee.sayHello("Budi");

        employee = new VicePresident("Joni");
        employee.sayHello("Budi");

        sayHello(new Employee("Nursalim"));
        sayHello(new Manager("Doni"));
        sayHello(new VicePresident("Udin"));
    }

    static void sayHello(Employee employee) {
        if(employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Helo Manager " + manager.name);
        }else if(employee instanceof VicePresident) {
            VicePresident vp = (VicePresident) employee;
            System.out.println("Helo VP " + vp.name);
        }else {
            System.out.println("Hello Employee " + employee.name);
        }

    }
}
