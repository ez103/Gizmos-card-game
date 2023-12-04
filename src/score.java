public class score  {
    private int playern;
    private int scr;
    public score(int a, int b){
        playern = a;
        scr = b;

    }
    public int gN(){
        return playern;
    }
    public int getScr(){
        return scr;
    }
    public String tStr(){
        return "player ; "+playern+", scr =  "+scr;
    }


}
