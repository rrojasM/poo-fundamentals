package com.rrojas.prototypes;

import com.rrojas.models.AbstractStone;

@FunctionalInterface
public interface StonePrototype<S extends AbstractStone> {
    S buildPrototype();
}
