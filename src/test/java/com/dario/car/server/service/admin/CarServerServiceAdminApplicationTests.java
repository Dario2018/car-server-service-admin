package com.dario.car.server.service.admin;

import com.dario.car.server.domain.mybatis.domain.Associator;
import com.dario.car.server.domain.mybatis.mapper.AssociatorMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CarServerServiceAdminApplicationTests {

    @Autowired
    private AssociatorMapper associatorMapper;

    @Test
    public void contextLoads() {
       List<Associator> list= associatorMapper.selectAll();
        System.out.println(list);
    }

}
