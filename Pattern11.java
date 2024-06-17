public class Pattern11 {
    public static void main(String[] args) {
        int n=5;
       
        for(int i=1; i<=n; i++)
        {
            int count=i;
            for(int j=1; j<=(n-i)+1; j++)
            {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();

        }
    }  
}

/*
1 2 3 4 5 
2 3 4 5 
3 4 5 
4 5 
5 
 */