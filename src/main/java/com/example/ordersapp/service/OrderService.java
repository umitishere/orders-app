package com.example.ordersapp.service;

import com.example.ordersapp.data.Order;
import com.example.ordersapp.data.OrderRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

  private final OrderRepository orderRepository;

  @Autowired
  public OrderService(OrderRepository orderRepository) {
    this.orderRepository = orderRepository;
  }

  public List<Order> getOrders() {
    return orderRepository.findAll();
  }

  public void addNewOrder(Order order) {
    orderRepository.save(order);
  }

}
