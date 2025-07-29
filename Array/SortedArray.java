//Check if an Array is Sorted.
//Given an array arr[], check if it is sorted in ascending order or not. Equal values are allowed in an array and two consecutive equal values are considered sorted.

public class SortedArray{

static Boolean sorted(int arr[]){
int n=arr.length;
for(int i=0; i<n-1; i++){
for(int j=i+1; j<n; j++){
if(arr[i]>arr[j]){
return false;
}
}
}
return true;
}

public static void main(String[] args){
int arr[] = {10, 20, 30, 40, 50,2};
System.out.println(sorted(arr));

}
}

