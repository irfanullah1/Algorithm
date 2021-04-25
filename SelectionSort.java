package BubbleSort;

public class SelectionSort {

  public static void main(String[] args) {
  
  int[] list={4,6,2,1,8};
  
  System.out.println("UnSorted list");
  for(int i=0; i<5;i++)
  {
    
    System.out.print(list[i]);
    
    
  }
  
  
  int n=5;
  
  for(int i=0; i<n; i++)
  {
    //tem index
    int t=i;
    for(int j=i; j<n;j++)
    {
      //varible t vaule is checked with all Array values
      if(list[j]<list[t])
      {
      t=j;
      int temp=list[i];
      list[i]=list[t];
      list[t]=temp;
      
        
      }
      
    }
    
    
  }
   
  System.out.println("\nSorted list");
  for(int i=0; i<5;i++)
  {
    
    System.out.print(list[i]);
    
    
  }

  }

}
