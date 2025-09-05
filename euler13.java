class euler13
{
    public static void main(String ags[])
    {
        String a="371072875339021027987979982208375902465101357402504637693767749000971264812489697007805041701826053874324986199524741059474233309513058123726617309629";
        int sum=0;
        for(int i=0;i<150;i++)
        {
            sum+=a.charAt(i)-'0';
        }
        int dup=sum;
        System.out.println(sum/1000000000);
        }
        

    }

