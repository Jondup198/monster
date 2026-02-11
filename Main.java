package io.github.some_example_name;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.utils.ScreenUtils;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class Main extends ApplicationAdapter {
    private SpriteBatch batch;
    private Texture image;
    private Player p;
    private Monster m;

    ShapeRenderer sr;
    private Cell[][] cells = new Cell [10][10];

    @Override
    public void create() {
        sr = new ShapeRenderer();
        batch = new SpriteBatch();


        p = new Player(32.5f, 32.5f, 45, 45);

        int[] xPositions = {10, 110, 210, 310, 410, 510, 610, 710, 810, 910};
        int[] yPositions = {10, 110, 210, 310, 410, 510, 610, 710, 810, 910};

        for(int i = 0; i<xPositions.length; i++){
            for(int j = 0; j<yPositions.length; j++){
                Cell c = new Cell(xPositions[i], yPositions[j], 90, 90);
                cells[i][j] = c;
            }
        }

        m = spawnMonster();
    }

    public int randBetween(int min, int max){
        double d;
        int i;
        d = Math.random();
        i = (int) (d * (max - min + 1) + min);
        return i;
    }

    private Monster spawnMonster() {
        int randXIndex = randBetween(0, 9);
        int randYIndex = randBetween(0, 9);
        return new Monster(cells[randXIndex][randYIndex].getxCell()+ 22.5f, cells[randXIndex][randYIndex].getyCell()+22.5f , 45, 45);
    }

    private boolean monsterCatch(){
        if(m.getxMonst() == p.getxPlayer() && m.getyMonst() == p.getyPlayer()){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public void render() {
        ScreenUtils.clear(0, 0, 0, 1);
        sr.begin(ShapeRenderer.ShapeType.Filled);

        for(int i = 0; i< cells.length; i++){
            for (int j = 0; j < cells[i].length; j++) {
                cells[i][j].draw(sr);
            }
        }

        p.draw(sr);

        m.draw(sr);


        if (Gdx.input.isKeyJustPressed(Input.Keys.UP) || Gdx.input.isKeyJustPressed(Input.Keys.W)) {
            if (p.getyPlayer() < 900) {
                    p.setyPlayer(p.getyPlayer() + 100);
            }
        }
        if (Gdx.input.isKeyJustPressed(Input.Keys.DOWN) || Gdx.input.isKeyJustPressed(Input.Keys.S)) {
            if (p.getyPlayer() > 100) {
                    p.setyPlayer(p.getyPlayer() - 100);
            }
        }
        if (Gdx.input.isKeyJustPressed(Input.Keys.LEFT) || Gdx.input.isKeyJustPressed(Input.Keys.A)) {
            if (p.getxPlayer() > 100) {
                    p.setxPlayer(p.getxPlayer() - 100);
            }
        }
        if (Gdx.input.isKeyJustPressed(Input.Keys.RIGHT) || Gdx.input.isKeyJustPressed(Input.Keys.RIGHT)) {
            if (p.getxPlayer() < 900) {
                    p.setxPlayer(p.getxPlayer() + 100);
            }
        }

        sr.end();
    }

    @Override
    public void dispose() {
        batch.dispose();
        image.dispose();
    }
}
