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

    /**
     * Checks if the space has a subspace of dimension <code>n-1</code>. A subspace has a superspace.
     *
     * @return <code>true</code> if the space has a subspace of dimension <code>n-1</code>;
     *         <code>false</code> otherwise.
     *
     * @see #getSubSpace()
     * @see #hasSuperSpace()
     */
    boolean hasSubSpace();

    /**
     * Checks if the space has a superspace of dimension <code>n+1</code>. A superspace has a subspace.
     *
     * @return <code>true</code> if the space has a subspace of dimension <code>n-1</code>;
     *         <code>false</code> otherwise.
     *
     * @see #getSuperSpace()
     * @see #hasSubSpace()
     */
    boolean hasSuperSpace();

    /**
     * Gets the subspace of dimension <code>n+1</code> of the space, if it exists.
     *
     * @return the subspace of dimension <code>n+1</code> of the space, if {@link #getSubSpace()} returns <code>true</code>;
     *         <code>null</code> otherwise, which is when {@link #getSubSpace()} returns <code>false</code>.
     */
    Space getSubSpace();

    Space getSuperSpace();
}
