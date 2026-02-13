package io.github.some_example_name;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class Monster {
    private float xMonst;
    private float yMonst;
    private float wMonst;
    private float hMonst;


    public Monster(float monstX, float monstY, float monstW, float monstH) {
        this.xMonst = monstX;
        this.yMonst = monstY;
        this.wMonst = monstW;
        this.hMonst = monstH;

    }

    public float getxMonst() {return xMonst;}
    public void setxMonst(float xMonst) {this.xMonst = xMonst;}
    public float getyMonst() {return yMonst;}
    public void setyMonst(float yMonst) {this.yMonst = yMonst;}
    public float getwMonst() {return wMonst;}
    public void setwMonst(float wMonst) {this.wMonst = wMonst;}
    public float gethMonst() {return hMonst;}
    public void sethMonst(float hMonst) {this.hMonst = hMonst;}

    public void draw(ShapeRenderer sr){
        sr.setColor(1, 0, 0, 1);
        sr.rect(xMonst, yMonst, wMonst, hMonst);
    }
}
