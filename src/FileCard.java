
public class FileCard extends Card {
    private int chooseMarble; // how many of the 6 visible marbles you can pick
    private int randomMarble; // how many random marbles can you draw
    private int playerVictoryPoints; // how many player victory points this will give the player. NOT card victory points; thats in the Card class.
    
    public FileCard(int cost, String costColor, int cardVictoryPoints, int tier, String category, BufferedImage image) {
        super(cost, costColor, cardVictoryPoints, tier, category, image);
	}

    public void setFileCard(int chooseMarble, int randomMarble, int playerVictoryPoints) {
        this.chooseMarble = chooseMarble;
        this.randomMarble = randomMarble;
        this.playerVictoryPoints = randomMarble;
    }


}
