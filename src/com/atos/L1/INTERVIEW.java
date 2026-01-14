package com.atos.L1;

public class INTERVIEW {
    /*
    *

//MODEL

public final record Employee(Long id, String name, int age, String email){}



//Controller

@RestController
@RequestMapping("/api/employee")
public class EmployeeController{

	@PostMapping
	public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee){

		return new ResponseEntity<>(employee, HttpStatus.CREATED);
	}
}




public interface EmployeeRepository extends JpaRepository<Employee, Long>{

	@Query(""Select e from employee e where e.name = "name" and e.email = "email")
	Optional<Employee> findByName(String name);


}
*
*
*
* //     List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

    //     List<Integer> result = numbers.stream()
    //         .filter(n->n%2==0)
    //         .map(n->n*n)
    //         .collect(Collectors.toList());

    // System.out.println(result);

    String input = "aabbccddeff";

    Character result = input.chars().mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(
                    Function.identity(), LinkedHashMap::new,
                    Collectors.counting()
                    ))
                    .entrySet()
                    .stream()
                    .filter(entry->entry.getValue()==1)
                    .map(Map.Entry::getKey)
                    .findFirst()
                    .orElse(null);

                    System.out.println(result);



    

    *
    *
    * */
}
