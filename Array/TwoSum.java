//Leetcode problem no.1
//Two Sum
//Given an array of integers "nums" and an integer "target". return indices of the two numbers such that they add up to target.

public class TwoSum{

static int[] indices(int nums[], int target){

int n=nums.length;
for(int i=0; i<n-1; i++){
for(int j=i+1; j<n; j++){

if (nums[i]+nums[j]==target){
return new int[]{i,j}; //return indices if sum matches
}

}
}
return new int[]{}; //return empty array if no such pair found
}

public static void main(String[] args){

int nums[]={2,7,11,15};
int result[]=indices(nums,9);

if(result.length==2){
System.out.println(result[0]+" "+result[1]);
}
else{
System.out.println("No valid pair found");
}

}
}