package me.panpan.mesh.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class OrderDetail implements Serializable {
    private String id;
    private String name;
}
