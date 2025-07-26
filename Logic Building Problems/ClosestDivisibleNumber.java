import java.util.*;
public class ClosestDivisibleNumber{

static int number(int n, int m){

if(n>0){
int x;
x=n%m; 
int y=n-x;
return y;
}

else if(n<0){
int x;
x=n%m;
m=m+x;
int y=n-m;
return y;
}

else{
return 0;
}

}

public static void main(String[] args){
Scanner sc= new Scanner(System.in);
System.out.println("n: ");
int n=sc.nextInt();
System.out.println("m: ");
int m=sc.nextInt();
System.out.println((number(n,m)));
}

}