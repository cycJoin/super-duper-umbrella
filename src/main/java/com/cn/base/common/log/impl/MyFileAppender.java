package com.cn.base.common.log.impl;

import java.io.File;

import ch.qos.logback.classic.spi.LoggingEvent;
import ch.qos.logback.core.rolling.RollingFileAppender;
import ch.qos.logback.core.rolling.RollingPolicy;
import ch.qos.logback.core.rolling.TriggeringPolicy;
import ch.qos.logback.core.spi.DeferredProcessingAware;

public class MyFileAppender extends RollingFileAppender {
	
	@SuppressWarnings("unused")
	@Override
	public void start() {
		String msg = super.getFile();
		//System.out.println("============msg:"+msg+"mylogger.......");
		// TODO Auto-generated method stub
		super.start();
	}
	
	
	File currentlyActiveFile;
    @SuppressWarnings({ "rawtypes", "unused" })
	@Override
	public void doAppend(Object arg0) {
		// TODO Auto-generated method stub
    	Object newObject = null;
    		if(arg0 instanceof DeferredProcessingAware){
    			LoggingEvent event = (LoggingEvent) arg0;
    			String newmessage = event.getMessage();
    			//System.out.println("======message:"+newmessage);
    			int num = newmessage.indexOf("test");
    			if(num>0){
    				newmessage = newmessage.substring(0, num).concat(" for test");
    				//event.setMessage(newmessage);
    			}
    			newObject = event;
    		}
		super.doAppend(newObject);
	}
	TriggeringPolicy triggeringPolicy;
    RollingPolicy rollingPolicy;
    private static String RFA_NO_TP_URL = "http://logback.qos.ch/codes.html#rfa_no_tp";
    private static String RFA_NO_RP_URL = "http://logback.qos.ch/codes.html#rfa_no_rp";
    private static String COLLISION_URL = "http://logback.qos.ch/codes.html#rfa_collision";
	@Override
	public String getFile() {
		// TODO Auto-generated method stub
		String msg = super.getFile();
		System.out.println("============msg:"+msg);
		return msg;
	}
}
