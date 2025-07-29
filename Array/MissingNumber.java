//Find the Missing Number.
/*Given an array arr[] of size n-1 with distinct integers in the range of [1, n]. This array represents a permutation of the integers from 1 to n with one element missing. Find the missing element in the array.*/

public class MissingNumber{
static int number(int arr[]){

int sum1=0;
int sum2=0;
int n=arr.length;

for(int i=0;i<n;i++){
sum1+=arr[i];
}

for(int i=1;i<=n+1;i++){
sum2+=i;
}

int sum=sum2-sum1;
return sum;
}

public static void main(String[] args){
int arr[]={1, 2, 3, 5};
System.out.println(number(arr));
}
}