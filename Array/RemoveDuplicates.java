//Remove duplicates from Sorted Array

/*Given a sorted array arr[] of size n, the goal is to rearrange the array so that all distinct elements appear at the beginning in sorted order. Additionally, return the length of this distinct sorted subarray.*/

//Using Java Collections Framework

import java.util.Set;
import java.util.HashSet;

public class RemoveDuplicates{
public static void main(String[] args){
HashSet<Integer> myNumber=new HashSet<Integer>();

int arr[]={1, 2, 2, 3, 4, 4, 4, 5, 5};

for(int i=0; i<arr.length; i++){
myNumber.add(arr[i]);
}

System.out.println(myNumber);
//length of this distinct sorted subarray.
System.out.println(myNumber.size());
}
}

