package ud5.E0710;

class Train {

    public static Machinist machinist;
    public static Engine engine;
    public static int maxVagons = 5;
    
    public static Vagon[] vagonsArr;


    public Train(Machinist machinist, Engine engine, int maxVagons){
        this.machinist = machinist;
        this.engine = engine;
        this.maxVagons = maxVagons;
    }


    public void addVagons(Vagon[] VagonArr){
        System.out.println();
        this.vagonsArr = vagonsArr.clone();
    }


    @Override
    public String toString() {

        String vagonsInfo = "";

        for (Vagon vagon : vagonsArr) {
            vagonsInfo+= vagon.toString();
        }

        return String.format("Engine: %s\nMax Vagons: %d\nVagons Info: %s",engine.toString(),maxVagons,vagonsArr,vagonsInfo);
    }


}
