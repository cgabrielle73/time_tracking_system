package org.example;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dia que você começou a task X: ");
        Integer starterDay = sc.nextInt();
        System.out.println("Digite mês que você começou a task X: ");
        Integer starterMonth = sc.nextInt();
        System.out.println("Digite ano que você começou a task X: ");
        Integer starterYear = sc.nextInt();
        System.out.println("Digite a hora que você começou a task X: ");
        Integer starterHour = sc.nextInt();
        System.out.println("Digite os minutos que você começou a task X: ");
        Integer starterMinute = sc.nextInt();

        String starterMoment = String.format("%02d/%02d/%d %02d:%02d", starterDay, starterMonth, starterYear, starterHour, starterMinute);

        DateTimeFormatter starterFormater = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime starter = LocalDateTime.parse(starterMoment, starterFormater);

        System.out.println("Digite dia que você terminou a task X: ");
        Integer endDay = sc.nextInt();
        System.out.println("Digite mês que você terminou a task X: ");
        Integer endMonth = sc.nextInt();
        System.out.println("Digite ano que você terminou a task X: ");
        Integer endYear = sc.nextInt();
        System.out.println("Digite a hora que você terminou a task X: ");
        Integer endHour = sc.nextInt();
        System.out.println("Digite os minutos que você terminou a task X: ");
        Integer endMinute = sc.nextInt();

        String endMoment = String.format("%02d/%02d/%d %02d:%02d", endDay, endMonth, endYear, endHour, endMinute);

        DateTimeFormatter endFormater = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime end = LocalDateTime.parse(endMoment, endFormater);

        Duration duration = Duration.between(starter, end);

        System.out.println("duration: " + duration.toHours() + " horas");

    }
}