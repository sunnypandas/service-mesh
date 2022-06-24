package me.panpan.mesh.feign;

import me.panpan.mesh.config.FeignConfiguration;
import me.panpan.mesh.model.OrderDetail;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(url="orderlist", name = "orderListClient",configuration={FeignConfiguration.class})
public interface FeignClientUtils {
    @RequestMapping(value = "/api/list", method = RequestMethod.GET)
    List<OrderDetail> getOrderList(@RequestHeader("Authorization") String bearerToken);
}
