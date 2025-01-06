package com.ie.cicd_project_3_notificationlayer;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notify")
public class NotificationController {
    //USER API CONNECTIONS-----
    @PostMapping("/user/created")
    public String notifyUserCreated(@RequestBody User user) {
        String createdUser = "User " + user.getUsername() + " registered successfully.\nID: " + user.getId();
        return createdUser;
    }

    @PostMapping("/user/all")
    public String notifyAllUsers(@RequestBody List<User> users) {
        return "Retrieved all " + users.size() + " users. \n" + users;
    }

    @PostMapping("/user/byId")
    public String notifyUserById(@RequestBody User user) {
        return "Retrieved user with ID: " + user.getId() + "\n " + user;
    }

    @PostMapping("/user/updated")
    public String notifyUserUpdated(@RequestBody User userDetails) {
        return "User with ID: " + userDetails.getId() + "updated: \n" + userDetails;
    }

    @PostMapping("/user/deleted")
    public String notifyUserDeleted(@RequestParam Long id) {
        return "User with ID: " + id + " deleted successfully";
    }
    //-----USER API METHODS

    //PRODUCT API METHODS-----
    @PostMapping("/product/created")
    public String notifyProductCreated(@RequestBody Product productDetails) {
        return "Registered new product with ID: " + productDetails.getId() + "\n " + productDetails;
    }

    @PostMapping("/product/all")
    public String notifyAllProducts(@RequestBody List<Product> products) {
        return "Retrieved all " + products.size() + " products. \n" + products;
    }

    @PostMapping("/product/byId")
    public String notifyProductById(@RequestBody Product product) {
        return "Retrieved product with ID: " + product.getId() + "\n " + product;
    }

    @PostMapping("/product/updated")
    public String notifyProductUpdated(@RequestBody Product product) {
        return "Updated product with ID: " + product.getId() + "\n " + product;
    }

    @PostMapping("/product/deleted")
    public String notifyProductDeleted(@RequestParam Long id) {
        return "Deleted product with ID: " + id;
    }
    //-----PRODUCT API METHODS

    //ORDER API METHODS-----
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
    //-----ORDER API METHODS
}
