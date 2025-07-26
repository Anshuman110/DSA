public class Swap{

static void swap(int a, int b){
System.out.println("a:" + a + " b:" + b );//before swapping
int temp=a;
a=b;
b=temp;
System.out.println("a:" + a + " b:" + b );//after swapping
}

public static void main(String[] args){
swap(1,2);
}

}