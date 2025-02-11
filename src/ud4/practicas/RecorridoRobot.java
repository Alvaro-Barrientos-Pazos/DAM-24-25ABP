package practicas;

import java.util.Arrays;

public class RecorridoRobot {

    static char[][] wMap;
    static int[] coords;  // [0] = Y   [1] = X
    
    static int turn = 1;  // Solo para la visualizacion

    public static void main(String[] args) {
        String[] mapa = {
            "  Z       ",  // 0
            " *        ",  // 1
            "  *  *    ",  // 2
            "          ",  // 3
            " A        "   // 4
           //0123456789
        };



        System.out.println(recorridoRobot(mapa, "AALARAARAA"));                             // Llegas a la meta
        //System.out.println(recorridoRobot(mapa, "AALARAALLAAAALAAAAAAAAALAAAALAAAAAA"));    // Llegas a la meta
        
        //System.out.println(recorridoRobot(mapa, "RAAALAALARA"));                            // No llegas a la meta
        //System.out.println(recorridoRobot(mapa, "RALAA"));                                  // Mina
        //System.out.println(recorridoRobot(mapa, "AALARAAAAAAA"));                           // Sales del mapa por arriba

    }

    static void mapToMultiArr(String[] mapa) {
        wMap = new char[mapa.length][mapa[0].length()];

        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[0].length(); j++) {
                wMap[i][j] = mapa[i].charAt(j);
                if (wMap[i][j] == 'A') {
                    coords = new int[] { i, j };
                }
                System.out.print(mapa[i].charAt(j));
            }
            System.out.println();
        }
    }

    static boolean recorridoRobot(String[] mapa, String instrucciones) {

        mapToMultiArr(mapa);
        System.out.println();
        System.out.println();


        // Mejor crear un enumerador
        // dir[0] -> arriba

        String[] dir = new String[] { "arriba", "derecha", "abajo", "izquierda" };
        int currDir = 0;

        for (int i = 0; i < instrucciones.length(); i++) {

            System.out.println("\n\nInstruccion: "+instrucciones.charAt(i));
            switch (instrucciones.charAt(i)) {
                case 'A':
                    switch (dir[currDir]) {
                        case "arriba":
                            coords[0] -= 1;
                            break;
                        case "derecha":
                            coords[1] += 1;
                            break;
                        case "abajo":
                            coords[0] += 1;
                            break;
                        case "izquierda":
                            coords[1] -= 1;
                            break;
                    }

                    printUpdatedMap(wMap);

                    switch (checkMapCoord(wMap)) {

                        case 0:
                            System.out.println("Has explotado una mina");
                            return false;

                        case 1:
                            if (i == instrucciones.length() - 1) {
                                System.out.println("No has llegado a la meta");
                                return false;
                            }
                            break;

                        case 2:
                            if (i == instrucciones.length() - 1) {
                                System.out.println("Has llegado a la meta!!");
                                return true;
                            }
                            break;

                        default:
                            System.out.println("Has salido del mapa");
                            return false;
                    }
                    break;




                // int x = 0
                //  dir { "arriba", "derecha", "abajo", "izquierda" }

                // currDir = "izquierda" -> 1
                /*
                 
                    if (curDir +1 >= dir.length )
                        curDir = 0;

                 */

                case 'R':
                    currDir = (currDir + 1) % dir.length;
                    break;

                case 'L':
                    currDir = currDir - 1 < 0 ? dir.length - 1 : currDir - 1;
                    break;

                default:
                    break;
            }
        }

        return false;
    }


    static int checkMapCoord(char[][] wMap) {

        int posY = coords[0];
        int posX = coords[1];

        if (posY <0 || posX <0)
            return -1;

        if (posY >= wMap.length || posX >= wMap[0].length)
            return -1;


        switch (wMap[posY][posX]) {
            case '*':
                return 0;

            case 'Z':
                return 2;

            default:
                break;
        }

        return 1;
    }

    // Solo se usa para visualizar
    static boolean printUpdatedMap(char[][] wMap) {

        System.out.printf("Turn %d\nCoords: %s\n",turn,Arrays.toString(coords));
        turn++;

        for (int i = 0; i < wMap.length; i++) {
            for (int j = 0; j < wMap[i].length; j++) {
                if(j==0){
                    System.out.print("|");
                }

                if (wMap[i][j] == 'A') {
                    wMap[i][j] = ' ';
                }

                if (i == coords[0] && j == coords[1]) {
                    if (wMap[i][j] == ' ') {
                        wMap[i][j] = 'A';
                    }
                }

                System.out.print(wMap[i][j]);
            }
            System.out.print("|\n");

        }

        return true;
    }

}
