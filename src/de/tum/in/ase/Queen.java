package de.tum.in.ase;

public class Queen extends ChessFigure implements DiagonalMover, StraightMover  {
    private static final int MAX_DISTANCE = 3;

    public Queen(String color, String material, int xPosition, int yPosition) {
        super(color, material, xPosition, yPosition);
    }

    //TODO finish implementing the corresponding methods and ineritance relationships
    public static void main(String[] args) {
        //you can do some tests here
    }

//     Four possible directions are now: SE, SW, NE, NW,
//     If a figure units 3 to NE ->  x position  increase by 3 units,  y position decrease by 3 units;
//     If a figure units 3 to SW -> x position decrease by 3 units and y position increase by 3 units.
//     If the figure would exceed the chess board with the input units,
//     the figure should stay where it is without moving in any direction.
    @Override
    public void moveDiagonal(int units, String direction) {
        if (units < 1 || units > MAX_DISTANCE) {
            return;
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


//    to get the accurate position, you need to check the direction.
//    There are four possible directions: E, W, N, S, standing for East, West, North, and South.
//    If a figure units 3 to east, it means the x position will increase by 3 units and the y position remains.
//    If the figure would exceed the chess board with the input units,
//    the figure should stay where it is without moving in any direction.
    @Override
    public void moveStraight(int units, String direction) {

        if (units < 0) {
            System.out.println("Units needs to be positive");
        } else {

            if (units > MAX_DISTANCE) {
                units = MAX_DISTANCE;
            }

            switch (direction) {
                case "E":
                    if (this.getxPosition() + units <= 7) {
                        this.setxPosition(this.getxPosition() + units);
                    }
                    break;
                case "W":
                    if (this.getxPosition() - units >= 0) {
                        this.setxPosition(this.getxPosition() - units);
                    }
                    break;
                case "N":
                    if (this.getyPosition() - units >= 0) {
                        this.setyPosition(this.getyPosition() - units);
                    }
                    break;
                case "S":
                    if (this.getyPosition() + units <= 7) {
                        this.setyPosition(this.getyPosition() + units);
                    }
                    break;
            }
        }
    }
}
