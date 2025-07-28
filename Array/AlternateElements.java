//To print alternate elements of an array starting from index 0.
import java.util.*;
public class AlternateElements{

static void alternateElements(int arr[]){
for(int i=0;i<arr.length;i++){
if(i%2==0){
System.out.println(arr[i]);
}
else{
}
}
}

public static void main(String[] args){
int arr[]={10,20,30,40,50}; //Initialization and Declaration of Array
alternateElements(arr); //Calling method
}
}
