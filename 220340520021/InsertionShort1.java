import java.util.Scanner;

public class InsertionShort1{

public static void insertIntoSorted(int[]ar){

int length = ar. length;
int elementNeeddtobeInserted= ar[length-1];
for (int i=length-2;i>=0;i--  ){
if (ar[i]> elementNeeddtobeInserted){

ar[i+1]=ar[i];

printArray(ar);

}
else{
ar[i+1]=elementNeeddtobeInserted;
printArray( ar);
break;

}
if ((i==0)&&(ar[i]>elementNeeddtobeInserted)){
ar[i]=elementNeeddtobeInserted;
printArray( ar);

}
}


}
  public static void main(int[] args){
for (int n: ar){

  			System.out.println(n+" " );
}
  			System.out.println(" " );

}
}