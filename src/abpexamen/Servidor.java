package ud5.abpexamen;

import java.util.Arrays;
import java.util.Comparator;

public class Servidor extends Host {
    
    // Tu código aquí
    public Servicio[] servicios = new Servicio[0];


    class Servicio {

        String sName;
        int port;
        String protocol;

        public Servicio(String sName, int port, String protocol){
            if (!validatePort(port)){
                throw new IllegalArgumentException("Puerto invalido");
            }
            if (!validateProtocol(protocol)){
                throw new IllegalArgumentException("Puerto invalido");
            }
            this.sName = sName;
            this.port = port;
            this.protocol = protocol;
        }

        public boolean validatePort(int port){
            if (port>1 && port < 65535){
                return true;
            }
            else{
                return false;
            }
            
        }

        public boolean validateProtocol(String protocol){
            switch (protocol) {
                case "TCP":
                    return true;
                case "UDP":
                    return true;
                default:
                    return false;
            }
            
        }

        @Override
        public boolean equals(Object obj) {
            Servicio s = (Servicio)obj;
            if (port == s.port && protocol.equals(s.protocol) )
                return true;
            return false;
        }
    }
    
    
    public Servidor(String nombre, String ip, String mac){
        super(nombre, ip, mac);

    }

    // No puede ofrecer un servicio si ya existe otro servicio con el mismo puerto y protocolo
    public void addServicio(String sName, int port, String protocol ){
        Servicio s = new Servicio(sName, port, protocol);

        for (Servicio servicio : servicios) {
            if (servicio.equals(s)){
                throw new IllegalArgumentException("No se pueden añadir dos servicios por el mismo puerto y con el mismo protocolo");
            }
        }

        servicios = Arrays.copyOf(servicios, servicios.length+1);
        servicios[servicios.length-1] = s;
    }


    @SuppressWarnings("unchecked")
    static Servidor[] sortByNumServices(Servidor[] arr) {
        Servidor[] sorted = arr.clone();
        Arrays.sort(sorted, new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                Servidor s1 = (Servidor)o1;
                Servidor s2 = (Servidor)o2;
                return Integer.compare(s1.servicios.length,s2.servicios.length);
            }
        });
        return sorted;
    }


    @Override
    public String toString() {
        String msg = String.format("\n%s (%s)",nombre,ip);

        for (int i = 0; i < servicios.length; i++) {
            Servicio s = servicios[i];
            msg = String.format("%s\n* %s (%s/%s)",msg,s.sName,s.port,s.protocol);
        }
        return msg;
    }



    public static void main(String[] args) {
        System.out.println("\nClase Servidor");
        System.out.println("==============\n");
        Servidor s1 = new Servidor("dam1", "192.168.0.117", "CC-11-22-33-44-AA");
        s1.addServicio("MySQL", 3306, "TCP");
        Servidor s2 = new Servidor("seixo", "192.168.0.11", "BB:11:22:33:44:55");
        s2.addServicio("HTTP", 80, "TCP");
        s2.addServicio("Proxy", 3128, "TCP");
        Servidor s3 = new Servidor("lapaman", "192.168.0.9", "AA:11:22:33:44:55");
        s3.addServicio("HTTP", 80, "TCP");
        //s3.addServicio("Web", 80, "TCP");
        s3.addServicio("DNS", 53, "UDP");
        s3.addServicio("FTP", 21, "TCP");
        s3.addServicio("SSH", 22, "TCP");        

        Servidor[] servidores = { s1, s2, s3 };
        /*
        for (Servidor s : servidores) {
            System.out.println(s);
        }
             */

        Servidor[] sortedServidores = sortByNumServices(servidores);

        for (Servidor s : sortedServidores) {
            System.out.println(s);
        }

    }

}

