import java.io.*;
class q2
{
	public static void main(String args[])
	{
	    int i,j,k; char d;
	    for(i=1;i<=7;i++)
        {
            d=64;

            for(k=1;k<=7-i;k++)
                {
                   System.out.print(" ");
                }

            for(j=1;j<=(2*i)-1;j++)
            {
                if(j<=i)
                {
                    d+=1;
                    System.out.print(d);

                }
                if(j>i)
                {
                    d-=1;
                    System.out.print(d);

                }
            }
            System.out.println();
        }

        for(i=1;i<=6;i++)
        {
            d=64;

            for(k=1;k<=i;k++)
                {
                   System.out.print(" ");
                }

            for(j=1;j<=(2*(7-i))-1;j++)
            {
                if(j<=(2*(7-i))/2)
                {
                    d+=1;
                    System.out.print(d);

                }
                if(j>(2*(7-i))/2)
                {
                    d-=1;
                    System.out.print(d);

                }
            }
            System.out.println();
        }
	}
}
