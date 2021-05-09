class pattern7
{
	public static void main(String args[])
	{
		for (int i=1;i<=5;i++)//row
		{
			for(int j=5;j>=i;j--)//space
			{
				System.out.print(" ");
                           }
                               for(int k=1;k<=i;k++)//comlb
			{
                             System.out.print(j+" ");
                               }
 			    
                              
				System.out.println();

		}		
		
}
}

