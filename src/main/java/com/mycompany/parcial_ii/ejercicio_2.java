package com.mycompany.parcial_ii;

import java.util.Scanner;

/**
 *
 * @author Jonatan
 */
public class ejercicio_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc;
        do{
            System.out.println("+++++++++++++ Calculadora de Matrices +++++++++++++++");
            System.out.println("1. 5a + 3b");
            System.out.println("2. a + b");
            System.out.println("3. 2a - 2b");
            System.out.println("4. Salir");
            opc = sc.nextInt();
            switch (opc) {
                case 1: {
                    System.out.println("5a + 3b");
                    opcion1();
                    break;
                }
                case 2: {
                    System.out.println("Opción 2: a + b");
                    opcion2();
                    break;
                }
                case 3: {
                    System.out.println("Opción 3: 2a - 2b");
                    opcion3();
                    break;
                }
                case 4: {
                    System.out.println("Saliendo...");
                    break;
                }
                default: {
                    System.out.println("Opcion no valida (syntax error)");
                }
            }
        } while (opc != 4);
    }

    public static void opcion1() {
        Scanner sc = new Scanner(System.in);
        int[][] A = new int[3][1];
        int[][] B = new int[3][1];
        int[][] R = new int[3][1];
        int i, j;

        System.out.println("Ingrese valores de la Matriz A:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 1; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Ingrese valores de la Matriz B:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 1; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        System.out.println("Resultado de 2A + 3B:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 1; j++) {
                R[i][j] = - 5 * A[i][j] + 3 * B[i][j];
                System.out.print("|" + R[i][j] + "|\t");
            }
            System.out.println();
        } 
    }

    public static void opcion2() {
        Scanner sc = new Scanner(System.in);
        int[][] A = new int[3][1];
        int[][] B = new int[3][1];
        int[][] R = new int[3][1];
        int i, j;

        System.out.println("Ingrese valores de la Matriz A:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 1; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Ingrese valores de la Matriz B:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 1; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        System.out.println("Resultado de A + B:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 1; j++) {
                R[i][j] = A[i][j] + B[i][j];
                System.out.print("|" + R[i][j] + "|\t");
            }
            System.out.println();
        } 
    }

    public static void opcion3() {
        Scanner sc = new Scanner(System.in);
        int[][] A = new int[3][1];
        int[][] B = new int[3][1];
        int[][] R = new int[3][1];
        int i, j;

        System.out.println("Ingrese valores de la Matriz A:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 1; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Ingrese valores de la Matriz B:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 1; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        System.out.println("Resultado de 2A - 2B:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 1; j++) {
                R[i][j] = 2 * A[i][j] - 2 * B[i][j];
                System.out.print("|" + R[i][j] + "|\t");
            }
            System.out.println();
        } 
    }
}


    