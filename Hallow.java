/* Hallow Pattern
 * *****
 * *   *
 * *   *
 * *   *
 * *****
 */

public class Hallow {
    public static void main(String[] args) {
        int i,j;
        int n=5;
       /*  for(i=1; i<=n; i++)
        {
            for(j=1; j<=n; j++)
            {
                if(i==1 || i==5 || j==1 || j==5)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/

        //numbers-Hallow
        for(i=1; i<=n; i++)
        {
            for(j=1; j<=n; j++)
            {
                if(i==1|| i==n || j==1 || j==n)
                {
                    System.out.print(j + " ");
                }
                else
                {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }
    
}
