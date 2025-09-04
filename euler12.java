class twelve
{
    public static void main(String args[])
    {int sum=0;
        for(long i=1;i<=999999999999L;i++)
        {    sum+=i;
            int count=0;
              for(int j=1;j<=sum;j++)
              {
               if(sum%j==0)
               count++;
              }
              if(count>=500)
              { System.out.println(sum);
               break;}
             }
}
}
