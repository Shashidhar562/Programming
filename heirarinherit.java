class animal{
        String char1="runs ";
public void welcome(){
        System.out.println("animal");
        }
        }
class dog extends animal{
    String char2=" barks and ";
    public void home(){
        System.out.print("dog");
    }
}
class lion extends animal{
    String char3="roars and ";
    public void zoo(){
        System.out.print("lion ");
    }
}
public class heirarinherit {
    public static void main(String[] args){
        dog ob=new dog();
        lion bo=new lion();
        ob.home();
        System.out.print(ob.char2);
        System.out.print(ob.char1);
        System.out.println(" ");
        bo.zoo();
        System.out.print(bo.char3);
        System.out.print(bo.char1);


    }
}
