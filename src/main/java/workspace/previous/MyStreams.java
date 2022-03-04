package workspace.previous;

import data.lab.Lab;
import data.lab.Mentor;
import data.lab.Project;
import data.lab.Student;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MyStreams {

    public static void main(String[] args) {
        System.out.println(args);
    }

    public static void ex1() {
        IntStream.rangeClosed(0, 10).forEach(System.out::println);
    }

    public static String ex2(String names) {
        return Stream.of(names.split(", "))
                .filter(s -> s.length() > 5)
                .map(String::toUpperCase)
                .collect(Collectors.joining(", "));
    }

    public static String ex3(String surnames) {
        return Arrays.stream(surnames.split(", "))
                .filter(s -> s.startsWith("A"))
                .collect(Collectors.joining(", "));
    }

    public static long ex4(int[] nums) {
        return Arrays.stream(nums)
                .filter(x -> x % 2 == 0)
                .count();
    }

    public static List<Animal> ex5(List<Animal> animals) {
        return animals.stream()
                .filter(a -> "Dog".equals(a.getType()))
                .collect(Collectors.toList());
    }

    public static void ex6(Lab lab) {
        var result = lab.getProjects().stream()
                .max(Comparator.comparing(x -> x.getStudents().size()))
                .get();
    }

    public static void ex7(Lab lab) {
        lab.getProjects().stream().mapToLong(p -> p.getStudents().size()).sum();
    }

    public static void ex8(Lab lab) {
        lab.getProjects().stream()
                .flatMap(p -> p.getStudents().stream())
                .distinct()
                .forEach(System.out::println);
    }

    public static void ex9(Lab lab) {
        lab.getProjects().stream()
                .collect(Collectors.toMap(Project::getName, Project::getStudents));
    }

    public static void ex10(List<Student> students) {
        students.stream()
                .filter(s -> "edp".equals(s.getNameOfProject()))
                .collect(Collectors.toList());
    }

    public static void ex11(Lab lab) {
        lab.getProjects().stream()
                .flatMap(p -> p.getStudents().stream())
                .map(Student::getName)
                .distinct()
                .collect(Collectors.joining(", "));
    }

    public static void ex12(Lab lab) {
        lab.getProjects().stream()
                .flatMap(p -> p.getStudents().stream())
                .sorted(Comparator.comparing(Student::getDateOfJoinProject))
                .limit(3)
                .collect(Collectors.toList());
    }

    public static void ex13(Lab lab) {
        lab.getProjects().stream()
                .flatMap(p -> p.getStudents().stream())
                .min(Comparator.comparing(Student::getDateOfJoinProject))
                .get();

    }

    public static void ex14(Lab lab) {
        lab.getProjects().stream()
                .flatMap(p -> p.getMentors().stream())
                .map(Mentor::getName)
                .distinct()
                .collect(Collectors.toList());
    }

    public static void ex15(Lab lab) {
        lab.getProjects().stream()
                .flatMap(p -> p.getStudents().stream())
                .collect(Collectors.groupingBy(s -> s.getDateOfJoinProject().getYear()));

    }

    public static void ex16(Lab lab) {
        lab.getProjects().stream()
                .flatMap(p -> p.getMentors().stream())
                .collect(Collectors.partitioningBy(m -> m.getRole().equals("backend")));
    }
}
