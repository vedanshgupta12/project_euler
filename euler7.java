class seventh
{
    public static void main(String args[])
    { int count2=0;int i=1;
        for (;i<=9999999;i++)
        { if (count2==10001)
            break;
            int count=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                count++;
                
            } if(count==2)
              count2++;
        }
        System.out.println(i-1);
        
    }
}
