package practicas;

import java.util.Arrays;

public class RecorridoRobot {

    static char[][] wMap;
    static int[] coords;

    public static void main(String[] args) {
        String[] mapa = {
                "Z  ",
                "*  ",
                "** ",
                "   ",
                "A  "
        };

        // System.out.println(recorridoRobot(mapa,"ARAALAAALAA"));
        System.out.println(recorridoRobot(mapa, "ARAALAAALAA"));

    }

    static void mapToMultiArr(String[] mapa) {
        wMap = new char[mapa.length][mapa[0].length()];

        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[0].length(); j++) {
                wMap[i][j] = mapa[i].charAt(j);
                if (wMap[i][j] == 'A') {
                    coords = new int[] { i, j };
                }
                System.out.print(mapa[i].charAt(j) + " ");
            }
            System.out.println();
        }
    }

    static boolean printUpdatedMap(char[][] wMap) {

        if (coords[0] >= wMap.length) {
            return false;
        }
        if (coords[1] >= wMap.length) {
            return false;
        }

        for (int i = 0; i < wMap.length; i++) {
            for (int j = 0; j < wMap[i].length; j++) {
                if (wMap[i][j] == 'A') {
                    wMap[i][j] = ' ';
                }

                if (i == coords[0] && j == coords[1]) {
                    if (wMap[i][j] == ' ') {
                        wMap[i][j] = 'A';
                    }
                }

                System.out.print(wMap[i][j] + " ");
            }

            System.out.println();
        }

        return true;
    }

    static boolean recorridoRobot(String[] mapa, String instrucciones) {

        mapToMultiArr(mapa);
        System.out.println();
        System.out.println();

        String[] dir = new String[] { "arriba", "derecha", "abajo", "izquierda" };

        int currDir = 0;

        System.out.println(Arrays.toString(coords));

        for (int i = 0; i < instrucciones.length(); i++) {

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

                    System.out.println(Arrays.toString(coords)+"\n");
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

                case 'R':
                    currDir = (currDir + 1) % dir.length;
                    break;

                case 'L':
                    currDir = currDir - 1 < 0 ? dir.length - 1 : (currDir - 1) % dir.length;
                    break;

                default:
                    break;
            }
        }

        return false;
    }


    static int[] findRobotCood(String[] map) {

        for (int i = 0; i < map.length; i++) {
            for (int k = 0; k < map[i].length(); k++) {
                if (map[i].charAt(k) == 'A') {
                    return new int[] { i, k };
                }
            }
        }
        return null;
    }


    static int checkMapCoord(char[][] wMap) {

        if (wMap.length >= coords[0])
            return -1;

        if (wMap[0].length >= coords[1])
            return -1;

        System.out.println("------------------------------------");

        for (int i = 0; i < wMap.length; i++) {
            for (int j = 0; j < wMap[i].length; j++) {
                switch (wMap[i][j]) {
                    case '*':
                        return 0;

                    case 'Z':
                        return 2;

                    default:
                        break;
                }
            }
        }
        return 1;
    }

}
