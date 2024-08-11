package util;

import model.Employee;

public class AddAndDisplayEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee();
        //employee.email = "abc@gamil.com"; //java: email has private access in model.Employee
        employee.setEmpid(101);
        employee.setName("Soundarya");
        employee.setEmail("soundarya123@gmail.com");
        employee.setMobile("9876567892");
        employee.setDesignation("Senior developer");

        System.out.println("Employee details are : "+employee);

        System.out.println("Employee name is : "+employee.getName());
        System.out.println("Employee email is : "+employee.getEmail());
    }
}
