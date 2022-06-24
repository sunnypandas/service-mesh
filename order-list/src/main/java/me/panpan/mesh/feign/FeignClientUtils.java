package me.panpan.mesh.feign;

import me.panpan.mesh.config.FeignConfiguration;
import me.panpan.mesh.model.OrderDetail;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(url="orderdetail", name = "orderDetailClient",configuration={FeignConfiguration.class})
public interface FeignClientUtils {
    @RequestMapping(value = "/api/order/{id}", method = RequestMethod.GET)
    OrderDetail getOrderDetailById(@RequestHeader("Authorization") String bearerToken, @PathVariable("id") String id);
}
