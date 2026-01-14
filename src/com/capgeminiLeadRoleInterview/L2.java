package com.capgeminiLeadRoleInterview;

public class L2 {
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


	List<Employee> list = Arrays.asList(
			new Employee("Emp1", 25, 15000, "B"),
			new Employee("Emp2", 35, 35000, "A"),
			new Employee("Emp3", 20, 12000, "C"),
			new Employee("Emp4", 40, 45000, "A")
	);

	list.stream()
		.collect(Collectors.groupingBy())


    * */


    /*
    * /*

List<Employee> employees = List.of(
    new Employee("Alice", "IT", 70000, 32),
    new Employee("Bob", "Finance", 85000, 45),
    new Employee("Charlie", "IT", 60000, 25),
    new Employee("David", "HR", 90000, 39),
    new Employee("Eve", "IT", 70000, 41),
    new Employee("Frank", "Finance", 95000, 52)
);
a. Find the highest-paid employee in each department, and
b. Sort the departments by that highest salary (descending)
*/

/*

1)Find the highest-paid employee in each department, and

    Map<String, Employee> highestPaidbyDept = employees.stream()
            .collect(Collectors.groupingBy(
                    Employee::getDepartment,
                    Collectors.collectingAnThen(Collectors.maxBy(
                                    Comparator.comparingInt(Employee::getSalary)
                            ),
                            Optional::get
                    )
            ));


2) b. Sort the departments by that highest salary (descending)


highestPaidbyDept.entrySet().stream()
		.sorted(Map.Entry<String, Employee> comparingByValue(
            Comparator.comparingInt(Employee::getSalary).reverserd())
            .forEach(entry -> System.out.println(entry.getKey()+"======"+entry.getValue)));
    *
    * */
}
