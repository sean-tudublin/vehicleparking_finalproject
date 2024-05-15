package MainPackage;

import java.util.List;

public class CarPark {

    public List<Level> levels;
    
    public CarPark(List<Level> levels) {
        this.levels = levels;
    }
    
    public boolean park2(Car car) {
        for (Level level:levels) {
            if(level.park(car)) {
                return true;
            } else {
            }
        }
        return false;
    }
}
