import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Rank {
    public static void main(String[] args) {
        //System.out.println("sort");
        //sort();
        //System.out.println("sort lamda");
        sortlamda();
    }

    public static void sort(){

        List<Student> students = Student.getAllStudents();
        System.out.println(students);
        Collections.sort(students,new StudentRanker());
        System.out.println(students);


    }

    public static  void sortlamda()
    {
        Comparator<Student> studentComparator=(s1,s2)->(s1.getMarks()<s2.getMarks()?-1:(s1.getMarks()>s2.getMarks()?1:0));
        //System.out.println(studentComparator);

    }


}
