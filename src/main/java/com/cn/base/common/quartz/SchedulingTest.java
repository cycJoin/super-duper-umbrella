package com.cn.base.common.quartz;

import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import ch.qos.logback.classic.Logger;
@Component
public class SchedulingTest {
	private final Logger logger = (Logger) LoggerFactory.getLogger(getClass());
	//Logger log = Logger
    @Scheduled(cron = "0/5 * 8 * * ?") // 每5秒执行一次
    public void scheduler() {
    logger.info(">>>>>>>>>>>>> scheduled test... ");
    }
}
