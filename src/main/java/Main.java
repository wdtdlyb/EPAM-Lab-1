import Flowers.*;
import Accessories.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Flower> flowersInBouquet = new ArrayList<>();
        Services services = new Services();

        Flower flower0 = new Rose(120, 0,20);
        flowersInBouquet.add(flower0);
        Flower flower1 = new Lily(100, 2,25);
        flowersInBouquet.add(flower1);
        Flower flower2 = new Iris(90, 1,30);
        flowersInBouquet.add(flower2);
        Flower flower3 = new Rose(150, 2,26);
        flowersInBouquet.add(flower3);
        Flower flower4 = new Iris(52, 1,40);
        flowersInBouquet.add(flower4);

        List<Accessory> accessoriesInBouquet = new ArrayList<>();

        Accessory accessory1 = new Ribbon(2);
        accessoriesInBouquet.add(accessory1);
        Accessory accessory2 = new Wrap(5);
        accessoriesInBouquet.add(accessory2);

        System.out.println("\n***** Неотсортированный букет цветов *****");
        for(Flower f:flowersInBouquet){
            System.out.println(f.printBouquetInfo());
        }

        for (int n = 0; n < flowersInBouquet.size(); n++){
            if(flowersInBouquet.get(n).getFresh() == 0){
                Collections.swap(flowersInBouquet, n, 0);
            }
            if(flowersInBouquet.get(n).getFresh() == 0){
                Collections.swap(flowersInBouquet, n, 1);
            }
            if(flowersInBouquet.get(n).getFresh() == 2){
                Collections.swap(flowersInBouquet, n, flowersInBouquet.size() - 1);
            }
        }

        System.out.println("\n***** Аксессуары в букете *****");
        for(Accessory a:accessoriesInBouquet){
            System.out.println(a.printAccessoryInfo());
        }

        for(int i = 0; i < flowersInBouquet.size(); i++){
            services.sum += flowersInBouquet.get(i).getCost();
        }

        for(int i = 0; i < accessoriesInBouquet.size(); i++){
            services.sum += accessoriesInBouquet.get(i).getCost();
        }

        System.out.println("\nСтоимость букета равна " + services.sum);

        System.out.println("\n***** Отсортированный букет цветов *****");
        for(Flower f: flowersInBouquet){
            System.out.println(f.printBouquetInfo());
        }

        services.enterRange();

        System.out.println("\n***** Цветы из диапазона длины стебля *****");
        for (Flower flower : flowersInBouquet) {
            if (flower.getStalkLength() > services.getRangeStart() & flower.getStalkLength() < services.getRangeFinish()) {
                System.out.println(flower.printBouquetInfo());
            }
        }
    }
}
