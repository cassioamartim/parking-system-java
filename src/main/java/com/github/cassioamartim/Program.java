package com.github.cassioamartim;

import com.github.cassioamartim.entity.Car;
import com.github.cassioamartim.entity.Parking;

public class Program {

    public static void main(String[] args) {
        Car prisma = new Car("Prisma", "09JK-293D", "Vermelho");
        Car ferrari = new Car("Ferrari", "192N-KGJD", "Preto");
        Car lamborghini = new Car("Lamborghini", "MNKE-239K", "Branco");

        Parking.addCars(prisma, ferrari, lamborghini);
        Parking.printCars();

        System.out.println("Total de carros estacionados: " + Parking.getTotalParkedCars());
    }
}
