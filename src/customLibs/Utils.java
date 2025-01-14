package customLibs;

import java.util.Scanner;
import java.util.InputMismatchException;


public class Utils {

    static enum OS{
        WINDOWS,
        LINUX_MAC,
        OTHERS;
    }

    public static Scanner scanner = new Scanner(System.in);

    private static OS systemOS;


    public static int inputInt(){
        int input = -1;
        
        System.out.print("\nOpción: ");
        try {
            input = scanner.nextInt();
            scanner.nextLine();
            
        }
        catch (InputMismatchException e) {
            scanner.nextLine();
        }

        return input;
    }

    public static int inputInt(boolean optionFlag){
        int input = -1;
        
        if (optionFlag){
            System.out.print("\nOpción: ");
        }

        try {
            input = scanner.nextInt();
            scanner.nextLine();
        }
        catch (InputMismatchException e) {
            e.printStackTrace();
        }

        return input;
    }

    public static void awaitUserToContinue(){
        System.out.print("Pulse \"Enter\" para continuar...");
        String buffer = scanner.nextLine();
    }

    public static void getHardwareOS(){
        String operatingSystem = System.getProperty("os.name").toLowerCase();

        if (operatingSystem.contains("win")) {
            systemOS = OS.WINDOWS;
        } 
        else if (operatingSystem.contains("nix") || operatingSystem.contains("nux") || operatingSystem.contains("mac")) {
            systemOS = OS.LINUX_MAC;
        } 
        else {
            systemOS = OS.OTHERS;
        }

    }

    public static void clearScreen() {
        
        try{
            switch (systemOS) {
                case OS.WINDOWS:
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    break;

                case OS.LINUX_MAC:
                    new ProcessBuilder("clear").inheritIO().start().waitFor();
                    break;

                case OS.OTHERS:
                    System.out.print("\n\n\n\n");
                    break;

                default:
                    break;
            }
        } 
        catch (Exception e) {
            printStackTrace(e);
        }
    }

    public static void warning(String msg){
        clearScreen();
        System.out.println(msg);
        awaitUserToContinue();
    }

    public static void printStackTrace(Exception e){
        e.printStackTrace();
        awaitUserToContinue();
    }

}