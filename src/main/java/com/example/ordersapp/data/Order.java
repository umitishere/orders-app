package com.example.ordersapp.data;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Order {

  @Id
  @SequenceGenerator(
      name = "order_sequence",
      sequenceName = "order_sequence",
      allocationSize = 1
  )
  @GeneratedValue(
      strategy = GenerationType.SEQUENCE,
      generator = "order_sequence"
  )
  private Long id;
  private String orderCategory;
  private String orderName;
  private Double orderPrice;
  private Integer orderAmount;
  private LocalDate orderDate;

  public Order() {

  }

  public Order(Long id, String orderCategory, String orderName, Double orderPrice,
      Integer orderAmount, LocalDate orderDate) {
    this.id = id;
    this.orderCategory = orderCategory;
    this.orderName = orderName;
    this.orderPrice = orderPrice;
    this.orderAmount = orderAmount;
    this.orderDate = orderDate;
  }

  public Order(String orderCategory, String orderName, Double orderPrice, Integer orderAmount,
      LocalDate orderDate) {
    this.orderCategory = orderCategory;
    this.orderName = orderName;
    this.orderPrice = orderPrice;
    this.orderAmount = orderAmount;
    this.orderDate = orderDate;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getOrderCategory() {
    return orderCategory;
  }

  public void setOrderCategory(String orderCategory) {
    this.orderCategory = orderCategory;
  }

  public String getOrderName() {
    return orderName;
  }

  public void setOrderName(String orderName) {
    this.orderName = orderName;
  }

  public Double getOrderPrice() {
    return orderPrice;
  }

  public void setOrderPrice(Double orderPrice) {
    this.orderPrice = orderPrice;
  }

  public Integer getOrderAmount() {
    return orderAmount;
  }

  public void setOrderAmount(Integer orderAmount) {
    this.orderAmount = orderAmount;
  }

  public LocalDate getOrderDate() {
    return orderDate;
  }

  public void setOrderDate(LocalDate orderDate) {
    this.orderDate = orderDate;
  }

  @Override
  public String toString() {
    return "Order{" +
        "id=" + id +
        ", orderCategory='" + orderCategory + '\'' +
        ", orderName='" + orderName + '\'' +
        ", orderPrice=" + orderPrice +
        ", orderAmount=" + orderAmount +
        ", orderDate=" + orderDate +
        '}';
  }
}