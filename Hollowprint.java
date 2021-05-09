class Hollowprint
{
   public static void main(String arg[])
    {
    int n=5;
    for (int r=1;r<=n;r++)
    {

      for(int c=r;c<n;c++) //Display space from left at every row	c=1

       {
        System.out.print(" ");
       }
     
      for(int c=1;c<=(2*r-1);c++) //Check for double cols of row-1	
      {
       if(r==n||c==1||c==(2*r-1))
        {
        System.out.print("*");
        }
	else
        {
        System.out.print(" ");				
        }
      }
  System.out.println("");
}
}
}