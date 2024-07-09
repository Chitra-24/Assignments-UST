import java.lang.String;
import java.io.*;
class Member{
	String name;
    int age;
	String phoneNumber;
	String address;
	float salary;
	
	public void printSalary() {
		System.out.println("The salary is "+ salary);
	}
}
class Employee extends Member{
	String specialization;
	public void empDetails() {
		System.out.printf("name: %S \n age: %d\n"
				+ "phone: %s\n address: %S\n salary: %f\n specialization: %s\n", name,age,phoneNumber,address,salary,specialization);
	}
}
class Manager extends Member{
	String department;
	public void MgDetails() {
		System.out.printf("name: %S \n age: %d\n"
				+ "phone: %s\n address: %S\n salary: %f\n department: %s\n",name,age,phoneNumber,address,salary,department);
}
}
public class inheritanceExample {

	public static void main(String[] args) {
		Employee e=new Employee();
		Manager m=new Manager();
		System.out.println("-----calling employee-----");
		e.name="Rohan";
		e.age=25;
		e.phoneNumber="9900887766";
		e.address="Bangalore";
		e.salary=20000f;
		e.specialization="Developer";
		e.empDetails();
		System.out.println("-----calling manager-----");
		m.name="Roshan";
		m.age=30;
		m.phoneNumber="9856743218";
		m.address="Delhi";
		m.salary=30000f;
		m.department="Software Dept";
		m.MgDetails();
	}
}

