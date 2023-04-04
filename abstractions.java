//abstraction:hiding the things which are not necessary
// in arraylist elements are of object type. but if there is any need to specify the data type then mention in < here > with same brackets
import java.util.*;
public class abstractions {
    public static void main(String[] args){
        ArrayList al=new ArrayList();
        al.add(1);
        al.add(2);
        al.add(3);
        System.out.println(al);
        al.remove(0);
        System.out.println(al);
        System.out.println(al.size());
        System.out.println(al.get(1));

    }

}
