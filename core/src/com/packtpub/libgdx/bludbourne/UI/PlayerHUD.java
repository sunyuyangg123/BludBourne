package com.packtpub.libgdx.bludbourne.UI;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.Scaling;
import com.badlogic.gdx.utils.viewport.*;

public class PlayerHUD implements Screen {

    private Stage _stage;
    private Viewport _viewport;
    private StatusUI _statusUI;

    public PlayerHUD(Camera camera) {
        _viewport = new ScreenViewport(camera);

        _stage = new Stage(_viewport);
        //Gdx.input.setInputProcessor(_stage);

        _statusUI = new StatusUI();

        _stage.addActor(_statusUI);
    }

    @Override
    public void show() {
    }

    @Override
    public void render(float delta) {
        _stage.act(delta);
        _stage.draw();
    }

    @Override
    public void resize(int width, int height) {
        _stage.getViewport().update(width, height, true);
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        _stage.dispose();
    }
}
