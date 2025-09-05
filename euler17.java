class euler17th
{
    public static void main(String args[])
    {
        String[] oneto10={"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","FOURTEEN",
        "fifteen","sixteen","seventeen","eighteen","nineteen"};
        String[] tens={"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
       int sum=0;
       String total="";
        for(int i =1;i<=1000;i++)
        { int n=i;
            String word="";
         if(n==1000)
         {
        word+="onethousand";
         }
         else
         {
           if(n>=100)
           {
           word+="hundred"+oneto10[n/100];
           if(n%100!=0){
            word+="and";
           }
        }
        n=n%100;
         if (n < 20) 
         {
            word += oneto10[n];
            } 
            else
             {
                word += tens[n/10] + oneto10[n % 10];
                }
            }
        total+=word;
            }
            System.out.println(total.length());
    }
    
}
