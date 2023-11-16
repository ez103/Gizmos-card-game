import java.util.*;
import java.awt.image.*;
import java.awt.*;

public class Deck {
    public ArrayList<Card> cards; 
    
    // parameter s must be in this format
    // : [cost][lowercase first letter of color][cardVP][tier][category: lowercase first letter]
    public Deck() {
        Card r1p1_1 = new FileCard("1a11f");
        cards.add(r1p1_1);

        Card r1p1_2 = new FileCard("1u11f");
    }
}
