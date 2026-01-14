package com.EY.someOtherInterview;

public class Questions {
    /*
        Select e1.*
from Employee1 e1
left join Employee2 e2
on e1.Emp_id == e2.emp_id
where e2.emp_id is null;

    public class Employee{

	private final int id;
	private final String name;

	public Employee(int id, String name){
		this.id = id;
		this.name = name;
	}

	private int getId(){
	}

	private String getName(){
	}

    }



public record Employee(int id, String name){}


main(){


		String input = "I love java programming";

		List<Characters> repeated =	input.chars()
				.mapToObj(c->(char)c)
				.filter(c->c!=' ')
				.collect(Collectors.groupingBy(
				Function.identity(),
				Collectors.counting()))
				.entrySet().stream()
				.filter(e->e.getValue()>1)
				.map(Map.Entry::getKey)
				.collect(Collectors.toList());

		System.out.println(repeated);
		}


		s = "()" → true
s = "()[]{}" → true
s = "(]" → false
s = "([)]" → false
s = "{[()]}" → true
s = "" → true (empty string is valid)



main(){

	public static Boolean isValid()
	Map<Character, Character> map = Map.of(
			')','(',
			'}', '{',
			'[', ']'
	);

	Deque<Character> stack = new ArrayDeque<>();
	"(]" ----> Ascii{114, 115} ---- ['(' , ']']
	s
	.chars()
	.mapToObj(c->(char)c)
	.filter(c->map.containsKey(c) || map.containsValue(c))
	.forEach(c->{
		if(map.containsValue(c)){
			stack.push(c);
		}else{
			if(stack.isEmpty() || stack.pop() != map.get(c)){
				stack.push('#');
			}
		}
	});

	return stack.isEmpty()
}
     */
}
