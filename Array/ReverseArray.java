//Array Reverse
/*Given an array arr[], the task is to reverse the array. Reversing an array means rearranging the elements such that the first element becomes the last, the second element becomes second last and so on.*/

//using java collections framework.

import java.util.List;
import java.util.ArrayList;

public class ReverseArray{
public static void main(String[] args){
ArrayList<Integer> reverse=new ArrayList<Integer>();

int arr[] = {4,5,1,2};

for(int i=arr.length-1;i>=0;i--){
reverse.add(arr[i]);
}

System.out.println(reverse);
}
}