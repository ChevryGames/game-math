package com.chevrygames.game.math.api.geometry.vector;

import com.chevrygames.game.math.api.geometry.space.Space;

// TODO : Compare strictly equals
public interface Vector <TSpace extends Space> extends Comparable<Vector<TSpace>> {

    TSpace getSpace();

    Vector<TSpace> negate();

    Vector<TSpace> add(Vector<TSpace> vec);

    Vector<TSpace> subtract(Vector<TSpace> vec);

    Vector<TSpace> normalize();
}
