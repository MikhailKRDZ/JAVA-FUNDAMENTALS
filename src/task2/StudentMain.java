package task2;
//Создать классы, спецификации которых приведены ниже. Определить конструкторы и методы setТип(), getТип(), toString().
// Определить дополнительно методы в классе, создающем массив объектов. Задать критерий выбора данных и вывести эти данные на консоль.
// В каждом классе, обладающем информацией, должно быть объявлено несколько конструкторов.
////1. Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон, Факультет, Курс, Группа.
////Создать массив объектов. Вывести:
////a) список студентов заданного факультета;
////b) списки студентов для каждого факультета и курса;
////c) список студентов, родившихся после заданного года;
////d) список учебной группы.
import java.text.ParseException;
import java.util.ArrayList;

public class StudentMain {
    public static void main(String[] args) throws ParseException {
        Student[] student;
        student = new Student[]{new Student(1, "Иванов", "Иван", "Иванович", "01.01.2000",
                " Бирюзова ул., дом 17, кв. 31, Минск 220077", "207-03-42", "ATF", 4, "625"),

                new Student(2, "Петров", "Андрей", "Петрович", "20.01.2001",
                        " Бельского ул., дом 6, кв. 10, Минск 220077", "207-15-42", "ATF", 3, "626"),
                new Student(3, "Иванов", "Cергей", "Иванович", "29.10.2000",
                        " Казинца ул., дом 100, кв. 614, Минск 220015", "207-15-42", "MMF", 4, "126"),
                new Student(4, "Сидоров", "Юрий", "Сидорович", "05.09.2000",
                        " ул. Радужная, 150, Минск 220016", "207-15-42", "MMF", 4, "126"),
                new Student(5, "Козлов", "Андрей", "Казимирович", "07.08.2001",
                        " Текстильная, 14А, Барановичи 225409", "207-15-42", "ATF", 3, "626"),
                new Student(6, "Колесник", "Владимир", "Андреевич", "07.07.2000",
                        " пр-т Московский, 130-1, Витебск 210020", "207-15-42", "ATF", 4, "625"),
                new Student(7, "Попов", "Константин", "Изяславович", "09.05.2001",
                        " пр. Голодеда 15, Молодечно 222301", "207-15-42", "ATF", 3, "626"),
                new Student(9, "Дубов", "Сергей", "Иванович", "21.02.2000",
                        " пр. Голодеда 15, Минск 220077", "207-15-42", "ATF", 4, "625"),
                new Student(10, "Стрельцов", "Игорь", "Юрьевич", "01.05.2001",
                        " пр. Голодеда 15, Минск 220077", "207-15-42", "ATF", 3, "626")
        };

        String facultyName;
        String facultyCourse;
        String minYearOfBirth;
        String bornAfter;
        String groupName;

        //вывести данные на консоль.
//        a) список студентов заданного факультета;
        facultyName = "MMF";
        String strFaculty = String.format("Cписок студентов заданного факультета :%5s%n%-3s%-9s%-9s%-9s%-7s%-35s%-7s%-5s%-5s%-5s%n", facultyName, "id",
                "Фамилия", "Имя", "Отчество", " Дата рождения", "Адрес", "Телефон", "Факультет", "Курс", "Группа");
        ArrayList<Student> studentsFaculty = new ArrayList<>();

        for (int i = 0; i < student.length; i++) {

            Student.UniversityGroup universityGroup = Student.UniversityGroup.getUniversityGroupByCode(student[i].getGroup());
            if (universityGroup.isFaculty(Student.Faculty.valueOf(facultyName))) {
                studentsFaculty.add(student[i]);
            }
        }
        System.out.print(strFaculty);
        for (Student st : studentsFaculty) {
            System.out.println(st.toString());
        }
        System.out.println("----------------------------------");

        //b) списки студентов для каждого факультета и курса;
        ArrayList<ArrayList<Student>> studentsAllFacultyAllCourses = new ArrayList<>();
        for (Student.Faculty titleFaculty : Student.Faculty.values()) {
            for (Student.Course tittleCourse : Student.Course.values()) {
                ArrayList<Student> studentsCourses = new ArrayList<>();
                for (int i = 0; i < student.length; i++) {
                    Student.UniversityGroup universityGroup = Student.UniversityGroup.getUniversityGroupByCode(student[i].getGroup());
                    if (universityGroup.isFaculty(Student.Faculty.valueOf(String.valueOf(titleFaculty))) && universityGroup.isCourse(Student.Course.valueOf(String.valueOf(tittleCourse)))) {
                        studentsCourses.add(student[i]);
                    }
                }
                studentsAllFacultyAllCourses.add(studentsCourses);
            }
        }

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

//c) список студентов, родившихся после заданного года;
        minYearOfBirth = "2001";
        ArrayList<Student> studentsOlderDateOfBirth = new ArrayList<>();
        bornAfter = String.format("Cписок студентов, родившихся после года:%5s%n%-3s%-9s%-9s%-9s%-7s%-35s%-7s%-5s%-5s%-5s%n", minYearOfBirth, "id",
                "Фамилия", "Имя", "Отчество", " Дата рождения", "Адрес", "Телефон", "Факультет", "Курс", "Группа");

        for (int i = 0; i < student.length; i++) {
            if (student[i].showStudentsBornAfter(minYearOfBirth)) {
                studentsOlderDateOfBirth.add(student[i]);
            }
        }

        System.out.print(bornAfter);
        for (Student st : studentsOlderDateOfBirth) {
            System.out.println(st.toString());
        }
        System.out.println("----------------------------------");

//d) список учебной группы.
        groupName = "625";
        ArrayList<Student> studentsGroupe = new ArrayList<>();
        String groupStr = String.format("Cписок учебной группы:%5s%n%-3s%-9s%-9s%-9s%-7s%-35s%-7s%-5s%-5s%-5s%n", groupName, "id",
                "Фамилия", "Имя", "Отчество", " Дата рождения", "Адрес", "Телефон", "Факультет", "Курс", "Группа");

        for (int i = 0; i < student.length; i++) {

            if (student[i].getGroup() == groupName) {
                studentsGroupe.add(student[i]);
            }

        }
        System.out.print(groupStr);
        for (Student st : studentsGroupe) {
            System.out.println(st.toString());
        }
    }
}