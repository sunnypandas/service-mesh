package me.panpan.mesh.service;

import me.panpan.mesh.feign.FeignClientUtils;
import me.panpan.mesh.model.OrderDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderListService {

    @Autowired
    private FeignClientUtils feignClientUtils;

    public List<OrderDetail> getOrderList() {
        List<OrderDetail> orderDetailList = new ArrayList<>();
        for (int idx = 0; idx < 10; idx++) {
            orderDetailList.add(feignClientUtils.getOrderDetailById("Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1c2VyIiwiYXV0aCI6InJvbGUifQ.h_K-Uue_gPSbolzxjv2nxduGlY8lAZQWYSqdZX4yTVA", String.valueOf(idx)));
        }
        return orderDetailList;
    }
}
