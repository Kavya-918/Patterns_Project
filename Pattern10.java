public class Pattern10 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1; i<=n; i++)
        {
            for(int k=1; k<=(n-i); k++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++)
            {
                if(j==i || i==n || j==1)
                {
                System.out.print(i + " ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
        
    }
    
}
/*
    *  
   * *
  *   *
 *     *
* * * * *


i

    1  
   2 2
  3   3
 4     4
5 5 5 5 5


j

    1  
   2 2  
  3   3  
 4     4  
5 5 5 5 5 




 */
