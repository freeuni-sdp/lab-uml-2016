
public class Client {

	
	public void test() {
		
		MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU","Breakfast");
		MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
		MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
		MenuComponent dessertMenu = new Menu("DESSERT MENU","Dessert of course!");
		MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
		allMenus.add(pancakeHouseMenu);
		allMenus.add(dinerMenu);
		allMenus.add(cafeMenu);
		
		//menu items
		dinerMenu
				.add(new MenuItem(
						"Pasta",
						"Spaghetti with Marinara Sauce, and a slice of sourdough bread",
						true, 3.89));
		dinerMenu.add(dessertMenu);
		dessertMenu.add(new MenuItem("Apple Pie",
				"Apple pie with a flakey crust, topped with vanilla icecream",
				true, 1.59));
		
		Waitress waitress = new Waitress(allMenus);
		waitress.printMenu();

		
	}
	
	public static void main(String args[]) {
		Client c = new Client();
		c.test();
	}
}