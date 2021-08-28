package middle;

public class Main {
    public static void main(String[] args) {
        Lab labaratory = new Lab();

//        //какой проект имеет больше всего студентов
//        String pr = companies.stream()
//                .flatMap(company->company.getProjects().stream())
//                .max((x,y)->Long.valueOf(x.getStudents().stream().count()).compareTo(y.getStudents().stream().count())).get().getName();
//
////какой проект имеет меньше всего менторов
//        String prName = companies.stream().flatMap(company->company.getProjects().stream())
//                .min((x,y)->Long.valueOf(x.getMentors().stream().count()).compareTo(Long.valueOf(y.getMentors().stream().count())))
//                .get().getName();
//
////вывести имена всех студентов со всех проектов
//        companies.stream().flatMap(company->company.getProjects().stream()).flatMap(project->project.getStudents().stream()).map(student->student.getName()).forEach(System.out::println);
//
//        //вывести имена первых 3 студентов, которые дольше всего находится в лабе
//        List<String> students = companies.stream().flatMap(company->company.getProjects().stream())
//                .flatMap(project->project.getStudents().stream())
//                .sorted(Comparator.comparing(middle.Student::getDateOfJoiningToProject))
//                .map(student->student.getName()+":"+student.getDateOfJoiningToProject())
//                .limit(3).collect(Collectors.toList());
//
//        System.out.println(students);
//
//        //вывести имя студента, который меньше всего находится в лабе
//        String elderStudent = companies.stream().flatMap(company->company.getProjects().stream()).flatMap(project->project.getStudents().stream())
//                .max(Comparator.comparing(middle.Student::getDateOfJoiningToProject))
//                .map(student->student.getName()).get();
//        System.out.println(elderStudent);
//
//
////найти менторов проекта edp
//
//        String namesMentorsEdp = companies.stream()
//                .flatMap(company->company.getProjects().stream())
//                .filter(project->project.getName().equals("edp"))
//                .flatMap(project->project.getMentors().stream())
//                .map(mentor->mentor.getName()).collect(Collectors.joining(", "));
//
//        System.out.println(namesMentorsEdp);
//
//        //вывести всех студентов по году зачисления
//
//        Map<Integer , List<middle.Student>> mapa = companies.stream().flatMap(company->company.getProjects().stream())
//                .flatMap(project->project.getStudents().stream())
//                .collect(Collectors.groupingBy(student->student.getDateOfJoiningToProject().getYear()));
//
//        System.out.println(mapa);
//
//
////вывести менторов, разделив на 2 группы: относятся к backend или нет
//        Map<Boolean, List<middle.Mentor>> map2 = companies.stream().flatMap(company->company.getProjects().stream())
//                .flatMap(project->project.getMentors().stream())
//                .collect(Collectors.partitioningBy(mentor->mentor.getRole().equals("backend")));
//
//        System.out.println(map2);
//        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%");
//        //вывести менторов: ключ - роль, имя - значение
//        Map<Integer, String> map3 = companies.stream().flatMap(company->company.getProjects().stream())
//                .flatMap(project->project.getMentors().stream())
//                .collect(Collectors.toMap(mentor->mentor.getId(), mentor->mentor.getName()));
//
//        System.out.println(map3);

    }


}
