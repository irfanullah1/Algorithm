package BubbleSort;

public class BubbuleSort {

  public static void main(String[] args) {
  
  
  int[] list={4,6,2,1,8};
  
  System.out.println("UnSorted list");
  for(int i=0; i<5;i++)
  {
    
    System.out.print(list[i]);
    
    
  }
  System.out.println("\nSorted list");
  
  int n=5;
  for(int i=0; i<n;i++)
  {
    
    for(int j=n-1 ; j> i; j--)
    {
      if(list[j]< list[j-1])
      {
      
      int temp=list[j-1];
      list[j-1]=list[j];
      list[j]=temp;
        
        
      }
      
    }
    
    
  }
  
  for(int k=0; k<5;k++)
  {
    
    System.out.print(list[k]);
    
    
  }
  
  
  
  }

}
