class sixth 
{
    public static void main(String args[])
    { int sumofsq=0;
     int sqofsum=0;
      int diff;
        for(int i=1;i<=100;i++)
        {    sqofsum=sqofsum + i;
            sumofsq=sumofsq + i*i;
        }
        sqofsum=sqofsum*sqofsum;
        diff=sqofsum-sumofsq;
    
    System.out.println(diff);
}
}
