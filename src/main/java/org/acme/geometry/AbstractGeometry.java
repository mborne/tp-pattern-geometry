package org.acme.geometry;

public abstract class AbstractGeometry implements Geometry{

    public abstract Geometry clone();

    public abstract String asText();
    
}
