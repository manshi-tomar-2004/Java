public class insertion_sort {
    public static void main(String a[])
    {
        int ar[]={10,6,9,4,3,7};
        System.out.println("before sorting");
        int k=0;
        for (int n:ar)
        {
            System.out.print(n+ " ");
        }
        for (int i=1;i<ar.length;i++)
        {
            int key=ar[i];
            for(int j=i-1;j>=0;j--)
            {
                if(key<ar[j])
                {
                     k=j;
                    ar[j+1]=ar[j];
                }
            }
            ar[k]=key;
        }
        System.out.println("after sorting");
        for (int n:ar)
        {
            System.out.print(n+ " ");
        }


        
    }
    
}
