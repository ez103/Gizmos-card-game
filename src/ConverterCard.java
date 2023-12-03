import java.awt.image.BufferedImage;

public class ConverterCard extends Card {
	private String startColor;
	private String colorB = "";
	private boolean performOnTwo; // converter type A. This tells if we can convert 2 marbles or 1 marble.
	private boolean doubleIt; // true = converter type B, false = converter type A. Converter B allows to double as many marbles as you want.
	public ConverterCard(int cost, String costColor, int cardVictoryPoints, int tier, String category, BufferedImage image) {
		super(cost, costColor, cardVictoryPoints, tier, category, image);
		// TODO Auto-generated constructor stub
	}

	public ConverterCard(String s, BufferedImage image) {
		super(s, image);
	} 
	
	public void setConverterA(String startColor, boolean performOnTwo) {
		this.doubleIt = false;
		this.startColor = startColor;
		this.performOnTwo = performOnTwo;
	}
	
	public void setConverterB(String startColor) {
		this.startColor = startColor;
		this.doubleIt = true;
	}
	public void setColorB(String color) {
		colorB = color;
	}
	
	public String getStartColor() {
		return startColor;
	}
	public String getColorB() {
		return colorB;
	}
	
	public boolean isConverterB() {
		return doubleIt;
	}
	public boolean isPerformOnTwo() {
		return performOnTwo;
	}
}
