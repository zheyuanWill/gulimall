package com.example.guliproduct;

import com.example.guliproduct.product.entity.BrandEntity;
import com.example.guliproduct.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
class GuliproductApplicationTests {

    @Autowired
    BrandService brandService;
    @Test
    void contextLoads() {
        BrandEntity brandEntity=new BrandEntity();
        brandEntity.setName("华盛顿");
        brandService.save(brandEntity);
        System.out.println("阿萨的酒吧时段");
    }

}
