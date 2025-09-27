package com.mycompany.parcial_ii;

import java.util.Scanner;

/**
 *
 * @author Jonatan
 */
public class Parcial_II {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc;
        do{
            System.out.println("+++++++++++++ Calculadora de Matrices +++++++++++++++");
            System.out.println("1. 2a + 3b");
            System.out.println("2. a - b");
            System.out.println("3. 4a - 3b");
            System.out.println("4. Salir");
            opc = sc.nextInt();
            switch (opc) {
                case 1: {
                    System.out.println("2a + 3b");
                    opcion1();
                    break;
                }
                case 2: {
                    System.out.println("Opción 2: a + b + c");
                    opcion2();
                    break;
                }
                case 3: {
                    System.out.println("Opción 3: a - b");
                    opcion3();
                    break;
                }
                case 4: {
                    System.out.println("Saliendo......");
                    break;
                }
                default: {
                    System.out.println("Opcion no valida (syntax error)");
                }
            }
        }while (opc !=5);     
    }
    public static void opcion1() {
        Scanner sc = new Scanner(System.in);
        int[][] A = new int[2][3];
        int[][] B = new int[2][3];
        int[][] R = new int[2][3];
        int i, j;

        System.out.println("Ingrese valores de la Matriz A:");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 3; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Ingrese valores de la Matriz B:");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 3; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        System.out.println("Resultado de 2A + 3B:");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 3; j++) {
                R[i][j] = 2 * A[i][j] + 3 * B[i][j];
                System.out.print("|" + R[i][j] + "|\t");
            }
            System.out.println();
        } 
    }
    public static void opcion2() {
        Scanner sc = new Scanner(System.in);
        int[][] A = new int[2][3];
        int[][] B = new int[2][3];
        int[][] R = new int[2][3];
        int i, j;

        System.out.println("Ingrese valores de la Matriz A:");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 3; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Ingrese valores de la Matriz B:");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 3; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        System.out.println("Resultado de A - B:");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 3; j++) {
                R[i][j] = A[i][j] - B[i][j];
                System.out.print("|" + R[i][j] + "|\t");
            }
            System.out.println();
        } 
    }
    public static void opcion3() {
        Scanner sc = new Scanner(System.in);
        int[][] A = new int[2][3];
        int[][] B = new int[2][3];
        int[][] R = new int[2][3];
        int i, j;

        System.out.println("Ingrese valores de la Matriz A:");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 3; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Ingrese valores de la Matriz B:");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 3; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        System.out.println("Resultado de 4A - 3B:");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 3; j++) {
                R[i][j] = 4 * A[i][j] - 3 * B[i][j];
                System.out.print("|" + R[i][j] + "|\t");
            }
            System.out.println();
        } 
    }
}
