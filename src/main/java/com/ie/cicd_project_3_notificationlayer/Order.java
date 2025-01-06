package com.ie.cicd_project_3_notificationlayer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    private Long id;
    private Long userId;
    private List<OrderItem> orderItems;
    private double totalPrice;
    private LocalDateTime orderDate;
}
