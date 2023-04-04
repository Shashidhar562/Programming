import java.util.HashSet;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Set;

//public class PAT1 {
   // public static void main(String[] args){
        //int a=8, b=9, c=5;
        /*int t=0;
        //print the greatest of three numbers
        if (a>=b && a>=c) t=a;
        else if (b>=c ) t=b;
        else t=c;

        System.out.println(t);
*/
//       System.out.println(a>=b? a>=c? a:c : b>=c? b:c);

        /*System.out.println(Math.max(Math.max(a,b),c));// Math.max returns the greatest b/w two numbers

        System.out.println(Math.min(Math.min(a,b),c));*/

        /*int id=15;
        String name="Chiru";
        //My id is 5. My name is Chiru
        System.out.println("My id is "+id+". My name is "+name+".");
        */

        /*int a;
        System.out.println(a);
*//*
        int a=5; char b='c';
        System.out.println(a+b);//o/p- 104(5+99(ASCII of c)*/


        /*double a=5.6; String y="3";
        System.out.println(a+y);*/

        /*Scanner inp=new Scanner(System.in);
        int a=inp.nextInt(), b=inp.nextInt();
        System.out.println("Sum: "+ (a+b));// if a+b is given then o/p will be ab not a+b
        */

        /*
        Scanner: A class that contains methods to take inputs
        Scanner sc=new Scanner(System.in);
        for int-sc.nextInt()
            byte-sc.nextByte()
            short-sc.nextShort()
            long-sc.nextLong()
            float-sc.nextFloat()
            double-sc.nextDouble()
            String-sc.next() -for one word only
            String-sc.nextLine() -for a line(till \n
            boolean-sc.nextBoolean()
        */
        /*byte x=127;
        x++;
        x++;
        System.out.println(x);
*/
        /*int[] x={120,200,016};
        for (int i=0;i<x.length;i++){
            System.out.println(x[i]," ");
        }
*/
        //No need of {} for single statements in if else statements
        //Print even odd number
        /*Scanner o=new Scanner(System.in);
        long n=o.nextLong(),t=2,c=n/2;
        while(c--!=0){
            System.out.print(t+""+(t-1));
            t+=2;
        }
        if ((n&1)==1)
            System.out.print(t);*/

        /*Scanner o=new Scanner(System.in);
        long n=o.nextLong();
        for (int i=1;i<=n;i++){
            System.out.print((i%2==0)?i-1:i+1);
        }

*/

        /*Scanner o=new Scanner(System.in);
        long n=o.nextLong();
        int c=(int)(Math.log10(n)+1);
        System.out.println(c);
*/
       // System.out.println(1+1+1+1+1==5);

        /*int a=10, b=20;
        int c=a/b;
        System.out.println((a>=5)&&(b<=10)&&(a/c>=5));
*/
        //Smallest of n numbers
        /*Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long ma=Integer.MAX_VALUE;
        for (int i=1;i<=n;i++){
            long p=sc.nextLong();
            ma=Math.min(ma,p);

        }
        System.out.println(ma);*/

        /*Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        int c=0;
        while (n!=0){
            n/=10;
            c++;

        }
        System.out.println(c);
*/
        //sum of n numbers
        /*Scanner sc=new Scanner(System.in);
        long s=0,n;
        do{
            n=sc.nextLong();
            s+=n;
            //System.out.println(s);
        }while (n>=0);
        System.out.println(s);
*/
        //Random game
        /*while (true){
            long n= (long) (Math.random()*10+1);
            if (n==5)
                break;
            System.out.println(n);

        }*/

        /*long[] ml=new long[10];
        ml[0]=12;
        ml[1]=23;
        ml[2]=34;
        ml[3]=45;
        ml[4]=56;
        ml[5]=67;
        ml[6]=78;
        ml[7]=89;
        ml[8]=90;
        ml[9]=01;
        *//*for (int i=0;i<ml.length;i++){
            System.out.println(ml[i]);

        }*//*
        long s=Arrays.stream(ml).sum();
        System.out.println(s/ml.length);
*/
        /*Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] l=new int[size];
        for (int i=0;i<size;i++){
            l[i]=sc.nextInt();
        }
        int key=sc.nextInt();
        for (int j=0;j<size;j++) {
            if (l[j] == key) {
                System.out.println(j);
                break;
            }
        else System.out.println(-1);
        }*/
        //For-each loop
        /*int[] l={1,2,3,2,4,5};
        for (int i:l){
            System.out.print(i+" ");
        }*/

        //HW1
        /*Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=i*i;
            System.out.print(arr[i]+" ");
        }*/

        //HW2

        /*Scanner sc=new Scanner(System.in);
        int[] arr1={11,12,13,44};
        int[] arr2={45,56,78,11};
        Set<Integer> arr3=new HashSet<>();
        for (int i=0;i<arr1.length;i++){
            for (int j=0;j<arr2.length;j++){
                if (arr1[i]==arr2[j])
                    arr3.add(arr1[i]);
            }
        }System.out.println(arr3);
*/

        /*Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int maxi=Integer.MAX_VALUE;
        int a=maxi;
        int[] arr=new int[size];
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int mini=Integer.MIN_VALUE;
        for (int val:arr){
            maxi=Math.max(mini,val);
        }
        System.out.println("Maximum value "+maxi);


        for (int v:arr){
            mini=Math.min(a,v);
        }
        System.out.println("Minimum value "+mini);
*/
        //HW3
        /*
        int[] arr1={11,88,196,-5,148,-189,-22};
        int min=arr1[0],max=arr1[0];
        for (int i=0;i<arr1.length;i++){
            if (max<arr1[i]) max=arr1[i];
            if (min>arr1[i]) min=arr1[i];
        }
        System.out.println("Maximum "+max);
        System.out.println("Maximum "+min);
*/
        //hw4
        /*int[] arr1={11,88,196,-5,148,-189,-22};
        for (int i=arr1.length-1;i>=0;i--){
            System.out.print(arr1[i]+" ");
        }*/

        /*int[] arr1={11,88,196,-5,148,-189,-22};
        System.out.println(arr1[-0]+" "+arr1[0]);
*/

        /*Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for (int i=0;i<=n;i++){
            System.out.println(i);
*/
        /*for (int i=1;i<=10;i=i+2){
            System.out.println(i);
        }*//*
        for (int i=1; i<10 && i%2!=0; i=i++){
            System.out.println(i);
        }*/
/*
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for (int i=1;i<=n;i++){
            if (n%i==0)
                System.out.println(i);
        }*/

        /*
        int n=23;
        boolean p=true;
        for(int i=2;i<(int)n/2;i++){
            if(n%i==0){
                p=false;
                break;
            }
        }
        if(p)
            System.out.println("prime");
        else
            System.out.println("not prime");*/
        /*int n=2;
        int c=10;
        while(c>0){
            boolean p=true;
            for(int i=2;i<=(int)n/2;i++){
                if(n%i==0){
                    p=false;
                    break;
                }
            }
            if(p){
                System.out.println(n);
                c--;
            }
            n++;
        }*/

    /*public static int addm(int a, int b){
        return a+b;
    }
    public int mul(int num1,int num2){
        return num1*num2;
    }
    public static void main(String[] args){
        System.out.println(addm(10,20));
        PAT1 n=new PAT1();
        System.out.println(n.mul(10,20));*/
    // Never create two different class in public access specifier mode. Simply remove access specifier mode for the class in which no main function

Class Student{
    int r=10;
    String n="name1";
    public void displayname(){
        System.out.println(n);
    }
public class PAT1 {
            public static void main(String[] args){
                Student s1=new Student();
                s1.displayname();
            }

    }
}
