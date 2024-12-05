package com.bilmao.one_car.services;

import com.bilmao.one_car.dtos.CreateOrderDto;
import com.bilmao.one_car.dtos.CreateReplacedPartDto;
import com.bilmao.one_car.dtos.CreateServiceDto;
import com.bilmao.one_car.dtos.OrderDto;
import com.bilmao.one_car.entities.OrderStatus;
import com.bilmao.one_car.repos.OrderRepository;
import com.bilmao.one_car.repos.ReplacedPartRepository;
import com.bilmao.one_car.repos.ServiceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;
    private final ReplacedPartRepository replacedPartRepository;
    private final ServiceRepository serviceRepository;

    public List<OrderDto> getAllOrders(OrderStatus status) {
        return null;
    }

    public OrderDto getOrderById(Long orderId) {
        return null;
    }

    public List<OrderDto> getOrdersByUserId(Long userId) {
        return null;
    }

    public OrderDto scheduleOrder(Long userId, CreateOrderDto createOrderDto) {
        return null;
    }

    public OrderDto changeOrderDate(Long orderId, CreateOrderDto createOrderDto) {
        return null;
    }

    public void startOrder(Long orderId) {
    }

    public void completeOrder(Long orderId) {
    }

    public void cancelOrder(Long orderId) {
    }

    public void addServiceToOrder(Long orderId, List<CreateServiceDto> services) {
    }

    public void removeServiceFromOrder(Long orderId, Long serviceId) {
    }

    public void addReplacedPartToOrder(Long orderId, List<CreateReplacedPartDto> replacedParts) {
    }

    public void removeReplacedPartFromOrder(Long orderId, Long replacedPartId) {
    }
}
