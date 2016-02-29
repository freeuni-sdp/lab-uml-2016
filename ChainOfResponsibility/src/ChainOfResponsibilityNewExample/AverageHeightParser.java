package ChainOfResponsibilityNewExample;

public class AverageHeightParser extends HeightParser{

	@Override
	protected boolean ParseHuman(Human human) {
		if(human.getHeight() < 180 && human.getHeight() > 160){
			System.out.println(human.getNameLastName() + " has average height!");
			return true;
		}
		return false;
	}

}
