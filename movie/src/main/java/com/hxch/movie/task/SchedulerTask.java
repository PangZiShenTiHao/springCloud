package com.hxch.movie.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @ClassName:SchedulerTask
 * @Description:TODO
 * @Author:huangxc
 * @Date: 2019/12/13 0013 16:04
 **/

@Slf4j
@Component
public class SchedulerTask {
     private int count = 0;
     @Scheduled(cron="*/6 * * * * ?")
     private void process(){
         log.info("SchedulerTask is running "+ (count ++));
     }
}
