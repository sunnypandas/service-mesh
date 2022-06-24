package me.panpan.mesh.web.rest;

import me.panpan.mesh.model.OrderDetail;
import me.panpan.mesh.service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/order")
public class OrderDetailController {

    @Autowired
    private OrderDetailService orderDetailService;

    @GetMapping(value = "/{id}", produces = "application/json")
    public OrderDetail getOrderDetailById(@PathVariable String id) {
        return orderDetailService.getOrderDetailById(id);
    }
}
