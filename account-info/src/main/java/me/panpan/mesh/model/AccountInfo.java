package me.panpan.mesh.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class AccountInfo implements Serializable {
    private String accountNo;
    private List<OrderDetail> orderDetailList;
}
