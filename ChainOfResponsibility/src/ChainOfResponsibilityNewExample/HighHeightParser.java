package ChainOfResponsibilityNewExample;

public class HighHeightParser extends HeightParser{

	@Override
	protected boolean ParseHuman(Human human) {
		if(human.getHeight() >= 180){
			System.out.println(human.getNameLastName() + " is tall!");
			return true;
		}
		return false;
	}

}
