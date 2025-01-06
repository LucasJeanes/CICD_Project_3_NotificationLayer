package com.ie.cicd_project_3_notificationlayer;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notify")
public class NotificationController {

    @PostMapping("/order/created")
    public String notifyOrderCreated(@RequestBody Order orderDetails) {
        String createdOrder = "Order created with ID: " + orderDetails.getId() + orderDetails;
        return createdOrder;
    }

    @PostMapping("/order/all")
    public String notifyAllOrders(@RequestBody List<Order> orders) {
        String retrieveAll = "Retrieved all "
                + orders.size()
                + " orders. \n"
                + orders;
        return retrieveAll;
    }

    @PostMapping("/order/byId")
    public String notifyOrderById(@RequestBody Order order) {
        String retrieveById = "Retrieved order with ID: " + order.getId() + order;
        return retrieveById;
    }

    @PostMapping("/order/byUserId")
    public String notifyOrderByUserId(@RequestParam Long userId, @RequestBody List<Order> orders) {
        String retrieveByUserId = "Retrieved "
                + orders.size()
                + " order(s) for user ID: "
                + userId
                + orders;
        return retrieveByUserId;
    }

    @PostMapping("/order/updated")
    public String notifyOrderUpdated(@RequestBody Order order) {
        String updatedOrder = "Updated order with ID: " + order.getId() + order;
        return updatedOrder;
    }

    @PostMapping("/order/deleted")
    public String notifyOrderDeleted(@RequestParam Long id) {
        return "Deleted order with ID: " + id;
    }
}
