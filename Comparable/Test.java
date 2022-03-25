import java.util.*;
//comparable is use to sort the objects based on particular instance variable ,by default ascedning,and descding(explicilty).
public class Test {
    public Test() {
        super();
    }

    public static void main(String[] args) {
        ArrayList<Student> arr = new ArrayList<>();
        Student s1 = new Student(1, "Gaurav", "B");
        Student s2 = new Student(2, "Aman", "C");
        Student s3 = new Student(3, "Chirag", "A");
//        Student s3 = new Student(1, "mukulit", "C");
        arr.add(s1);
        arr.add(s2);
        arr.add(s3);
        Collections.sort(arr);
        for (Student st : arr) {
            System.out.println(st);
        }

    }
}
