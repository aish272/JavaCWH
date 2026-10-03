package com.oop;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Deliverable {
    String name;
    String type;
    double price;
    public Deliverable(String name, String type, double price)
    {
        this.name = name;
        this.type = type;
        this.price = price;
    }

}

abstract class Vehicle {
    RoutingStrategy routingStrategy;

    public String deliver(Deliverable deliverable) {
        return null;
    }

    public void setRoutingStrategy(RoutingStrategy routingStrategy) {
        this.routingStrategy = routingStrategy;
    }
}

class Car extends Vehicle {
    RoutingStrategy routingStrategy;

    public Car(RoutingStrategy routingStrategy) {
        this.routingStrategy = routingStrategy;
    }
    public String deliver(Deliverable deliverable) {
        return deliverable.name + " has been delivered using Car through ";
    }

}

class Truck extends Vehicle {
    public Truck(RoutingStrategy routingStrategy) {

    }
    public String deliver(Deliverable deliverable) {
        return deliverable.name + " has been delivered using Truck through ";
    }
}

class Plane extends Vehicle {
    public Plane(RoutingStrategy routingStrategy) {
        // Complete the missing code here
    }
    public String deliver(Deliverable deliverable) {
        return deliverable.name + " has been delivered using Plane through ";
    }
}

abstract class RoutingStrategy {

    public String getRouteStrategy()
    {
        return null;
    }

}

class RouteStrategy1 extends RoutingStrategy {

    public String getRouteStrategy()
    {
        return "RouteStrategy1";
    }

}

class RouteStrategy2 extends RoutingStrategy {

    public String getRouteStrategy()
    {
        return "RouteStrategy2";
    }

}

public class Solution {

    // Test/Driver method
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        RouteStrategy1 routeStrategy1 = new RouteStrategy1();
        RouteStrategy2 routeStrategy2 = new RouteStrategy2();

        if (routeStrategy1.getClass().getDeclaredMethods().length != 0) {
            bufferedReader.close();
            bufferedWriter.close();
            throw new RuntimeException("RoutingStrategy1 should not have any methods");
        }

        if (routeStrategy2.getClass().getDeclaredMethods().length != 0) {
            bufferedReader.close();
            bufferedWriter.close();
            throw new RuntimeException("RoutingStrategy2 should not have any methods");
        }

        int n;
        n = Integer.parseInt(bufferedReader.readLine().trim());
        for (int i = 0; i < n; i++) {
            String[] input = bufferedReader.readLine().trim().split(" ");
            Vehicle vehicle = null;
            // take strategy as input
            if (input[0].equals("Car")) {
                vehicle = new Car(routeStrategy1);
            } else if (input[0].equals("Truck")) {
                vehicle = new Truck(routeStrategy2);
            } else if (input[0].equals("Plane")) {
                vehicle = new Plane(routeStrategy1);
            }

            if (input[1].equals("RouteStrategy1")) {
                vehicle.setRoutingStrategy(routeStrategy1);
            } else if (input[1].equals("RouteStrategy2")) {
                vehicle.setRoutingStrategy(routeStrategy2);
            }

            String result = vehicle.deliver(new Deliverable(input[2], input[3], Double.parseDouble(input[4])));
            try {
                bufferedWriter.write(result + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}
