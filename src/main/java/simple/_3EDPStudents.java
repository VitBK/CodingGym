package simple;

import middle.Lab;
import middle.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _3EDPStudents {
    static List<Student> students = new ArrayList<>();
    public static void main(String[] args) {
        Lab lab = new Lab();
        students.addAll(lab.getBeaconStudents());
        students.addAll(lab.getEdpStudents());
        students.addAll(lab.getLamaStudents());
        getEDPStudents();
    }

    //Есть список students с полями: name, dateOfJoinProject, nameOfProject
    //Сохранить в список всех студентов с проекта "edp"
    public static List<Student> getEDPStudents(){
        students.stream().filter(student -> student.getNameOfProject()=="edp").forEach(System.out::println);
        List<Student> studentsRes = students.stream().filter(student -> student.getNameOfProject()=="edp")
                .collect(Collectors.toList());
        return studentsRes;
    }
}

