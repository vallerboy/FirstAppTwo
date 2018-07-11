public class MyWater {
    private final int BIG_BOTTLE = 2;
    private final int MEDIUM_BOTTLE = 1;
    private final double SMALL_BOTTLE = 0.5;

    private int bigBottleCount;
    private int mediumBottleCount;
    private int smallBottleCount;

    public MyWater() {
    }

    public void addBig(int howMany){
        bigBottleCount += howMany;
    }

    public void addMedium(int howMany){
        mediumBottleCount += howMany;
    }

    public void addSmall(int howMany){
        smallBottleCount += howMany;
    }

    public double getWaterCount(){
        return bigBottleCount * BIG_BOTTLE +
                mediumBottleCount * MEDIUM_BOTTLE +
                smallBottleCount * SMALL_BOTTLE;
    }

    public int getBIG_BOTTLE() {
        return BIG_BOTTLE;
    }

    public int getMEDIUM_BOTTLE() {
        return MEDIUM_BOTTLE;
    }

    public double getSMALL_BOTTLE() {
        return SMALL_BOTTLE;
    }

    public int getBigBottleCount() {
        return bigBottleCount;
    }

    public void setBigBottleCount(int bigBottleCount) {
        this.bigBottleCount = bigBottleCount;
    }

    public int getMediumBottleCount() {
        return mediumBottleCount;
    }

    public void setMediumBottleCount(int mediumBottleCount) {
        this.mediumBottleCount = mediumBottleCount;
    }

    public int getSmallBottleCount() {
        return smallBottleCount;
    }

    public void setSmallBottleCount(int smallBottleCount) {
        this.smallBottleCount = smallBottleCount;
    }
}


