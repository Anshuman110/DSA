//sum of first n natural number.

import java.util.*;
public class Sum{

static int sum(int n){
int sum=0;
for(int i=1 ; i<=n ; i++){
sum+=i;
}
return sum;
}

public static void main(String[] args){
System.out.println(sum(10));
}

}