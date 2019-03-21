package com.example.rick.tictactoe;

import com.example.emobadaragaminglib.Base.Graphics;
import com.example.emobadaragaminglib.Base.Screen;
import com.example.emobadaragaminglib.Implementation.AndroidGame;
import com.example.rick.tictactoe.Assets.MyX_O;
import com.example.rick.tictactoe.Assets.PlaceHolderAssets;
import com.example.rick.tictactoe.Views.GameScreen;

public class GameActivity extends AndroidGame {


    @Override
    public Screen getInitScreen() {
        initAssets();
        return new GameScreen(this);
    }

    private void initAssets() {
        MyX_O.__o = getGraphics().newImage(R.drawable.o,Graphics.ImageFormat.ARGB8888,getResources());
        MyX_O.__x = getGraphics().newImage(R.drawable.x,Graphics.ImageFormat.ARGB8888,getResources());
        PlaceHolderAssets.square = getGraphics().newImage(R.drawable.square,Graphics.ImageFormat.ARGB8888,getResources());
    }
}
