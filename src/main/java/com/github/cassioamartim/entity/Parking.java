package com.github.cassioamartim.entity;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter
public class Parking {
    private static final List<Car> parkedCars = new ArrayList<>();

    public static void addCars(Car... cars) {
        parkedCars.addAll(Arrays.asList(cars));
    }

    public static void removeCar(String board) {
        parkedCars.removeIf(car -> car.getBoard().equalsIgnoreCase(board));
    }

    public static int getTotalParkedCars() {
        return parkedCars.size();
    }

    public static void printCars() {
        System.out.println();

        for (Car car : parkedCars) {
            System.out.println("> Nome: " + car.getName());
            System.out.println("> Placa: " + car.getBoard());
            System.out.println("> Cor: " + car.getColor());

            System.out.println();
        }
    }
}
