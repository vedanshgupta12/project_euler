public class euler21
 {
    public static void main( String args[])
    { int amicable=0;
        for(int i=1;i<=10000;i++)
        {int sum1=0;
            for(int j=1;j<i;j++)
            {
                if(i%j==0)
                {
                 sum1+=j;
                }

            } if(sum1!=i)
            {int sum2=0;
            for(int k=1;k<sum1;k++)
            {
             if(sum1%k==0)
             {  
                sum2+=k;
               }
            }
            if(i==sum2)
            {
              amicable+=i;
            }
        }
    }
    System.out.println(amicable);
    }

    
}
