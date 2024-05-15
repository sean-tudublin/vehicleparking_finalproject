package MainPackage;

public class CarParkSpace {
    public int row;
    public int column;
    public int level;
    public Car carOccupyingSlot;
    
    public CarParkSpace(int row, int column, int level) {
        this.row = row;
        this.column = column;
        this.level = level;
    }
    
    public void park(Car car) {
        this.carOccupyingSlot = car;
    }
}
