package com.Lieyang.waiter.Models;

import java.util.ArrayList;
import java.util.List;

public class currentOrders {
    public static List<Order> orders = new ArrayList<>();

    public currentOrders(){
        orders = new ArrayList<>();
    }

    public currentOrders(List<Order> items){
        orders = items;
    }

}
