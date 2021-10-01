package com.chungkui.uid;

import com.baidu.fsg.uid.worker.service.WorkerNodeEntityService;
import com.chungkui.uid.service.WorkerNodeServiceImpl;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(prefix = "uid", value = "enable", matchIfMissing = true)
@MapperScan("com.chungkui.uid.mapper")
public class UidMybatisPlusConfiguration {
    @Bean
    WorkerNodeEntityService workerNodeEntityService(){
        return new WorkerNodeServiceImpl();
    }
   }
