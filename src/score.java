public class score {
    private int playern;
    private int scr;
    public score(int a, int b){
        playern = a;
        scr = scr;

    }
    public int gN(){
        return playern;
    }
    public int getScr(){
        return scr;
    }
    @Override
    public int compareTo(Score other) {
        return Integer.compare(other.getScr(), this.getScr());
    }

}
