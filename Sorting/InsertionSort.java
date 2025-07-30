public class InsertionSort{
public static void main(String[] args){
int arr[]={64, 34, 25, 12, 22, 11, 90, 5};

int n=arr.length;
for(int i=1; i<n; i++){
int insertIndex = i;
int currentValue = arr[i];
int j=i - 1;

while(j>=0 && arr[j]>currentValue){
arr[j+1]=arr[j];
insertIndex=j;
j--;
}
arr[insertIndex]=currentValue;
}

for(Integer m:arr){
System.out.print(m+" ");
}

}
}