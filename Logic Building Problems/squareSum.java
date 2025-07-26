//finding sum of sqaure of first n natural nnumbers.
import java.util.*;
public class squareSum{

static int sum(int n){
int z;
int sum=0;
for(int i=1 ; i<=n ; i++){
z=i*i;
sum+=z;
}
return sum;
}

public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter any no. ");
int n=sc.nextInt();
System.out.println(sum(n));
}
}
