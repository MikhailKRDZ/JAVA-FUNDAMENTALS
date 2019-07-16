package task2;
//Создать классы, спецификации которых приведены ниже. Определить конструкторы и методы setТип(), getТип(), toString().
// Определить дополнительно методы в классе, создающем массив объектов. Задать критерий выбора данных и вывести эти данные на консоль.
// В каждом классе, обладающем информацией, должно быть объявлено несколько конструкторов.
////1. Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон, Факультет, Курс, Группа.


import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

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
        List<Student> students = new ArrayList<>();
        for (Student st : student) {
            students.add(st);
        }

        StudentCriteria studentCriteria = new StudentCriteria(students);
//Создать массив объектов.
        //вывести данные на консоль.
// a) список студентов заданного факультета;
        String facultyName = "MMF";
        ArrayList<Student> studentsFaculty =  studentCriteria.setStudentsFaculty(facultyName);
        String headlineFaculty = "Факультет : " + facultyName;
        studentCriteria.showStudents(headlineFaculty,studentsFaculty);

 //b) списки студентов для каждого факультета и курса;
        ArrayList<ArrayList<Student>> sortAllStudent =  studentCriteria.sortAllStudent();
        studentCriteria.showStudents(sortAllStudent);

//c) список студентов, родившихся после заданного года;
        String minYearOfBirth = "2001";
        ArrayList<Student> studentsOlderDateOfBirth = studentCriteria.setStudentsOlderDateOfBirth(minYearOfBirth);
        String headlineYearOfBirth = "Мин.Год Рождения : " + minYearOfBirth;
        studentCriteria.showStudents(headlineYearOfBirth,studentsOlderDateOfBirth);

//d) список учебной группы.
        String groupName = "625";
        ArrayList<Student> studentsGroup = studentCriteria.setStudentsGroup(groupName);
        String headlineGroup = "Группа : " + groupName;
        studentCriteria.showStudents(headlineGroup,studentsGroup);
    }
}