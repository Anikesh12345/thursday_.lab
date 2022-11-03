public class Pattern_java {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int i,j;
		for(i=1;i<=5;i++)  //(Row)
		{
			for(j=4;j>=i;j--) //(Coulomb)
			{
				System.out.print(" "); //(Space)	
			}
			for(j=1;j<2*i;j++) 
			{
				System.out.print("*"); //(Star)
			}
			System.out.println(); //(Next line)
		}

	}

}
