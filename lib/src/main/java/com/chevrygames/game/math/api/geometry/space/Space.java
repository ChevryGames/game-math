package com.chevrygames.game.math.api.geometry.space;

/**
 * A generic <a href="https://en.wikipedia.org/wiki/Space_(mathematics)">mathematical space</a> purposed for geometry.
 */
public interface Space {

    int getDimensional();

    boolean hasSubSpace();

    Space getSubSpace();

    Space getSuperSpace();
}
