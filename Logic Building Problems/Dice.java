import java.util.*;
public class Dice{

static int number(int n){
int x=7-n;
return x;
}

public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("n: ");
int n=sc.nextInt();
System.out.println(number(n));
}
} 