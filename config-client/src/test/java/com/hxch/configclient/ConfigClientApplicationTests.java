package com.hxch.configclient;

import com.hxch.configclient.dto.JdbcConfigBean;
import com.hxch.configclient.utils.SpringContextUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ConfigClientApplicationTests {

    @Test
    void contextLoads() {
        JdbcConfigBean jdbcConfigBean = SpringContextUtil.getBean(JdbcConfigBean.class);
        System.out.println(jdbcConfigBean.toString());
    }

}
