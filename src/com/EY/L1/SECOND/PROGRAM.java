package com.EY.L1.SECOND;

public class PROGRAM {

    public static void main(String[] args) {
        /*
        //Entity

@Entity
@Table(name="employees")
public class Employee(
){}
	@Id
	@GeneratedValue(strategy=GenerationType.Identity)
	private Long id;

	private String name;

	// getters and setters
}

//repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
}


//service
public interface EmployeeService{

		getEmployeeById(Long id);
		createEmployee(Employee employee);
}
//Controller

@RestController
@RequestMapping("api/employee")
public class EmployeeController{

	//get employee by id

	@GetMapping("{id}")
	public ResponseEntity<Employee> getEmployeeById(@PatHVariable Long id){
		Employee employee =employeeService.getEmployeeById(id);
		return ResponseEntity.ok(employee);
	}
}
         */
    }
}
