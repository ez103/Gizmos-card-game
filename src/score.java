public class score implements Comparable {
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
    public int compareTo(Object other) {
        return Integer.compare(((score)other).getScr(), this.getScr());
    }

}
