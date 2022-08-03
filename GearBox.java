import java.util.ArrayList;

public class GearBox {
    private ArrayList<Gear> gears;
    private int maxGear;
    private int currentGear = 0;
    private boolean clutchIn;

    public GearBox(int maxGear){
        this.maxGear = maxGear;
        this.gears = new ArrayList<>();
        Gear neutral = new Gear(0,0.0);
        gears.add(neutral);

        for (int i = 0; i < maxGear; i++) {
            addGear(i, i * 5.3);
        };

    }

    public void operateClutch(boolean in){
        this.clutchIn = in;
    }

    public boolean addGear (int newGear , double ratio){
        if (clutchIn && newGear <= maxGear) {
            gears.add(new Gear(newGear, ratio));
            return true;
        } 
        return false;
        
    }

    public boolean changeGear(int newGear){
        if ((clutchIn) && (newGear >= 0) && (newGear < this.gears.size())) {
            this.currentGear = newGear;
            System.out.println("Gear " + newGear + " selected");
            return true;
        } 
        System.out.println("Grind!!!!");
        this.currentGear = 0;
        return false;
    }

    public double wheelSpeed(int revs){
        if (clutchIn) {
            System.out.println("Scream!!!!!");
            return 0.0;
        }
        return revs * gears.get(currentGear).getRatio();
    }

    // inner class
    private class Gear{
        private int gearNumber;
        private double ratio;

        public double getRatio() {
            return ratio;
        }

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double drivingSpeed(int revs){
            return revs * ratio;
        }
    }
}
