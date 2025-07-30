import java.util.*;

public class Fibonacci{
public static void main(String[] args){

Scanner sc=new Scanner(System.in);
System.out.println("n:");
int n=sc.nextInt();

int prev1=0;
int prev2=1;
int newValue=0;

for(int i=1;i<=n;i++){
newValue=prev2+prev1;
prev1=prev2;
prev2=newValue;
}

System.out.println(newValue);

}
}