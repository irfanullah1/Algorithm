package BubbleSort;

public class InsertionSort {

  public static void main(String[] args) {
  
  int[] list={4,6,2,1,8};
  
  System.out.println("UnSorted list");
  for(int i=0; i<5;i++)
  {
    
    System.out.print(list[i]);
    
    
  }
  
  int n=5;
  for(int i=0; i<5;i++)
  {
  
     //temp index
     int j=i;
     //temp value
     int t=list[i];
     //Comapre vaules
     while(j>0 && t< list[j-1])
     {
       list[j]=list[j-1];
       System.out.print("\n In Loop"+list[j]);
       j--;
     }
     list[j]=t;
    
    
  }
  
   System.out.println("\nSorted list");
  for(int i=0; i<5;i++)
  {
    
    System.out.print(list[i]);
    
    
  }
  


  }

}
