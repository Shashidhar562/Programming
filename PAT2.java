
class Student{
    String name;
    int student_id;

//    public Student(){
//        System.out.println("Object is being created");
//    }
//
//
//    public Student(int a){
//        System.out.println("Another constructor");
//    }
    /*public void print_name(){
        System.out.println(name);
    }*/

    public Student(String s_name,int id){
        this.name=s_name;
        this.student_id=id;

    }
    public void print_details(){
        System.out.println("name:"+name+", id:"+student_id);
    }

    public void print_values(String name,int student_id){
        System.out.println("name:"+name+", id:"+student_id);
    }
}


public class PAT2 {
    public static void main(String[] args){
        Student s1=new Student("Rajiv",1001);
        s1.print_details("Mike",1002);

    }

}
