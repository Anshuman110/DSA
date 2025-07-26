import java.util.*;
public class AP{

static int num(int a1, int a2, int n){
int a=a1;
int d=a2-a1;

for(int i=1; i<n; i++){
a+=d;
}

return a;
}

public static void main(String[] args){
Scanner sc=new Scanner(System.in);

System.out.println("a1: ");
int a1=sc.nextInt();

System.out.println("a2: ");
int a2=sc.nextInt();

System.out.println("n: ");
int n=sc.nextInt();

System.out.println(num(a1,a2,n));
}
}