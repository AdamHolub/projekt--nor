package com.company;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vyska;
        int neco = 0;
        int q;
        int pomocne;

        for (int m = 0; m > -1; m++) {
            System.out.println("Výběr: ");
            System.out.println("pyramida - 1");
            System.out.println("schody - 2");
            System.out.println("šachovnice - 3");
            System.out.println("obdelník - 4");
            System.out.println("ukončit - 5");

            int first = scanner.nextInt();

            if (first == 1) {
                System.out.println("Zadejte výšku pyramidy");

                vyska = scanner.nextInt();
                pomocne = vyska;
                for (int x = 1; x <= vyska; x++) {
                    System.out.println("");
                    for (q = 0; q < pomocne; q++) {
                        System.out.print(" ");
                    }
                    pomocne--;
                    for (int v = 0; v < x + neco; v++) {
                        System.out.print(Math.min(x, 9));
                    }
                    neco += 1;
                }
                neco = 0;
                System.out.println("");
                System.out.println("");
            }
            else if (first == 2) {
                System.out.println("Zadejte výšku schodů");

                int vyskadve = scanner.nextInt();
                int pomocnedve = vyskadve;
                int pomocnetri = vyskadve;
                for (int x = 0; x < vyskadve + 1; x++) {
                    System.out.println("");
                    for (int v = pomocnetri; v > 0; v--) {
                        System.out.print(" ");
                    }
                    pomocnetri--;
                    for (int c = 0; c < x; c++) {
                        if (pomocnedve % 2 == 0) {
                            System.out.print(2);
                        } else {
                            System.out.print(1);
                        }
                    }
                    pomocnedve--;
                }
                System.out.println("");
                System.out.println("");
            }
            else if (first == 3) {
                System.out.println("Šachovnice: ");
                System.out.println("");
                System.out.println("");
                for (int k = 8; k > 0; k--) {
                    if (k % 2 == 0) {
                        for (int h = 4; h > 0; h--) {
                            System.out.print("XO");
                        }
                    } else {
                        for (int g = 4; g > 0; g--) {
                            System.out.print("OX");
                        }
                    }
                    System.out.println("");
                }
                System.out.println("");
                System.out.println("");
            } else if (first == 4) {
                System.out.println("Zadejte prostřední číslo obdelníku");
                int prostredek = scanner.nextInt();
                System.out.println("Zadejte šířku obdelníku");
                int sirka = scanner.nextInt();

                for (int g = 1; g <= prostredek; g++) {
                    for (int l = 0; l < sirka; l++) {
                        System.out.print(g);
                    }
                    System.out.println();
                }
                for (int b = prostredek - 1; b >= 1; b--) {
                    for (int i = 0; i < sirka; i++) {
                        System.out.print(b);
                    }
                    System.out.println();
                }
            }
            else if (first == 5) {
                break;
            }
            else{
                System.out.println("Error 404");
            }
        }
    }
}
