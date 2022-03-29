package com.company;

public class Main {

    public static void main(String[] args) {
	    int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (int j = 10; j > 0; j--) {
            System.out.print(j + " ");
        }
        System.out.println();


        int friday = 3;
        while (friday < 32) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчёт.");
            friday += 7;
        }


        int currentYear = 2021, past = currentYear - 200, future = currentYear + 100;
        while (past <= currentYear) {
            System.out.println(79 - (past % 79) + past);
            past += 79;
        }
    }
}
