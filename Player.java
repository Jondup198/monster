package io.github.some_example_name;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.Color;

public class Player {
    private float xPlayer;
    private float yPlayer;
    private int wPlayer;
    private int hPlayer;

    public Player(float playerX, float playerY, int playerW, int playerH){
        this.xPlayer = playerX;
        this.yPlayer = playerY;
        this.wPlayer = playerW;
        this.hPlayer = playerH;
    }

    public float getxPlayer() {return xPlayer;}
    public void setxPlayer(double xPlayer) {this.xPlayer = (float) xPlayer;}
    public float getyPlayer() {return yPlayer;}
    public void setyPlayer(double yPlayer) {this.yPlayer = (float) yPlayer;}
    public int getwPlayer() {return wPlayer;}
    public void setwPlayer(int wPlayer) {this.wPlayer = wPlayer;}
    public int gethPlayer() {return hPlayer;}
    public void sethPlayer(int hPlayer) {this.hPlayer = hPlayer;}

    public void draw(ShapeRenderer sr){
        sr.setColor(1, 0, 0, 1);
        sr.rect(xPlayer, yPlayer, wPlayer, hPlayer);
    }
}
