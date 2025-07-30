public class LinearSearch{
public static void main(String[] args){
int arr[]={3,7,2,9,5};
int target=9;
int result=linearSearch(arr,target);
if(result!=-1){
System.out.println("Value:" + target + " Index:" + result);
}
else{
System.out.println("Value " + target + " not found");
}
}

public static int linearSearch(int arr[],int target){

for (int i = 0; i < arr.length; i++) {
if (arr[i] == target) {
return i;
}
}
return -1;
 
}
}