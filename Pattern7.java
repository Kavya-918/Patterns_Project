public class Pattern7 {
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
                System.out.print(j);
            }
            System.out.println();
        }
    }    
}

/*
 * i
 * 
 * 1
 * 22
 * 333
 * 4444
 * 55555
 * 
 * j
 * 1
 * 12
 * 123
 * 1234
 * 12345
 */