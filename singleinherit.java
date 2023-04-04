class A{
    String name="Class A";
    public void welcome(){
        System.out.println("Welcome A");
    }
}
class B extends A{


        }

public class singleinherit {
    /* Types:single level,multilevel,hierarchical,multiple(not supported because of diamond problem),hybrid
    */public static void main(String[] args){
        B ob=new B();
        System.out.println(ob.name);
        ob.welcome();
    }

}
