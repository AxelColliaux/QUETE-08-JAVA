public class Eagle extends Bird implements Fly{

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public String takeOff(){
        this.flying = true;
        return this.getName()+" takes off in the sky.";
    }

    @Override
    public String ascend(int altitude){
        this.altitude += altitude;
        return this.getName()+" flies upward, altitude: "+this.altitude;
    }

    @Override
    public String descend(int altitude){
        this.altitude -= altitude;
        return this.getName()+" flies downward, altitude: "+this.altitude;
    }

    @Override
    public String glide(){
        return "It glides into the air.";
    }

    @Override
    public String land(){
        if(this.altitude == 1){
            this.flying = false;
            return this.getName() + " lands on the ground.";
        } else {
            return this.getName() + " is too high, it can't lands.";
        }
    }
}
