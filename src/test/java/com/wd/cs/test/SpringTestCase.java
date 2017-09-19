package com.wd.cs.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wd.cs.dao.SouluMapper;
import com.wd.cs.po.Soulu;
/**
* Created by vampirehgg@qq.com on 2017-09-19 17:05:35.
*spring 测试基类
*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/*.xml"})
public class SpringTestCase extends AbstractTransactionalJUnit4SpringContextTests {

	@Autowired
    SouluMapper souluMapper;

    @Test
    public void test2() {
        Soulu soulu = new Soulu();
        soulu.setId("1112");
        soulu.setName("EI");
        souluMapper.insert(soulu);
    }
}