package edu.iu.habahram.coffeeorder.repository;

import edu.iu.habahram.coffeeorder.model.OrderData;
import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderRepositoryTest {

    OrderRepository orderRepository = new OrderRepository();
    @Test
    void add() throws Exception {
        DecimalFormat df = new DecimalFormat("0.00");
        List<String> condiments = new ArrayList<>();
        OrderData order = new OrderData("Dark Roast", condiments);
        assertEquals(df.format(1.99), df.format(orderRepository.add(order).cost()));
        condiments.add("Milk");
        order = new OrderData("Dark Roast", condiments);
        assertEquals(df.format(2.39), df.format(orderRepository.add(order).cost()));
        condiments.add("Mocha");
        order = new OrderData("Dark Roast", condiments);
        assertEquals(df.format(2.69), df.format(orderRepository.add(order).cost()));
        condiments.add("Soy");
        order = new OrderData("Dark Roast", condiments);
        assertEquals(df.format(2.96), df.format(orderRepository.add(order).cost()));
        condiments.add("Whip");
        order = new OrderData("Dark Roast", condiments);
        assertEquals(df.format(3.21), df.format(orderRepository.add(order).cost()));
        condiments = new ArrayList<>();
        order = new OrderData("Decaf", condiments);
        assertEquals(df.format(1.28), df.format(orderRepository.add(order).cost()));
        condiments.add("Milk");
        order = new OrderData("Decaf", condiments);
        assertEquals(df.format(1.68), df.format(orderRepository.add(order).cost()));
        condiments.add("Mocha");
        order = new OrderData("Decaf", condiments);
        assertEquals(df.format(1.98), df.format(orderRepository.add(order).cost()));
        condiments.add("Soy");
        order = new OrderData("Decaf", condiments);
        assertEquals(df.format(2.25), df.format(orderRepository.add(order).cost()));
        condiments.add("Whip");
        order = new OrderData("Decaf", condiments);
        assertEquals(df.format(2.50), df.format(orderRepository.add(order).cost()));
        condiments = new ArrayList<>();
        order = new OrderData("Espresso", condiments);
        assertEquals(df.format(1.34), df.format(orderRepository.add(order).cost()));
        condiments.add("Milk");
        order = new OrderData("Espresso", condiments);
        assertEquals(df.format(1.74), df.format(orderRepository.add(order).cost()));
        condiments.add("Mocha");
        order = new OrderData("Espresso", condiments);
        assertEquals(df.format(2.04), df.format(orderRepository.add(order).cost()));
        condiments.add("Soy");
        order = new OrderData("Espresso", condiments);
        assertEquals(df.format(2.31), df.format(orderRepository.add(order).cost()));
        condiments.add("Whip");
        order = new OrderData("Espresso", condiments);
        assertEquals(df.format(2.56), df.format(orderRepository.add(order).cost()));
        condiments = new ArrayList<>();
        order = new OrderData("House Blend", condiments);
        assertEquals(df.format(1.65), df.format(orderRepository.add(order).cost()));
        condiments.add("Milk");
        order = new OrderData("House Blend", condiments);
        assertEquals(df.format(2.05), df.format(orderRepository.add(order).cost()));


    }
}