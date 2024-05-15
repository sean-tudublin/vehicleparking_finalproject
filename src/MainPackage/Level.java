package MainPackage;

import java.util.LinkedList;
import java.util.List;

public class Level {
    public int levelNumber;
    public int rows;
    public List<CarParkSpace> takenSlots;
    public int SPACES_PER_ROW = 2;

    public Level(int rows, int levelNumber){
        this.levelNumber = levelNumber;
        this.rows = rows;
        this.takenSlots = new LinkedList<>();

    }

    public CarParkSpace findAvailableSpot(){
        int totalNumberSlots = rows * SPACES_PER_ROW;
        if(takenSlots.size()>=totalNumberSlots){
            return null;
        }else if(takenSlots.isEmpty()){
            return new CarParkSpace(0,0,levelNumber);
        }else{
            CarParkSpace lastSpaceOccupied = takenSlots.get(takenSlots.size()-1);
            if(lastSpaceOccupied.column<SPACES_PER_ROW){
                return new CarParkSpace(lastSpaceOccupied.row, lastSpaceOccupied.column+1,levelNumber);
            }else{
                return new CarParkSpace(lastSpaceOccupied.row+1,0,levelNumber);
            }
        }
    }

    public boolean park(Car car){
        CarParkSpace freeSpace = findAvailableSpot();
        if(freeSpace ==null){
            return false;
        }else{
            freeSpace.park(car);
            takenSlots.add(freeSpace);
            return true;
        }
    }

}