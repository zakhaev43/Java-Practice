package DPF.builderPattern;

public interface PizzaBuilder {
	
	public void provideOrderName(String orderName);
	
	public PizzaBuilder addCheese();
	
	public PizzaBuilder addTomato();

	public PizzaBuilder addMushroom();
	
	public PizzaBuilder addPineApple();
	
	public Pizza getPizza();
}