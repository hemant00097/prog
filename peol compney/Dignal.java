public class Dignal 
{
    static void DigonalMatrix()
    {
        int arr[][]={ 
        { 1, 2, 3, 4 },
        { 5, 6, 7, 8 },
        { 1, 2, 3, 4 },
        { 5, 6, 7, 8 } };
        int row=arr.length;
        int col=arr[0].length;
    
        int rigtside=0;
        int leftside=0;
        int total=0;
     //display

     for(int i=0;i<row;i++)
     {
        for(int j=0;j<col;j++)
        {
            System.out.print(arr[i][j]+", ");
        }
     }
     System.out.println();
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(i==j)
                {
                  System.out.print(arr[i][j]+", ");
                  rigtside+=arr[i][j];
                }
            }
        }
        System.out.println();
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
               if(i+j==arr.length-1)
               {
                    System.out.print(arr[i][j]+" ");
                    leftside+=arr[i][j];
               }
                
            }
            System.out.println();
        }
        total=rigtside+leftside;
        System.out.println(total);

    }
    public static void main(String[] args) 
    {
        DigonalMatrix();
  }
}