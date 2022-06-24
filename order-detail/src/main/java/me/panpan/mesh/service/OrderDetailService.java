package me.panpan.mesh.service;

import me.panpan.mesh.model.OrderDetail;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class OrderDetailService {
    public OrderDetail getOrderDetailById(String id) {
        Map<String, OrderDetail> orderDetailMap = new HashMap<>();
        for (int idx = 0; idx < 10; idx ++) {
            OrderDetail orderDetail = new OrderDetail();
            orderDetail.setId(String.valueOf(idx));
            orderDetail.setName(String.join("-", "Order", String.valueOf(idx)));
            orderDetailMap.put(String.valueOf(idx), orderDetail);
        }

        if (StringUtils.isNotBlank(id)) {
            return orderDetailMap.get(id);
        }
        return null;
    }
}
