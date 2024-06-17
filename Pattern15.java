public class Pattern15 {
    public static void main(String[] args) {
        int n=5;
        int count=1;
        for(int i=1; i<=n; i++)
        {
            
            for(int j=1; j<=(2*i)-1; j++)
            {
                if(j<i)
                {
                    System.out.print(count++ +  " ");
                }
                else
                {
                    System.out.print(count-- + " ");
                }
            }
            System.out.println();
        }
    }
    
}
