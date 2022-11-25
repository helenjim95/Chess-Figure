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

            int steps = 0;
            if (units % 2 == 0) {
                steps = units / 2;
            } else {
                steps = units / 2 + 1;
            }

            switch (direction) {
                case "SE":
//                    x position increase, y position increase
                    if (this.getxPosition() + steps <= 7 && this.getyPosition() + steps <= 7) {
                        this.setxPosition(this.getxPosition() + steps);
                        this.setyPosition(this.getyPosition() + steps);
                    }
                    break;
                case "SW":
//                    x position decrease, y position increase
                    if (this.getxPosition() - steps >= 0 && this.getyPosition() + steps <= 7) {
                        this.setxPosition(this.getxPosition() - steps);
                        this.setyPosition(this.getyPosition() + steps);
                    }
                    break;
                case "NE":
//                    x position increase, y position decrease
                    if (this.getxPosition() + steps <= 7 && this.getyPosition() - steps >= 0) {
                        this.setxPosition(this.getxPosition() + steps);
                        this.setyPosition(this.getyPosition() - steps);
                    }
                    break;
                case "NW":
//                    x position decrease, y position decrease
                    if (this.getxPosition() - steps >= 0 && this.getyPosition() - steps >= 0) {
                        this.setxPosition(this.getxPosition() - steps);
                        this.setyPosition(this.getyPosition() - steps);
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
