public class Location {
    private final int theRow;
    private final int theCol;

    public Location(int r, int c) {
        theRow = r;
        theCol = c;
    }

    public int getRow() {
        return theRow;
    }

    public int getCol() {
        return theCol;
    }
    public String toString()
    {
        return theRow + ", " + theCol;
    }
}