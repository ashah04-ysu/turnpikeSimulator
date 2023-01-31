package turnpikesimulator;

public abstract class Vehicle {
    private int height;
    private int axleCount;
    
    protected void setHeight(int height) {
        this.height = height;
    }
    
    protected void setAxleCount(int count) {
        this.axleCount = count;
    }
    
    public int getHeight() {
        return height;
    }
    
    public int getAxleCount() {
        return axleCount;
    }
}
