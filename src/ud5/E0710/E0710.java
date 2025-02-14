package ud5.E0710;

public class E0710 {
    public static void main(String[] args) {
        

        Machinist t1Machanist = new Machinist("Pepe López");

        Vagon t1Vagon1 = new Vagon(1, 450000, 400000, Vagon.LOAD_TYPE.WOOD);
        Vagon t1Vagon2 = new Vagon(2, 450000, 400000, Vagon.LOAD_TYPE.IRON);
        Vagon t1Vagon3 = new Vagon(3, 45000, 4000, Vagon.LOAD_TYPE.PASSANGERS);

        Mechanic t1Mechanic = new Mechanic("Marta Pérez", Mechanic.ESPECIALITIES.ENGINE);
        Train t1 = new Train( t1Machanist, new Engine(t1Mechanic, 2000), 3);

        Vagon[] VagonsArr = new Vagon[]{t1Vagon1,t1Vagon2,t1Vagon3};

        t1.addVagons(VagonsArr);
        
        System.out.println(t1.toString());

    }
}
