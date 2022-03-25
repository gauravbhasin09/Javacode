import java.lang.Comparable;
public class Student implements Comparable<Student>{
    int id;
    String name;
    String section;
    Student(int id,String name,String section){
        this.id=id;
        this.name=name;
        this.section=section;
    }
    //positive integer 1, if the current object is greater than the specified object.
    //negative integer -1, if the current object is less than the specified object.
    //zero, if the current object is equal to the specified object.
    public int compareTo(Student obj){
//to compare obje cts on string base if two objects are equal it will retrun 0,if current object is smaller than passing object return -1,if current object is greater than passing object then retrurn 1..
        return this.name.compareTo(obj.name);

//        if(this.id==obj.id){
//
//            return this.name.compareTo(obj.name);
//        }
//        else if(this.id>obj.id){
//            return 1;
//        }
//        else if(this.id<obj.id) {
//
//           return   -1;
//        }
//
//        return 0;

    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", section='" + section + '\'' +
                '}';
    }
}
