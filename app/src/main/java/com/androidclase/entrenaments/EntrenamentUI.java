package com.androidclase.entrenaments;

import android.graphics.drawable.Drawable;

public class EntrenamentUI {

    private int image;
    private Entrenament entrenament;

    public EntrenamentUI(int image, Entrenament entrenament) {
        this.image = image;
        this.entrenament = entrenament;
    }

    public int getTrainingIco() {
        return image;
    }

    public String getTrainingText() {
        return entrenament.getNom();
    }
}
