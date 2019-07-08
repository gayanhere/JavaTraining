import java.util.ArrayList;
import java.util.List;

public class Student {

                private String name;
                private double marks;

    public double getMarks()
    {return  marks;}

    //constructor
    Student(String name,double marks)
    {
        this.name = name;
        this.marks = marks;
    }
    public  Student(){}

    public  static List<Student>getAllStudents(){

        List<Student> students = new ArrayList<>();

        students.add(new Student("Saman",87.45));
        students.add(new Student("gayan",34.5));
        students.add(new Student("sugath",54.7));
        students.add(new Student("nimal",76.3));
        students.add(new Student("keerthi",73.2));

return students;

    }
    @Override
public String toString(){

        return  "Employee{" + "name='" + name + '\'' + ",marks=" + marks+ '}';

    }

    public  String getName() {return name;}
    public  void setName(){this.name = name;}
    public  double getMark(){return marks; }
    public  void  setMarks(){this.marks = marks;}

}
