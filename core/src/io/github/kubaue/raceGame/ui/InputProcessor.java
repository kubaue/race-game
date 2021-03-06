package io.github.kubaue.raceGame.ui;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import io.github.kubaue.raceGame.engine.actions.GameAction;

import java.util.ArrayList;
import java.util.List;

public class InputProcessor {

    public List<GameAction> actionsFromInput() {
        ArrayList<GameAction> actions = new ArrayList<>();

        if (Gdx.input.isKeyPressed(Input.Keys.UP) || Gdx.input.isKeyPressed(Input.Keys.W)) {
            actions.add(GameAction.ACCELERATE);
        }
        if (Gdx.input.isKeyPressed(Input.Keys.DOWN) || Gdx.input.isKeyPressed(Input.Keys.S)) {
            actions.add(GameAction.BRAKE);
        }
        if (Gdx.input.isKeyPressed(Input.Keys.LEFT) || Gdx.input.isKeyPressed(Input.Keys.A)) {
            actions.add(GameAction.TURN_LEFT);
        }
        if (Gdx.input.isKeyPressed(Input.Keys.RIGHT) || Gdx.input.isKeyPressed(Input.Keys.D)) {
            actions.add(GameAction.TURN_RIGHT);
        }

        return actions;
    }

}
