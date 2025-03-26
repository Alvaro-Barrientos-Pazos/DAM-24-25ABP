package ud5.abpexamen;

import java.util.Arrays;

public class Host implements Comparable {

    // Tu código aquí
    public String nombre;
    public String ip;
    public String mac;

    public String maskIp = "255.255.0.0";
    public String gateway = "192.168.0.11";
    public String dns = "192.168.0.9";


    public Host(String nombre, String ip, String mac){
        if (nombre.isEmpty()){
            throw new IllegalArgumentException("El nombre del host está vacío");
        }

        if (ip != null) {
            if (!validarIP(ip)){
                throw new IllegalArgumentException("La ip del host no es valida");
            }
        }

        if (!validarMAC(mac)){
            throw new IllegalArgumentException("La MAC del host no es valida");
        }

        this.nombre = nombre;
        this.ip = ip;
        this.mac = mac;
    }


    boolean validarIP(String ip) {
        return ip.matches("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}");
    }

    boolean validarMAC(String mac) {
        return mac.matches("([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})");
    }

    @Override
    public String toString() {
        return String.format("%s (%s / %s)", nombre, ip, mac);
    }

    @Override
    public boolean equals(Object o) {
        Host h = (Host)o;
        char c = mac.charAt(2);
        String[]arrSplit1 = mac.split(String.valueOf(c));
        c = h.mac.charAt(2);
        String[]arrSplit2 = h.mac.split(String.valueOf(c));

        boolean isEqual = true;

        for (int i = 0; i < arrSplit1.length; i++) {
            if(arrSplit1[i].equals(arrSplit2[i])){
                isEqual = isEqual && true;
            }
            else{
                isEqual = isEqual && false;
            }
            
        }

        return isEqual;
    }

    @Override
    public int compareTo(Object o) {
        Host h = (Host)o;
        return nombre.compareTo(h.nombre);
    }


    public static void main(String[] args) {
        System.out.println("\nClase Host");
        System.out.println("==========\n");
        Host h100 = new Host("host100", "192.168.117.100", "00:11:22:33:44:55");
        Host h101 = new Host("equipo101", "192.168.117.101", "00:11:22:33:44:55");
        Host h102 = new Host("nodo100", "192.168.117.100", "00-11-22-33-44-AA");
        Host h103 = new Host("host103", "192.168.117.103", "00-11-22-33-44-55");

        Host[] hosts = { h100, h101, h102, h103};
        Arrays.sort(hosts);
        for (Host h : hosts) {
            System.out.println(h);
        }
        System.out.println(h100.nombre + " = " + h101.nombre + "? " + h100.equals(h101)); // true
        System.out.println(h100.nombre + " = " + h102.nombre + "? " + h100.equals(h102)); // false
        System.out.println(h100.nombre + " = " + h103.nombre + "? " + h100.equals(h103)); // true
    }
}
