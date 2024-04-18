package org.example;

public class Main {

    static void manufactureMachineGun(String modelName) {
        System.out.println("Производство пулемета: " + modelName);
    }

    static void sellMachineGun(String modelName, int quantity) {
        System.out.println("Продажа пулемета: " + modelName + ", количество: " + quantity);
    }

    static void calculateMaintenanceCost(String modelName) {
        System.out.println("Расчет затрат на обслуживание оружия: " + modelName);
    }

    void useHandgun(String modelName) {
        System.out.println("Использование пистолета: " + modelName);
    }

    void repairGun(String modelName) {
        System.out.println("Ремонт оружия: " + modelName);
    }

    void reloadGun(String modelName) {
        System.out.println("Перезарядка оружия: " + modelName);
    }

    static void manufactureCustomGun(String modelName) {
        System.out.println("Производство индивидуального оружия: " + modelName);
    }

    static void sellLeaseGun(String modelName, int quantity) {
        System.out.println("Продажа или аренда оружия: " + modelName + ", количество: " + quantity);
    }

    public static void main(String[] args) {
        manufactureMachineGun("M249");
        sellMachineGun("M249", 20);
        calculateMaintenanceCost("M249");

        Main main = new Main();
        main.useHandgun("Glock");
        main.repairGun("Glock");
        main.reloadGun("Glock");

        manufactureCustomGun("Custom Model");
        sellLeaseGun("Custom Model", 5);
    }
}
