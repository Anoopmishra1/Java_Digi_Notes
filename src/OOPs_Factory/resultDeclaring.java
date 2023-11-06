package OOPs_Factory;
import java.util.Scanner;
class Student{
    String name;
    int enrollment;
    int dateOfBirth, math, Art, Hindi, English, chemistry, cs;
}
class Exam extends Student{
     public void detail(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  name");
        name = sc.next();
        System.out.println("enter your enrollment ");
        enrollment = sc.nextInt();
        System.out.println("enter your dateOfBirth ");
        dateOfBirth = sc.nextInt();
        System.out.println("enter your math ");
        math = sc.nextInt();
        System.out.println("enter your Art ");
        Art = sc.nextInt();
        System.out.println("enter your Hindi ");
        Hindi = sc.nextInt();
        System.out.println("enter your English ");
        English = sc.nextInt();
        System.out.println("enter your chemistry ");
        chemistry = sc.nextInt();
        System.out.println("enter your cs ");
        cs = sc.nextInt();
        System.out.println("enter your enrollment ");
    }
}
class StudentResult extends Exam {
    int total;

    public void calculateResult() {
        total = math + Art + Hindi + English + chemistry + cs;
    }
    public void display(){
        System.out.println("name is " +name);
        System.out.println("enrollment number is " +enrollment);
        System.out.println("DOB is " +dateOfBirth);
        System.out.println("number is "+math);
        System.out.println("number is "+Art);
        System.out.println("number is "+Hindi);
        System.out.println("number is "+English);
        System.out.println("number is "+chemistry);
        System.out.println("number is "+cs);
        System.out.println( " totel is " +total);

    }
}

public class resultDeclaring {
    public static void main(String[] args) {
//        StudentResult s2 = new StudentResult();
//        s2.detail();
//        s2.calculateResult();
//        s2.display();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int numStudents = sc.nextInt();

        StudentResult[] students = new StudentResult[numStudents];

        for (int i = 0; i < numStudents; i++) {
            students[i] = new StudentResult();
            students[i].detail();
            students[i].calculateResult();
            students[i].display();
        }

    }


}

