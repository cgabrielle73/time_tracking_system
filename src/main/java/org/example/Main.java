package org.example;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o dia que você começou a task X: (dd/MM/yyyy)");
        String startDate = sc.next();
        System.out.println("Digite o horário que você começou a task X: (dd/MM/yyyy)");
        String startTime = sc.next();

        String starterDate = startDate + " " + startTime;
        DateTimeFormatter starterFormater = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime starter = LocalDateTime.parse(starterDate, starterFormater);

        System.out.println("Digite o dia que você terminou a task X: (dd/MM/yyyy HH:mm)");
        String endDate = sc.next();
        System.out.println("Digite o horário que você terminou a task X: (dd/MM/yyyy HH:mm)");
        String endTime = sc.next();

        String finalTime = endDate + " " + endTime;

        DateTimeFormatter endFormater = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime end = LocalDateTime.parse(finalTime, endFormater);

        Duration duration = Duration.between(starter, end);

        System.out.println("duration: " + duration.toHours() + " horas");

    }
}