package de.tum.in.ase;

public class Bishop extends ChessFigure implements DiagonalMover {
    public Bishop(String color, String material, int xPosition, int yPosition) {
        super(color, material, xPosition, yPosition);
    }

    @Override
    public void moveDiagonal(int units, String direction) {
        if (units < 0) {
            System.out.println("Units needs to be positive");
        } else {
            switch (direction) {
                case "SE":
//                    x position increase, y position increase
                    if (this.getxPosition() + units <= 7 && this.getyPosition() + units <= 7) {
                        this.setxPosition(this.getxPosition() + units);
                        this.setyPosition(this.getyPosition() + units);
                    }
                    break;
                case "SW":
//                    x position decrease, y position increase
                    if (this.getxPosition() - units >= 0 && this.getyPosition() + units <= 7) {
                        this.setxPosition(this.getxPosition() - units);
                        this.setyPosition(this.getyPosition() + units);
                    }
                    break;
                case "NE":
//                    x position increase, y position decrease
                    if (this.getxPosition() + units <= 7 && this.getyPosition() - units >= 0) {
                        this.setxPosition(this.getxPosition() + units);
                        this.setyPosition(this.getyPosition() - units);
                    }
                    break;
                case "NW":
//                    x position decrease, y position decrease
                    if (this.getxPosition() - units >= 0 && this.getyPosition() - units >= 0) {
                        this.setxPosition(this.getxPosition() - units);
                        this.setyPosition(this.getyPosition() - units);
                    }
                    break;
            }
        }
    }

    //TODO finish implementing the corresponding methods and ineritance relationships
    public static void main(String[] args) {
        //you can do some tests here
    }


}
