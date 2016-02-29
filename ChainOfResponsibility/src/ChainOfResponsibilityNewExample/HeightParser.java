package ChainOfResponsibilityNewExample;

//Height Parser for categorizing humans Tall,Average,Low
public abstract class HeightParser {
	private HeightParser successor;
	
	public void setHeightParser(HeightParser parser) {
		this.successor = parser;
	}
	
	protected abstract boolean ParseHuman(Human human);

	//Solves Broken Chain Problem
	public final void ParseHumanFinal(Human human)
	{
		boolean parsedOrNot = this.ParseHuman(human);
		if(!parsedOrNot){
			if (this.successor != null)
			{
				this.successor.ParseHumanFinal(human);
			}else{
				throw new NoSuccessorException();
			}
		}
	}   
}
