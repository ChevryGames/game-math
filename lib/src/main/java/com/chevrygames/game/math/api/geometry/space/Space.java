package com.chevrygames.game.math.api.geometry.space;

/**
 * A generic <a href="https://en.wikipedia.org/wiki/Space_(mathematics)">mathematical space</a> purposed for geometry.
 */
public interface Space {

    /**
     * Gets the <a href="https://en.wikipedia.org/wiki/Dimension">dimension</a> of the space, i.e. "the minimum number of coordinates needed to specify any point within it".
     *
     * @return the <a href="https://en.wikipedia.org/wiki/Dimension">dimension</a> of the space
     */
    int getDimension();

    boolean hasSubSpace();

    Space getSubSpace();

    Space getSuperSpace();
}
