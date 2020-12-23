package bg.softuni.fundamentals;

public class ObjectsAndClassesUdemy {
    static class Employee{
        int employeeNumber;
        String employeeName;
        float employeeSalary;

        void displayProperties(){
            System.out.println(employeeNumber + "|" + employeeName + "|" + employeeSalary);
        }
        void setProperties(){
            employeeName = "Naveen";
            employeeSalary = 5000;
        }
    }

    public static void main(String[] args) {

        Employee emp = new Employee();
        System.out.println(emp.employeeNumber + "|" + emp.employeeName + "|" + emp.employeeSalary);

        // 1. Changing the state of an object using reference
        emp.employeeNumber = 101;
        emp.employeeName = "Sunil";
        emp.employeeSalary = 2500.5f;
       // System.out.println(emp.employeeNumber + "|" + emp.employeeName + "|" + emp.employeeSalary);
        emp.displayProperties();

        //2. Changing the state of an object using a method
        emp.setProperties();
        emp.displayProperties();

    }
}
