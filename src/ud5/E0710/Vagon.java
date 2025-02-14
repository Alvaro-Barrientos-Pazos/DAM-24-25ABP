package ud5.E0710;

class Vagon
 {

    public static enum LOAD_TYPE {
        WOOD,
        IRON,
        PASSANGERS,
    }

    public static int id;
    public static int maxWeigth;
    public static int currWeigth;
    public static LOAD_TYPE loadType;


    public Vagon(int id, int maxWeigth, int currWeigth, LOAD_TYPE loadType) {
        System.out.println();
        this.id = id;
        this.maxWeigth = maxWeigth;
        this.currWeigth = currWeigth;
        this.loadType = loadType;
    }


    public static int getId() {
        return id;
    }
    public static int getMaxWeigth() {
        return maxWeigth;
    }
    public static int getCurrWeigth() {
        return currWeigth;
    }
    public static LOAD_TYPE getLoadType() {
        return loadType;
    }


    @Override
    public String toString() {
        return String.format("id: %d\nMax Weigth: %d\nCurr Weigth: %d\nLoad Type: %d",id,maxWeigth,currWeigth,loadType);
    }


}
