package ChainOfResponsibilityNewExample;

//Person who manages Human's heights
public class HeightManager {
	public void ManageHeights(Human human, HeightParser parser){
		parser.ParseHumanFinal(human);
	}
}
