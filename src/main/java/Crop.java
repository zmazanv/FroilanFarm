abstract public class Crop implements Produce {
    private boolean hasBeenHarvested;
    private boolean hasBeenFertilized;

    public Crop() {
        this.hasBeenHarvested = false;
        this.hasBeenFertilized = false;
    }

    public boolean hasBeenHarvested() {
        return hasBeenHarvested;
    }

    public boolean hasBeenFertilized() {
        return hasBeenFertilized;
    }

    public void setHasBeenHarvested(boolean harvested) {
        this.hasBeenHarvested = harvested;
    }

    public void setHasBeenFertilized(boolean fertilized) {
        this.hasBeenFertilized = fertilized;
    }

}
