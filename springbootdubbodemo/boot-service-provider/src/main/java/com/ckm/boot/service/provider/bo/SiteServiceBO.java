package com.ckm.boot.service.provider.bo;

import com.ckm.boot.service.provider.bean.GenericDTO;
import org.springframework.stereotype.Service;

/**
 * @Author ckm
 * @Date 2022/1/12
 **/
@Service
public class SiteServiceBO {
    public GenericDTO getName(String name) {
        GenericDTO genericDTO = new GenericDTO();
        genericDTO.setId("1");
        genericDTO.setName(name);
        genericDTO.setAge("23");
        return genericDTO;
    }
}
