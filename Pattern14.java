public class Pattern14 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1; i<=n; i++)
        {
            for(int k=1; k<=(n-i); k++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i)-1; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
/*
 * 
    *
   ***
  *****
 *******
*********


i
    1
   222
  33333
 4444444
555555555


j
    1
   123
  12345
 1234567
123456789

 */

