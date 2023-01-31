
package turnpikesimulator;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class TurnpikeSimulator {
   
    private static final int BOOTH_COUNT = 2;
    private static final int VEHICLE_COUNT = 100;
    
    private static final int AXLE_PRICE = 1;
    private static final int HEIGHT_PRICE = 2;
    
    private List<Booth> booths;
    
    public TurnpikeSimulator() {
        booths = new LinkedList();
    }

    public static void main(String[] args) {
        new TurnpikeSimulator().run();
    }
    
    public void run() {
        for(int i = 0; i < BOOTH_COUNT; i++) {
            booths.add(new Booth(HEIGHT_PRICE, AXLE_PRICE));
        }
        
        for(int i = 0; i < VEHICLE_COUNT; i++) {
            Booth booth = booths.get(i%2);
            booth.add(getRandomVehicle());
        }
        
        boolean stop = false;
        while(!stop) {
            for(Booth booth: booths) {
                if(!booth.isEmpty()) {
                    booth.collect();
                }
            }
        }
    }
    
    private Vehicle getRandomVehicle() {
        Vehicle vehicle;
        
        int random = new Random().nextInt(100);
        
        if(random < 70) {
            vehicle = new Car();
        } else if(random < 90) {
            vehicle = new Truck();
        } else {
            vehicle = new MotorBike();
        }
        
//        switch(random) {
//            case 0: 
//                vehicle = new Car();
//                break;
//            case 1:
//                vehicle = new Truck();
//                break;
//            case 2:
//                vehicle = new MotorBike();
//                break;
//            default:
//                vehicle = new Car();
//        }
        
        return vehicle;
    }
}
