package IntegrationContinue.IntegrationContinue;

public class Calculs 
{ 
	private final int operande1; 
	private final int operande2; 
	
	public Calculs(int operande1, int operande2) 
	{ 
		this.operande1 = operande1; 
		this.operande2 = operande2; 
	} 
	
	public int multiplier() 
	{ 
		return operande1 * operande2; 
	} 
	
	
	
	public int additionner() 
	{ 
		return operande1 + operande2; 
	} 
	
	
	
	public int diviser() 
	{ 
		if (operande1 != 0 && operande2 != 0)
			return operande1 / operande2;
		return 0;
	} 
	
	
	
	public int soustraire() 
	{ 
		return operande1 - operande2; 
	} 
}