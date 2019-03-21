package com.example.rick.tictactoe.Views;

import com.example.emobadaragaminglib.Base.Game;
import com.example.emobadaragaminglib.Base.Screen;
import com.example.emobadaragaminglib.Components.Sprite;
import com.example.rick.tictactoe.Assets.PlaceHolderAssets;
import com.example.rick.tictactoe.Sprites.Square;
import com.example.rick.tictactoe.logic.BoardImpl;

public class GameScreen extends Screen {
    private Square ph[][];
    private BoardImpl board;
    public GameScreen(Game game) {
        super(game);
        putPlaceHolders();
        board = new BoardImpl();
    }

    private void putPlaceHolders(){
        ph = new Square[3][3];
        int w_unit = game.getGraphics().getWidth() / 3;
        int h_unit = game.getGraphics().getHeight() / 3;
        for(int i =0;i<3;i++){
            for(int j=0;j<3;j++){
                ph[i][j] = new Square(game,PlaceHolderAssets.square,i*w_unit,j*h_unit,h_unit,w_unit);
                addSprite(ph[i][j]);
            }
        }
    }

    @Override
    public void handleTouchDown(int x, int y, int pointer) {
        super.handleTouchDown(x, y, pointer);
        Sprite s = getDraggedSprite();
        if(s.getClass()==Square.class){
            Square mSquare = (Square) s;
            mSquare.fillSquare(this.board);
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
