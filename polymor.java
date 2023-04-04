import java.lang.Math;
//polymorphism- a method giving different for different input.types:runtime(override) and compiletime(overload)
/*
class anim{
   */
/*1 public void speak(){
        System.out.println("animal can speak");
    }1*//*

    public int add(int a, int b){
        return a+b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }
    public String add(String a, String b){
        return a+b;
    }
}
*/
/*1class Dog extends anim{

    public void speak(){
        System.out.println("Dog barks");
    }
}
class cat extends anim{
    public void speak(){
        System.out.println("cat says meow");
    }
}1*/

class shape{
    public int cal(int a, int b){
        return a*b;
    }
    public int cal(int a, int b, int c){
        return a*b*c;
    }
    public double cal(int a){
        double b=Math.pow(a,0.5);
        return (3.14*b);
    }
}
public class polymor {
    public static void main(String[] args){
        /*anim a=new anim();
        System.out.println(a.add(10,20));
        System.out.println(a.add(10,20,30));
        System.out.println(a.add("hello","world"));*/
        shape s=new shape();
        System.out.println(s.cal(3,5));
        System.out.println(s.cal(3,5,10));
        System.out.println(s.cal(3));

    }
}
