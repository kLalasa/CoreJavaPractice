package Practice240424;

public class Lab001 {

    public static void main(String[] args) {

        Student s1 = new Student(101, "Mohan");
        System.out.println(s1);
    }

        static class Student {

            int rollno;
            String sname;

            @Override
            public String toString() {
                return "Student{" +
                        "rollno=" + rollno +
                        ", sname='" + sname + '\'' +
                        '}';
            }

            public Student(int rollno, String sname) {
                this.rollno = rollno;
                this.sname = sname;
            }


        }

    }