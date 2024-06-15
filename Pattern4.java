public class Pattern4 {
    public static void main(String[] args) {
        int n=5,count=1;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                if(count < 9)
                {
                    System.out.print("0");
                }
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }  

    }
    
}
