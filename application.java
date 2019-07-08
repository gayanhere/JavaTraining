import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class application {
    public static void main(String[] args) {
        //       alist s = new alist("gayan",57);
        List<alist> list = new ArrayList<>();
        list.add(new alist("gayan", 34));
        list.add(new alist("gihann", 548));
        list.add(new alist("amal", 98));
        list.add(new alist("kauri", 34));
        list.add(new alist("samith", 48));
        list.add(new alist("nihal", 53));



        list.forEach(alist ->{
            System.out.println("Name :" + alist.getname() + ",Marks :" +alist.getmarks());
        });
}}