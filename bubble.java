public class bubble 
{
        public static void main(String args[])
     {
       bubblee object=new bubblee();
    }
}
class bubblee
{
    bubblee()
    {
        int a[] = { 2, 50, 9, 70, 3, 1, 80, 76 };
        System.out.println("BEFORE SORTING --->");
        for (int n:a)
        {
            System.out.print(n+" ");
        }
        for (int i=0;i<a.length-2;i++)
        {
            for (int j=0;j<=a.length-2;j++)
            {
                
                if(a[j]>a[j+1])
                {
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
               }
                
        

            }
        }
        System.out.println("AFTER SORTING-->");
        for (int n:a)
        {
            System.out.print(n+" ");
        }


    }
}

