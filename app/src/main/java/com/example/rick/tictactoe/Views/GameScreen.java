package com.example.rick.tictactoe.Views;

import android.graphics.Paint;

import com.example.emobadaragaminglib.Base.Game;
import com.example.emobadaragaminglib.Base.Screen;
import com.example.emobadaragaminglib.Components.Sprite;
import com.example.rick.tictactoe.Assets.BackGround;
import com.example.rick.tictactoe.Assets.PlaceHolderAssets;
import com.example.rick.tictactoe.Sprites.PlaceHolder;

public class GameScreen extends Screen {
    private PlaceHolder ph[];
    public GameScreen(Game game) {
        super(game);
        putPlaceHolders();
    }

    private void putPlaceHolders(){
        ph = new PlaceHolder[9];
        int w_unit = game.getGraphics().getWidth() / 3;
        int h_unit = game.getGraphics().getHeight() / 3;
        addSprite(new Sprite(game,BackGround.bg,0,0,h_unit*3,w_unit*3));
        for(int i =0;i<=6;i+=3){
            for(int j=0;j<3;j++){
                ph[i+j] = new PlaceHolder(game,PlaceHolderAssets.theImage,i/3*w_unit,j*h_unit,h_unit,w_unit);
                addSprite(ph[i+j]);
            }
        }
    }

    @Override
    public void render(float deltaTime) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void backButton() {

    }
}
