package com.ckm.boot.service.provider.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author ckm
 * @Date 2022/1/12
 **/
@Data
public class GenericDTO<T> implements Serializable {
    private String id;
    private String name;
    private String age;
}
