package com.hxch.movie.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName:SchedulerTask
 * @Description:TODO
 * @Author:huangxc
 * @Date: 2019/12/13 0013 16:04
 **/

@Slf4j
@Component
public class SchedulerTask_2 {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    @Scheduled(fixedRate = 6000)
    private void process(){
         log.info("现在时间：" + dateFormat.format(new Date()));
     }
}
