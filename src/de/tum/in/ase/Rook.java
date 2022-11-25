package de.tum.in.ase;

public class Rook extends ChessFigure implements StraightMover  {
    public Rook(String color, String material, int xPosition, int yPosition) {
        super(color, material, xPosition, yPosition);
    }

    //TODO finish implementing the corresponding methods and ineritance relationships
    public static void main(String[] args) {
        //you can do some tests here
    }

    @Override
    public void moveStraight(int units, String direction) {
        if (units < 0) {
            System.out.println("Units needs to be positive");
        } else {
            switch (direction) {
                case "E":
                    if (this.getxPosition() + units < 8) {
                        this.setxPosition(this.getxPosition() + units);
                    }
                    break;
                case "W":
                    if (this.getxPosition() - units < 0) {
                        this.setxPosition(this.getxPosition() - units);
                    }
                    break;
                case "N":
                    if (this.getyPosition() - units < 0) {
                        this.setyPosition(this.getyPosition() - units);
                    }
                    break;
                case "S":
                    if (this.getyPosition() + units < 8) {
                        this.setyPosition(this.getyPosition() + units);
                    }
                    break;
            }
        }
    }
}
