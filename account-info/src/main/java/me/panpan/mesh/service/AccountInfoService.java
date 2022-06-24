package me.panpan.mesh.service;

import me.panpan.mesh.feign.FeignClientUtils;
import me.panpan.mesh.model.OrderDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountInfoService {

    @Autowired
    private FeignClientUtils feignClientUtils;

    public List<OrderDetail> getOrderList() {
        return feignClientUtils.getOrderList("Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1c2VyIiwiYXV0aCI6InJvbGUifQ.DrNFh4pEXrc0DyE8PBEGsEPkRTwQ7I7iiPTgd2ahrQw");
    }
}
