package Cordinates;

public class Cord {
    private int x;
    private int y;

    public Cord() {
        this.x = 0;
        this.y = 0;
    }

    public Cord(int x, int y) {
        this.x = x;
        this.y = y;
    }

     public String toString(){
        return "Rooster: ("+x+","+y+")";
    }

    public int distance(int x, int y){
        return Math.abs(x-y);
    }
}
