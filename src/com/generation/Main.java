package com.generation;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un numero del 1 al 7");

//        System.out.println("Elige un dia de la semana \n1) Lunes \n2) Martes" +
//               "\n3) Miercoles \n4) Jueves \n5 Viernes \n6 Sabado \n7 Domingo");
        int num = sc.nextInt();
        sc.nextLine();

        switch (num){
            case 1:
                num = 1;
                System.out.println("Es Lunes");
                break;
            case 2:
                num = 2;
                System.out.println("Es Martes");
                break;
            case 3:
                num = 3;
                System.out.println("Es Miercoles");
                break;
            case 4:
                num = 4;
                System.out.println("Es Jueves");
                break;
            case 5:
                num = 5;
                System.out.println("Es Viernes");
                break;
            case 6:
                num = 6;
                System.out.println("Es Sabado");
                break;
            case 7:
                num = 7;
                System.out.println("Es Domingo");
                break;

            default: System.out.println("Sigue las Instrucciones");
                break;
        }
        sc.close();
        





    }
}
