package de.tum.in.ase;

public abstract class ChessFigure {
    private String color;
    private String material;
    private int xPosition;
    private int yPosition;

    public ChessFigure(String color, String material, int xPosition, int yPosition) {
        this.color = color;
        this.material = material;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
