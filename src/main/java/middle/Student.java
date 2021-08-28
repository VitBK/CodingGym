package middle;

import java.time.LocalDate;

public class Student {
    private String name;
    private LocalDate dateOfJoinProject;
    private String nameOfProject;

    public Student(String name, LocalDate dateOfJoinProject, String nameOfProject) {
        this.name = name;
        this.dateOfJoinProject = dateOfJoinProject;
        this.nameOfProject = nameOfProject;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfJoinProject() {
        return dateOfJoinProject;
    }

    public String getNameOfProject() {
        return nameOfProject;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", dateOfJoinProject=" + dateOfJoinProject +
                ", nameOfProject='" + nameOfProject + '\'' +
                '}';
    }
}
