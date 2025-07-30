public class SelectionSort{
public static void main(String[] args){

int arr[]={64, 34, 25, 5, 22, 11, 90, 12};
int n=arr.length;

for(int i=0;i<n-1;i++){
int minIndex=i;
for(int j=i+1;j<n;j++){
if(arr[j]<arr[minIndex]){
minIndex=j;
}
}
int minValue=arr[minIndex];
for(int k=minIndex; k>i; k--){
arr[k]=arr[k-1];
}
arr[i]=minValue;
}

for(Integer m:arr){
System.out.print(m + " ");
}

}
}