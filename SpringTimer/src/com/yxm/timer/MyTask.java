package com.yxm.timer;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
/**
 * springmvc定时任务
 * @author yxm
 * @date 2016-12-8
 */
@Component
public class MyTask {
	
   @Scheduled(fixedRate = 1000*2)//间隔2秒
   public void run(){
	   System.out.println("******Timer 执行********");
   }
}
