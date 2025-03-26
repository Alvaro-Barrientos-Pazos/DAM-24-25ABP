package ud5.abpexamen;

import java.util.Arrays;
import java.util.Comparator;

public class Cliente extends Host {

    // Tu código aquí
    enum SO {
        WINDOWS,
        LINUX,
        MAC,
        ANDROID,
        IOS
    }


    SO os;
    String resolution;


    public Cliente(String nombre, String ip, String mac, SO os, String resolution){
        super(nombre, ip, mac);
        this.os = os;
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        return String.format("%s (%s %s)",nombre,os.toString(),resolution);
    }

    @SuppressWarnings("unchecked")
    static Cliente[] sortByResolution(Cliente[] arr) {
        Cliente[] sorted = arr.clone();
        Arrays.sort(sorted, new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                Cliente c1 = (Cliente)o1;
                Cliente c2 = (Cliente)o2;
                
                String[] arr1 = c1.resolution.split("x");
                String[] arr2 = c2.resolution.split("x");

                Integer r1 = Integer.valueOf(arr1[0]) * Integer.valueOf(arr1[1]);
                Integer r2 = Integer.valueOf(arr2[0]) * Integer.valueOf(arr2[1]);
                return r2.compareTo(r1);
            }
        });
        return sorted;
    }

    @SuppressWarnings("unchecked")
    static Cliente[] sortByAlphabetic(Cliente[] arr) {
        Cliente[] sorted = arr.clone();
        Arrays.sort(sorted, new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                String os1 = ((Cliente)o1).os.toString();
                String os2 = ((Cliente)o2).os.toString();

                return os1.compareTo(os2);
            }
        });
        return sorted;
    }


    public static void main(String[] args) {

        System.out.println("\nClase Cliente");
        System.out.println("=============\n");        
        Cliente cWin1 = new Cliente("Cliente1", "192.168.1.2", "02:1A:2B:3C:4D:5E", SO.WINDOWS, "1920x1080");
        Cliente cLin2 = new Cliente("Cliente2", "192.168.1.3", "01:1A:2B:3C:4D:5F", SO.LINUX, "1366x768");
        Cliente cMac3 = new Cliente("Cliente3", "192.168.1.4", "04:1A:2B:3C:4D:60", SO.MAC, "2560x1440");
        Cliente cAnd4 = new Cliente("Cliente4", "192.168.1.5", "03:1A:2B:3C:4D:61", SO.ANDROID, "1080x2340");
        Cliente cIos5 = new Cliente("Cliente5", "192.168.1.6", "05:1A:2B:3C:4D:62", SO.IOS, "1170x2532");

        Cliente[] clientes = { cWin1, cLin2, cMac3, cAnd4, cIos5 };
        //Arrays.sort(clientes);

        /*
        for (Cliente c : clientes) {
            System.out.println(c);
        }
        */

        // Ordenados por OS
        Cliente[] sortedClientesOS = sortByAlphabetic(clientes);

        for (Cliente c : sortedClientesOS) {
            System.out.println(c);
        }

        // Ordenados por Resolucion
        Cliente[] sortedClientesResol = sortByResolution(clientes);

        for (Cliente c : sortedClientesResol) {
            System.out.println(c);
        }

    }


    
}
