package io.github.some_example_name;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class Cell {
    private int xCell;
    private int yCell;
    private int wCell;
    private int hCell;

    public Cell(int cellX, int cellY, int cellW, int cellH){
        this.xCell = cellX;
        this.yCell = cellY;
        this.wCell = cellW;
        this.hCell = cellH;
    }

    public int getxCell() {return xCell;}
    public void setxCell(int xCell) {this.xCell = xCell;}
    public int getyCell() {return yCell;}
    public void setyCell(int yCell) {this.yCell = yCell;}
    public int getwCell() {return wCell;}
    public void setwCell(int wCell) {this.wCell = wCell;}
    public int gethCell() {return hCell;}
    public void sethCell(int hCell) {this.hCell = hCell;}

    public void draw(ShapeRenderer sr){
        sr.setColor(1,1,1,1);
        sr.rect(xCell, yCell, wCell, hCell);

    }
}
