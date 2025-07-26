//to check whether a given number is even or odd.
import java.util.*;

public class evenOdd{

static boolean check(int n){
if(n%2==0){
return true;
}
else{
return false;
}
}

public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter number: ");
int n=sc.nextInt();
System.out.println(check(n));
}

}
