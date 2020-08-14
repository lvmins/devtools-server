package com.wpp.devtools.model;

import com.wpp.devtools.service.UnAuthService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

/**
 * @program: volvo-server
 * @description: 定时任务
 * @author: wpp
 * @create: 2020-07-09
 **/
@Configuration
@EnableScheduling
@Slf4j
public class Schedule implements SchedulingConfigurer {

    @Override
    public void configureTasks(ScheduledTaskRegistrar scheduledTaskRegistrar) {
        ScheduledExecutorService taskExecutor = Executors.newScheduledThreadPool(3);
        scheduledTaskRegistrar.setScheduler(taskExecutor);
    }

    @Autowired
    private UnAuthService unAuthService;

    //每天凌晨1点
    @Scheduled(cron = "0 0 1 * * ?")
    public void task1() {
        long startTime = System.currentTimeMillis();
        //            unAuthService.getDoglickingDiaryListInsert();
//        log.info("定时任务: {}, 完成, 耗时： {}s", "同步舔狗日记",
//                (System.currentTimeMillis() - startTime) / 1000);
    }

}
