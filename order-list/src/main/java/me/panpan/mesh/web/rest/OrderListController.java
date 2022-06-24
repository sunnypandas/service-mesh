package me.panpan.mesh.web.rest;

import me.panpan.mesh.model.OrderDetail;
import me.panpan.mesh.service.OrderListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/list")
public class OrderListController {

    @Autowired
    private OrderListService orderListService;

    @GetMapping(produces = "application/json")
    public List<OrderDetail> getOrderList() {
        return orderListService.getOrderList();
    }
}
