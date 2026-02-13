package io.github.some_example_name;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class Items {

    public static class MonsterTrap {
        private float xMT;
        private float yMT;
        private float hMT;
        private float wMT;


        public MonsterTrap(float mtX, float mtY, float mtW, float mtH) {
            this.xMT = mtX;
            this.yMT = mtY;
            this.wMT = mtW;
            this.hMT = mtH;
        }

        public float getxMT() {return xMT;}
        public void setxMT(float xMT) {this.xMT = xMT;}
        public float getyMT() {return yMT;}
        public void setyMT(float yMT) {this.yMT = yMT;}
        public float gethMT() {return hMT;}
        public void sethMT(float hMT) {this.hMT = hMT;}
        public float getwMT() {return wMT;}
        public void setwMT(float wMT) {this.wMT = wMT;}
    }

    public static class Gold {
        private float xGold;
        private float yGold;
        private float hGold;
        private float wGold;


        public Gold(float gX, float gY, float gW, float gH) {
            this.xGold = gX;
            this.yGold = gY;
            this.wGold = gW;
            this.hGold = gH;
        }

        public float getxMT() {return xGold;}
        public void setxMT(float xMT) {this.xGold = xMT;}
        public float getyMT() {return yGold;}
        public void setyMT(float yMT) {this.yGold = yMT;}
        public float gethMT() {return hGold;}
        public void sethMT(float hMT) {this.hGold = hMT;}
        public float getwMT() {return wGold;}
        public void setwMT(float wMT) {this.wGold = wMT;}

        public void draw(ShapeRenderer sr){
            sr.setColor(255,215,0,1);
            sr.rect(xGold, yGold, wGold, hGold);

        }
    }


}
