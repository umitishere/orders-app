package com.example.ordersapp.controller;

import com.example.ordersapp.data.Order;
import com.example.ordersapp.service.OrderService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/orders")
public class OrderController {

  private final OrderService orderService;

  @Autowired
  public OrderController(OrderService orderService) {
    this.orderService = orderService;
  }

  @GetMapping
  public List<Order> getOrders() {
    return orderService.getOrders();
  }

  @PostMapping
  public void addNewOrder(@RequestBody Order order) {
    orderService.addNewOrder(order);
  }

  @DeleteMapping(path = "{orderId}")
  public void deleteOrder(@PathVariable Long orderId) {
    orderService.deleteOrder(orderId);
  }

}
