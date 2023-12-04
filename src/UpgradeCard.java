import java.awt.image.BufferedImage;
import java.util.*;

public class UpgradeCard extends Card {
    private int marbleLimitIncrease;
    private int fileLimitIncrease;
    private int researchLimitIncrease;

    private boolean negateFile;
    private boolean negateResearch;
    
    private int tierTwoDiscount;
    private int buildFromFileDiscount;
    private int buildFromResearchDiscount;

    private boolean isVpMarbles;
    private boolean isVpPlayerVp;

    public UpgradeCard(int cost, String costColor, int cardVictoryPoints, int tier, String category, BufferedImage image) {
        super(cost, costColor, cardVictoryPoints, tier, category, image);
	}

    public UpgradeCard(String s, BufferedImage image) {
		super(s, image);
	}
    
    public void setUpgradeCard(int mLimit, int fLimit, int rLimit, String negator, String discount, String extraVp) {
    	this.marbleLimitIncrease = mLimit;
    	this.fileLimitIncrease = fLimit;
    	this.researchLimitIncrease = rLimit;
    	
    	negateFile = false;
    	negateResearch = false;
    	if (negator.equals("f")) {
    		negateFile = true;
    	}
    	else if (negator.equals("r")) {
    		negateFile = true;
    	}
    	
    	tierTwoDiscount = 0;
    	buildFromFileDiscount = 0;
    	buildFromResearchDiscount = 0;
    	if (discount.equals("t")) {
    		tierTwoDiscount = 1;
    	}
    	else if (discount.equals("f")) {
    		buildFromFileDiscount = 1;
    	}
    	else if (discount.equals("r")) {
    		buildFromResearchDiscount = 1;
    	}
    	
    	isVpMarbles = false;
    	isVpPlayerVp = false;
    	if (extraVp.equals("m")) {
    		isVpMarbles = true;
    	}
    	else if (extraVp.equals("p")) {
    		isVpPlayerVp = true;
    	}
    }
    
    public int getFileIncrease() {
		return fileLimitIncrease;
	}

	public int getMarbleIncrease() {
		// TODO Auto-generated method stub
		return marbleLimitIncrease;
	}

	public int getResearchIncrease() {
		// TODO Auto-generated method stub
		return researchLimitIncrease;
	}
}
