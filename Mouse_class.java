package JavaSteps;

public class Mouse_class {	
		static int rndm1;
		static int rndm2;
		
	public void hidemouse3x3()
	{
		int matriz[][] = new int[3][3];
		this.rndm1 = (int)(Math.random()*matriz.length+1);
		this.rndm2 = (int)(Math.random()*matriz.length+1);
	}
		
	public void hidemouse5x5()
	{
		int matriz[][] = new int[5][5];
		this.rndm1 = (int)(Math.random()*matriz.length+1);
		this.rndm2 = (int)(Math.random()*matriz.length+1);
	}
	
	public void hidemouse10x10()
	{
		int matriz[][] = new int[10][10];
		this.rndm1 = (int)(Math.random()*matriz.length+1);
		this.rndm2 = (int)(Math.random()*matriz.length+1);
	}
	
	public void hidemousecustom(int a, int b)
	{
		int matriz[][] = new int[a][b];
		this.rndm1 =(int)(Math.random()*matriz.length+1);
		this.rndm2 =(int)(Math.random()*matriz.length+1);
	}
}
