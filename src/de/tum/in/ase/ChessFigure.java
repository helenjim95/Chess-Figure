package de.tum.in.ase;

public abstract class ChessFigure {
    private String colour;
    private String material;
    private int xPosition;
    private int yPosition;

    public ChessFigure(String colour, String material, int xPosition, int yPosition) {
        this.colour = colour;
        this.material = material;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getxPosition() {
        return xPosition;
    }

    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }
}
