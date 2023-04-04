class a{
    String name1="Class A";
    public void welcome(){
        System.out.println("Welcome A");
    }
}
class b extends a{
    String name2="Class B";
    public void home(){
        System.out.println("Welcome B");
}
}
class c extends b{
    public void zoo(){
        System.out.println("zoo");
    }
}

public class multilevelinherit {
    public static void main(String[] args){
        b ob=new b();
        System.out.println(ob.name1);
        ob.welcome();
    }
}
