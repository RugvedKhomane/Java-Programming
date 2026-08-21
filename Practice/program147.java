
import java.util.*;
class ArrayX
{
    public void Update(int Arr[])
    {
        int iCnt = 0;

    for(iCnt = 0; iCnt <  5 ; iCnt++)
    {
        Arr[iCnt]++;
    }
    }
}   

    class program147
    {
    public static void main(String A[])
    {
        int Arr[] = {10,20,30,40,50};
        int iCnt = 0;
    
        System.out.println("Array elements before function call : \n");
        for(iCnt = 0;iCnt < 5;iCnt++)
            {
                System.out.println(Arr[iCnt]);
            }

        ArrayX aobj = new ArrayX();    
        aobj.Update(Arr);

        System.out.println("Array elements after function call : \n");
        for(iCnt = 0;iCnt < 5;iCnt++)
        {
            System.out.println(Arr[iCnt]);
        } 
        Arr = null;
        System.gc();
    }
}

