package ChainOfResponsibilityNewExample;

public class LowHeightParser extends HeightParser{

	@Override
	protected boolean ParseHuman(Human human) {
		if(human.getHeight() <= 160){
			System.out.println(human.getNameLastName() + " is low");
			return true;
		}
		return false;
	}

}
