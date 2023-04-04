import java.util.HashSet;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Set;

class a{
    //public static void main(String[] args){
        // int n=s.nextInt();
        // char ar[]={'n','i','k'};
        // for(int i=0;i<ar.length;i++){
        //     System.out.println(ar[i]+',');
        // }
        /*for(int i=0;i<n;i++){
            ar[i]=s.nextInt();
        }
        int even=0;
        int odd=0;
        for(int j:ar){
            if(j%2==0){
                even+=j;
            }
            else{
                odd+=j;
            }
        }
        System.out.println(even);
        System.out.println(odd);
        System.out.println(even*odd);*/


        /*for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }*/
        /*a[0]=10;
        a[1]=20;
        a[2]=30;
        a[3]=40;
        a[4]=50;
        a[5]=60;
        a[6]=70;
        for(int n:a){
            System.out.println(n);
        }*/
        //Split

        // String s="Hello World";
        // System.out.println(s.length());
        // char c[]=s.toCharArray();
        // String d[]=s.split(",");
        // System.out.println(d);
        // for(String o:d){
        //     System.out.println(o);
        // }

        //E-mail verifying
        // String s[]={"student1@iare.ac.in", "student2@email.com","student3@yahoo.com","student4@gmail.com"};
        // for (String i:s){
        //     String t[]=i.split("@");
        //     if (t[1].equals("iare.ac.in"))
        //     System.out.println(t[0]);
        //     if (t[1].equalsIgnoreCase("gmail.com"))
        //     System.out.println(t[0]);
        //}
            // String s="0123456789";
            // System.out.println(s.substring(4,7));
        
        //Palindrome
        // Scanner s=new Scanner(System.in);
        // int n=s.nextInt();
        // int t=n;
        // int r=0;
        // while(t!=0){
        //     r=(r*10)+(t%10);
        //     t=(int)t/10;
        // }
        // if(r==n){
        //     System.out.println("Palindrome");
        // }
        // else{
        //     System.out.println("Not");
        // }

        //Add palindrome numbers only

        // Scanner s=new Scanner(System.in);
        // int size=s.nextInt();
        // int[] a=new int[size];
        // for (int i:a){

        // }
        public static int fact(int a){
            if(a==1)
                return 1;
            else
            return a*fact(a-1);
            }
        public static void main(String[] args){
            int a=5;
            System.out.println(fact(a));
        }
    }

