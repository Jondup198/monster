package io.github.some_example_name;
public class Monster {
    private int xMonst;
    private int yMonst;
    private int wMonst;
    private int hMonst;

    public Monster(int monstX, int monstY, int monstW, int monstH) {
        this.xMonst = monstX;
        this.yMonst = monstY;
        this.wMonst = monstW;
        this.hMonst = monstH;
    }

    public int getxMonst() {return xMonst;}
    public void setxMonst(int xMonst) {this.xMonst = xMonst;}
    public int getyMonst() {return yMonst;}
    public void setyMonst(int yMonst) {this.yMonst = yMonst;}
    public int getwMonst() {return wMonst;}
    public void setwMonst(int wMonst) {this.wMonst = wMonst;}
    public int gethMonst() {return hMonst;}
    public void sethMonst(int hMonst) {this.hMonst = hMonst;}
}
