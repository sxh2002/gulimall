package com.wwh.gulimall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.sun.corba.se.impl.encoding.CodeSetConversion;
import com.wwh.gulimall.product.entity.BrandEntity;
import com.wwh.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {

        for (BrandEntity entity : brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L))) {
            System.out.println("======"+entity);
        }

//        brandService.save(brandEntity);
//        System.out.println("==================");
    }

}
