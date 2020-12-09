package 객프실습15주;

import java.io.*;
import java.time.*;
import java.util.*;

public class TextFileTest {
	public static void main(String[] args) throws IOException {
		Employee[] staff = new Employee[3];
		staff[0] = new Employee("효택", 75000, 1987, 12, 15);
		staff[1] = new Employee("짱이", 50000, 1989, 10, 1);
		staff[2] = new Employee("토니", 40000, 1990, 3, 15);
//save all employee records to the file employee.dat
		try (PrintWriter out = new PrintWriter("employee.dat","UTF-8")) {
			writeData(staff, out);
		}
//retrieve all records into a new array
		try (Scanner in = new Scanner(new FileInputStream("employee.dat"))) {
			Employee[] newStaff = readData(in);
			for (Employee e : newStaff) // print the newly read employee records to the screen
				System.out.println(e);
		}
	} // end of main() method
//Writes all employees in an array to a print writer

	private static void writeData(Employee[] employees, PrintWriter out) throws IOException {
//write number of employees
		out.println(employees.length);
		for (Employee e : employees)
			writeEmployee(out, e);
	}

//Writes employee data to a print writer
	public static void writeEmployee(PrintWriter out, Employee e) {
		out.println(e.getName() + "|" + e.getSalary() + "|" + e.getHireDay());
	}

//Reads an array of employees from a scanner
	private static Employee[] readData(Scanner in) {
//retrieve the array size
		int n = in.nextInt();
		in.nextLine(); // consume newline
		Employee[] employees = new Employee[n];
		for (int i = 0; i < n; i++) {
			employees[i] = readEmployee(in);
		}
		return employees;
	}

	// Reads employee data from a buffered reader
	public static Employee readEmployee(Scanner in) {
	String line = in.nextLine();
	String[] tokens = line.split("\\|");
	String name = tokens[0];
	double salary = Double.parseDouble(tokens[1]);
	LocalDate hireDate = LocalDate.parse(tokens[2]);
	int year = hireDate.getYear();
	int month = hireDate.getMonthValue();
	int day = hireDate.getDayOfMonth();
	return new Employee(name, salary, year, month, day);
	}
} // end of TextFileTest
