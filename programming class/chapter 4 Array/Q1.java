//WAJP TO INITIALIZA 5 STUDENT PERCENTAGE AND DISPLAY THE HIGHEST PERCENTAGE 
// I/P=[78.05%,65.78%,45.67%,76.43%,98.08%]
// O/P=[THE HIGHTEST PERCENTAGE IS -98.08%]

public class Q1
{
    public static void main(String args[])
    {
        double[] per={78.05,65.87,45.67,76.43,98.08};
        double big=per[0];
        for(int i=0;i<per.length;i++)
        {
            if(per[i]>big)
            {
                big=per[i];
            }
        }
        System.out.println("the highest percentage "+big);
    }
}