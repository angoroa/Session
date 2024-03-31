import java.net.StandardSocketOptions;
import java.util.ArrayList;

// Enter를 누르세요. 그러면 코드 내에서 공백 문자를 확인할 수 있습니다.
public class Main{

    public static void main(String[] args) {
       Student student1 = new Student("홍길동",175,74);
       Student student2 = new Student("이서경",180,78);
       Student student3 = new Student("이영희",155,49);
       Student student4 = new Student("김멋사",182,82);
        ArrayList<Student> students = new ArrayList<>();

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        Student BigStudent = findBigStudent(students);
        students.remove(BigStudent);

        for (Student s : students){
            s.printIntro();
            s.say();
        }
    }

    public static Student findBigStudent(ArrayList<Student> students) {
        Student BigStudent = students.get(0);
        float highestBMI = BigStudent.getBMI();

        for (Student s : students) {
            float bmi = s.getBMI();
            if (bmi > highestBMI) {
                highestBMI = bmi;
                BigStudent = s;
            }
        }
        return BigStudent;
    }



}






