package io.github.some_example_name;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.utils.ScreenUtils;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class Main extends ApplicationAdapter {
    private SpriteBatch batch;
    private Texture image;
    private Cell Cell;
    ShapeRenderer sr;
    private Cell[][] cells = new Cell [10][10];

    @Override
    public void create() {
        batch = new SpriteBatch();
        int[] xPositions = {10, 110, 210, 310, 410, 510, 610, 710, 810, 910};
        int[] yPositions = {10, 110, 210, 310, 410, 510, 610, 710, 810, 910};
        for(int i = 0; i<xPositions.length; i++){
            for(int j = 0; j<yPositions.length; j++){
                Cell c = new Cell(xPositions[i], yPositions[j], 90, 90);
                cells[i][j] = c;
            }
        }

    }

    @Override
    public void render() {
        ScreenUtils.clear(0, 0, 0, 0);
        sr.begin(ShapeRenderer.ShapeType.Filled);
        for(int i = 0; cells.length; i++)
        batch.end();
    }

    @Override
    public void dispose() {
        batch.dispose();
        image.dispose();
    }
}
