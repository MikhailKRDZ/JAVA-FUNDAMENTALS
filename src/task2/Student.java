package task2;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Student {
    private int id;
    private String surname;
    private String name;
    private String patronymicName;
    private Date dateOfBirth;
    private String address;
    private String telephoneNumber;
    private String faculty;
    private int course;
    private String group;

    SimpleDateFormat formatDate = new SimpleDateFormat("dd.MM.yyyy");
    SimpleDateFormat formatYear = new SimpleDateFormat("yyyy");

    public Student(int id,
        String surname,
        String name,
        String patronymicName,
        String dateOfBirth,
        String address,
        String telephoneNumber,
        String faculty,
        int course,
        String group) throws ParseException {
            this.id = id;
            this.surname = surname;
            this.name = name;
            this.patronymicName = patronymicName;
            this.dateOfBirth = formatDate.parse(dateOfBirth);
            this.address = address;
            this.telephoneNumber = telephoneNumber;
            this.faculty = faculty;
            this.course = course;
            this.group = group;
        }


    public void setId(int id) {
            this.id = id;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setPatronymicName(String patronymicName) {
            this.patronymicName = patronymicName;
        }



    public void setDateOfBirth(String dateOfBirth) throws ParseException {

            this.dateOfBirth = formatDate.parse(dateOfBirth);

        }

        public void setAddress(String address) {
            this.address = address;
        }

        public void setTelephoneNumber(String telephoneNumber) {
            this.telephoneNumber = telephoneNumber;
        }

        public void setFaculty(String faculty) {
            this.faculty = faculty;
        }


        public void setCourse(int course) {
            this.course = course;
        }

        public void setGroup(String group) {
            this.group = group;
        }


        public int getId() {
            return id;
        }

        public String getSurname() {
            return surname;
        }

        public String getName() {
            return name;
        }

        public String getPatronymicName() {
            return patronymicName;
        }

        public String getDateOfBirth() {
            return formatDate.format(dateOfBirth);
        }

        public String getAddress() {
            return address;
        }

        public String getTelephoneNumber() {
            return telephoneNumber;
        }

        public String getFaculty() {
            return faculty;
        }

        public int getCourse() {
            return course;
        }

        public String getGroup() {
            return group;
        }


        public String getStudent() {

            return id + " " + surname + " " + name + " " + patronymicName + " " + formatDate.format(dateOfBirth) + " " + address + " " + telephoneNumber +
                    " " + faculty + " " + course + " " + group;

        }

        public boolean showStudentsBornAfter(String targetYear)throws ParseException {
            Date year = formatYear.parse(targetYear);
            if (dateOfBirth.after(year)) {
                return true;
            } else return false;
        }

        public enum UniversityGroup {

            G_625("625", Course.C_4, Faculty.ATF), G_626("626", Course.C_3, Faculty.ATF), G_126("126", Course.C_4, Faculty.MMF),
            ;

            private String universityGroup;
            private Course course;
            private Faculty faculty;


            UniversityGroup(String universityGroup, Course course, Faculty faculty) {
                this.universityGroup = universityGroup;
                this.course = course;
                this.faculty = faculty;
            }

            public boolean isCourse(Course course) {
                return this.course == course;
            }

            public boolean isFaculty(Faculty faculty) {
                return this.faculty == faculty;
            }

            public Course getCourse() {
                return course;
            }

            public Faculty getFaculty() {
                return faculty;
            }


            UniversityGroup(String universityGroup) {
                this.universityGroup = universityGroup;
            }


            public String getUniversityGroup() {
                return universityGroup;
            }

            public void setUniversityGroup(String universityGroup) {
                this.universityGroup = universityGroup;
            }

            public static UniversityGroup getUniversityGroupByCode(String code) {
                for (UniversityGroup group : UniversityGroup.values()) {
                    if (group.universityGroup.equals(code)) {
                        return group;
                    }
                }
                return null;
            }
        }

        public enum Course {
            C_3("3"),

            C_4("4"),

            ;
            private String course;

            private Course() {
            }

            Course(String course) {
                this.course = course;
            }

            public String getCourseRealName() {
                return course;
            }

            public void setCourse(String course) {
                this.course = course;
            }
        }


        public enum Faculty {
            ATF("ATF"), MMF("MMF"),
            ;

            private String facultyRealName;

            Faculty() {

            }

            Faculty(String faculty) {
                this.facultyRealName = faculty;
            }

            public void setFacultyRealName(String facultyRealName) {
                this.facultyRealName = facultyRealName;
            }

            public String getFacultyRealName() {
                return facultyRealName;
            }
        }


        @Override
        public String toString() {

            return " " + getStudent() + ",";
        }

    }


