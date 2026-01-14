package com.streams;

public class Interview {
//
//    String s3= new String("hello");
//
//    class Client{
//
//        private int id;
//
//        public Client (int id){
//
//            this.id=id;
//
//        }
//
//        Client client1= new Client (25);
//
//        Client client2= new Client (25);
//
//System.out.print(client1 == client2);
//
//System.out.print(client1.equals(client2));
//
//
//    }
//
//    you are given a list of list of names.
//
//            List<List<String>> names= Arrays.asList(
//
//            Arrays.asList("John","Jane"),
//
//            Arrays.asList("Alex","Alice"),
//
//            Arrays.asLivvvvbtst("Bob","Bella"),
//
//            Arrays.asList("Alice","John")
//
//    );
//
//    find List<String> ,remove duplicate, sort them alphabetically
//
//    o/p-> [Alex,Alice,Bella,Bob,Jane,John]
//
//    String input= "abcdefghijklmno"
//
//    o/-> "abc def ghi jkl mno"
//
//// Online Java Compiler
//
//// Use this editor to write, compile and run your Java code online
//
///*
//
//you are given a list of list of names.
//
//List<List<String>> names= Arrays.asList(
//
//Arrays.asList("John","Jane"),
//
//Arrays.asList("Alex","Alice"),
//
//Arrays.asList("Bob","Bella"),
//
//Arrays.asList("Alice","John")
//
//);
//
//find List<String> ,remove duplicate, sort them alphabetically
//
//o/p-> [Alex,Alice,Bella,Bob,Jane,John]
//
//*/
//
//    class Main {
//
//        public static void main(String[] args) {
//
//            List<List<String>> names= Arrays.asList(
//
//                    Arrays.asList("John","Jane"),
//
//                    Arrays.asList("Alex","Alice"),
//
//                    Arrays.asList("Bob","Bella"),
//
//                    Arrays.asList("Alice","John")
//
//            );
//
//            names.stream().flatMap(List::stream)
//
//                    .distinct()
//
//                    .sorted()
//
//                    .collect(Collectors.ToList());
//
//            String input= "abcdefghijklmno"
//
//            //o/-> "abc def ghi jkl mno"
//
//            IntStream.range(0, input.length())
//
//                    .filter(i->i%3==0)
//
//                    .mapToObj(i->input.subString(i, Math.min(i+3, input.length())))
//
//                    .collect(Collectors.joining(" "));
//
//        }
//
//    }
//
//    SQL:
//
//    empId    empName  manager_id
//
//  1	    Alice    NULL
//
//  2	    Bob        1
//
//            3	    Charlie    1
//
//            4	    Ivan       2
//
//
//    emp and their manager name
//
//    Select empName AS EmployeeName,
//
//
//2>Manager with at least 2 employee reporting to them
//
//    Select e.empName as EMPLOYEEName,
//
//    m.empName as Manager
//
//    from Employee e
//
//    left inner join employee m
//
//    on e.empId = m.managerId;
//
//
//        2>Manager with at least 2 employee reporting to them
//
//    Select m.empName as ManagerName,
//
//    COUNT(e.empId) as REporteeCount
//
//    from employee e
//
//    join employee m
//
//    on e.manager_id = m.empId
//
//    GroupBy m.empName
//
//    Having count(e.empId) > =2;
//
}
