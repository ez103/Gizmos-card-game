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
}
