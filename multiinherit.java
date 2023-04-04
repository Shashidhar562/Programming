//interface is class like structure which has variables asnd methods . All the values are public, static and final.
interface z{
    public void welcome();
    public void something();
}
interface y {
    public void welcome();
}
class x implements z,y
{
    public void welcome(){
        System.out.println("welcome three");
    }
    public void something(){

    }
}

public class multiinherit {
    public static void main(String[] args){
        x ob=new x();
        ob.welcome();
    }
}
