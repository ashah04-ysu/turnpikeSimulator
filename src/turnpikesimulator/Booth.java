package turnpikesimulator;

import java.util.LinkedList;
import java.util.Queue;

public class Booth {
    private Queue<Vehicle> queue;
    private int axlePrice;
    private int heightPrice;
    
    public Booth(int heightPrice, int axlePrice) {
        this.queue = new LinkedList<>();
        this.axlePrice = axlePrice;
        this.heightPrice = heightPrice;
    }
    
    public void add(Vehicle vehicle) {
        this.queue.add(vehicle);
    }
    
    public void collect() {
        Vehicle vehicle = this.queue.remove();
        int price = vehicle.getAxleCount() * axlePrice;
        price += vehicle.getHeight() * heightPrice;
        System.out.println("Vehicle Charged: " + price);
    }
    
    public boolean isEmpty() {
        return this.queue.isEmpty();
    }
}
