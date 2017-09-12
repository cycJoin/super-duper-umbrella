package com.cn.base.common.log.impl;

public class PatternLayout {
	public static final String DEFAULT_CONVERSION_PATTERN = "%m%n";
    private String patten;
    public PatternLayout(String patten){
    	this.patten = patten;
    }
    public PatternLayout(){
    	this.patten = DEFAULT_CONVERSION_PATTERN;
    }

}
