package com.pwc.L1;

public class PWCInterview {
    /*
    Class Employee {
    String Name;
    int age;
    long salary;
    String grade;
    }

    Sample Input:
    new Employee (Emp1, 25, 15000, "B")
    new Employee (Emp2, 35, 35000, "A")
    new Employee (Emp3, 20, 12000, "C")
    new Employee (Emp4, 40, 45000, "A")

    Question 1:
    Calculate the average salary for each grade of employees
    Output :
    A -> 40,000
    B -> 15,000,
    C -> 12,000

    List<Employee> list = Arrays.asList(
	    new Employee("Emp1", 25, 15000, "B"),
	    new Employee("Emp2", 35, 35000, "A")
	    new Employee("Emp3", 20, 12000, "C")
	    new Employee("Emp4", 40, 45000, "A")

    );

    HashMap<String, Long> total = new HashMap<>();

    HashMap<String, Integer> count = new HashMap<>();

    Map<String, Double> avgSalary = list.stream()
			.collect(Collectors.groupingBy(Employee::getGrade,
				Collectors.averagingLong(Employee::getSalary)));


    avgSalary.forEach((grade,avg) -> System.out.println(grade+"---------"+Math.round(avg)) );

    // create abstract factory design pattern uml diagram

     */
}
