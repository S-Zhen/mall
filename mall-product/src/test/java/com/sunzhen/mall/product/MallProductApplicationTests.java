package com.sunzhen.mall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.sunzhen.mall.product.entity.BrandEntity;
import com.sunzhen.mall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    public void contextLoads() {
        //BrandEntity brandEntity = new BrandEntity();
        //brandEntity.setBrandId(1L);
        //brandEntity.setDescript("妈呀");
        //brandEntity.setName("华为");

        /*brandEntity.setName("华为");
        brandService.save(brandEntity);
        System.out.println("保存成功");*/

        //brandService.updateById(brandEntity);

        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        list.forEach((item)->{
            System.out.println(item);
        });

    }

}
