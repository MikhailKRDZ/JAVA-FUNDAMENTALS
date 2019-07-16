package task2;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class StudentCriteria {
    List<Student> students;
    ArrayList<Student> studentsFaculty;
    ArrayList<ArrayList<Student>> studentsAllFacultyAllCourses;
    ArrayList<Student> studentsGroup;
    ArrayList<Student> studentsOlderDateOfBirth;
    private String recFaculty;
    private String minYearOfBirth;
    private String groupName;

    public StudentCriteria(List<Student> students) {
        this.students = students;
    }

    public ArrayList<Student> setStudentsFaculty(String recFaculty) {
        this.recFaculty = recFaculty;
        studentsFaculty = new ArrayList<>();
        for (Student student:students) {
            Student.UniversityGroup universityGroup = Student.UniversityGroup.getUniversityGroupByCode(student.getGroup());
            if (universityGroup.isFaculty(Student.Faculty.valueOf(recFaculty))) {
                studentsFaculty.add(student);
            }
        }
        return studentsFaculty;
    }

    public  ArrayList<ArrayList<Student>> sortAllStudent() {
         studentsAllFacultyAllCourses = new ArrayList<>();
        for (Student.Faculty titleFaculty : Student.Faculty.values()) {
            for (Student.Course tittleCourse : Student.Course.values()) {
                ArrayList<Student> studentsCourses = new ArrayList<>();
                for (Student student : students) {
                    Student.UniversityGroup universityGroup = Student.UniversityGroup.getUniversityGroupByCode(student.getGroup());
                    if (universityGroup.isFaculty(Student.Faculty.valueOf(String.valueOf(titleFaculty))) && universityGroup.isCourse(Student.Course.valueOf(String.valueOf(tittleCourse)))) {
                        studentsCourses.add(student);
                    }
                }
                studentsAllFacultyAllCourses.add(studentsCourses);
            }
        }
        return studentsAllFacultyAllCourses;
    }

    public ArrayList<Student> setStudentsOlderDateOfBirth(String minYearOfBirth) throws ParseException {
        this.minYearOfBirth = minYearOfBirth;
        studentsOlderDateOfBirth = new ArrayList<>();
        for (Student student : students) {
            if (student.showStudentsBornAfter(minYearOfBirth)) {
                studentsOlderDateOfBirth.add(student);
            }
        }
        return studentsOlderDateOfBirth;
    }

    public ArrayList<Student> setStudentsGroup(String groupName) {
        this.groupName = groupName;
        studentsGroup = new ArrayList<>();
        for (Student student : students) {
            if (student.getGroup() == groupName) {
                studentsGroup.add(student);
            }

        }
        return studentsGroup;
    }

    public void showStudents(String recFaculty, ArrayList<Student> students) {
        String strFaculty = String.format("Cписок студентов заданного критерия :%5s%n%-3s%-9s%-9s%-9s%-7s%-35s%-7s%-5s%-5s%-5s%n", recFaculty, "id",
                "Фамилия", "Имя", "Отчество", " Дата рождения", "Адрес", "Телефон", "Факультет", "Курс", "Группа");
        System.out.print(strFaculty);
        for (Student st : students) {
            System.out.println(st.toString());
        }
        System.out.println("----------------------------------");
    }

    public void showStudents(ArrayList<ArrayList<Student>> studentsAllFacultyAllCourses) {

        System.out.println("Списки студентов для каждого факультета и курса:");
        for (ArrayList<Student> studentsCourses : studentsAllFacultyAllCourses) {
            for (Student st : studentsCourses) {
                if (studentsCourses.indexOf(st) == 0) {
                    String str1 = String.format("Факультет :%4s%5s%5s%n", st.getFaculty(), "Курс", st.getCourse());
                    String str = String.format("%3s%9s%9s%9s%7s%35s%7s%5s%5s%5s%n", "id",
                            "Фамилия", "Имя", "Отчество", " Дата рождения", "Адрес", "Телефон", "Факультет", "Курс", "Группа");
                    System.out.print(str1 + str);
                }
                System.out.println(st.toString());
            }
        }
        System.out.println("----------------------------------");
    }
}

