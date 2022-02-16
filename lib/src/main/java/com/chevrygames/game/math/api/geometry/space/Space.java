package com.chevrygames.game.math.api.geometry.space;

public interface Space {

    int getDimensionality();

    boolean hasSubSpace();

    Space getSubSpace();

    Space getSuperSpace();
}
