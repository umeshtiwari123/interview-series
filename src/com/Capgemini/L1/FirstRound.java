package com.Capgemini.L1;

public class FirstRound {
    /*

    Top 2 students per class by marks.

Input-->
List<Student> students = List.of(
            new Student("Aarav",  "Class-10", 88),
            new Student("Isha",   "Class-10", 93),
            new Student("Neel",   "Class-10", 76),
            new Student("Riya",   "Class-9",  91),
            new Student("Kabir",  "Class-9",  84),
            new Student("Tanvi",  "Class-9",  97),
            new Student("Arjun",  "Class-8",  62),
            new Student("Sara",   "Class-8",  75),
            new Student("Vikram", "Class-8",  75)
        );
output-->
Class-10 -> [Isha(93), Aarav(88)]
Class-9 -> [Tanvi(97), Riya(91)]
Class-8 -> [Sara(75), Vikram(75)]


Map<String, List<Student>> top2 = students.stream()
				.collect(Collectors.groupingBy(
				Student::getClassName,
 				Collectors.collectingAndThen(
				Collectors.toList(),
				list -> list.stream()
				sorted(Comparator.comparingInt(Student::getMarks).reversed())
				.limit(2)
				.collect(Collectors.toList())
			)
			));



Sort a list of objects by multiple fields


List<Student> sortedStudents = students.stream()
                                .sorted(Comparator.comparing(Student::getClassName)
                                .thenComparing(
                                    Student::getMarks, Comparator.reverseOrder()
                                )
                                .thenComparing(Student::getName)
                                )
                                .collect(Collectors.toList());















     */
}
