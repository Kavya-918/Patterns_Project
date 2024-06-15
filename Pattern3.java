public class Pattern3 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                if(i==1 || i==n || j==1 || j==n)
                {
                    System.out.print(j + " ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
       
    }
    
}
/*
 * i
 * 11111
 * 22222
 * 33333
 * 44444
 * 55555
 * 
 * 
 * j
 * 12345
 * 1   5
 * 1   5
 * 1   5
 * 1   5
 * 12345
 */
