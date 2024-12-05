package com.bilmao.one_car.controllers;

import com.bilmao.one_car.dtos.CreateOrderDto;
import com.bilmao.one_car.dtos.CreateReplacedPartDto;
import com.bilmao.one_car.dtos.CreateServiceDto;
import com.bilmao.one_car.dtos.OrderDto;
import com.bilmao.one_car.entities.OrderStatus;
import com.bilmao.one_car.services.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    @PostMapping("/users/{userId}")
    public ResponseEntity<OrderDto> scheduleOrder(@PathVariable Long userId, CreateOrderDto dto) {
        return ResponseEntity.ok(orderService.scheduleOrder(userId, dto));
    }

    @GetMapping
    public ResponseEntity<List<OrderDto>> getAllOrders(@RequestParam(required = false) OrderStatus status) {
        return ResponseEntity.ok(orderService.getAllOrders(status));
    }

    @GetMapping("/users/{userId}")
    public ResponseEntity<List<OrderDto>> getOrdersByUserId(@PathVariable Long userId) {
        return ResponseEntity.ok(orderService.getOrdersByUserId(userId));
    }

    @GetMapping("/{orderId}")
    public ResponseEntity<OrderDto> getOrderById(@PathVariable Long orderId) {
        return ResponseEntity.ok(orderService.getOrderById(orderId));
    }

    @PatchMapping("/{orderId}/start")
    public ResponseEntity<Void> startOrder(@PathVariable Long orderId) {
        orderService.startOrder(orderId);
        return ResponseEntity.ok().build();
    }

    @PatchMapping("/{orderId}/complete")
    public ResponseEntity<Void> completeOrder(@PathVariable Long orderId) {
        orderService.completeOrder(orderId);
        return ResponseEntity.ok().build();
    }

    @PatchMapping("/{orderId}/cancel")
    public ResponseEntity<Void> cancelOrder(@PathVariable Long orderId) {
        orderService.cancelOrder(orderId);
        return ResponseEntity.ok().build();
    }

    @PatchMapping("/{orderId}/services")
    public ResponseEntity<Void> addServiceToOrder(@PathVariable Long orderId, List<CreateServiceDto> serviceIds) {
        orderService.addServiceToOrder(orderId, serviceIds);
        return ResponseEntity.ok().build();
    }

    @PatchMapping("/{orderId}/services/{serviceId}")
    public ResponseEntity<Void> removeServiceFromOrder(@PathVariable Long orderId, @PathVariable Long serviceId) {
        orderService.removeServiceFromOrder(orderId, serviceId);
        return ResponseEntity.ok().build();
    }

    @PatchMapping("/{orderId}/replaced-parts")
    public ResponseEntity<Void> addReplacedPartToOrder(@PathVariable Long orderId, List<CreateReplacedPartDto> replacedPartIds) {
        orderService.addReplacedPartToOrder(orderId, replacedPartIds);
        return ResponseEntity.ok().build();
    }

    @PatchMapping("/{orderId}/replaced-parts/{replacedPartId}")
    public ResponseEntity<Void> removeReplacedPartFromOrder(@PathVariable Long orderId, @PathVariable Long replacedPartId) {
        orderService.removeReplacedPartFromOrder(orderId, replacedPartId);
        return ResponseEntity.ok().build();
    }

}
