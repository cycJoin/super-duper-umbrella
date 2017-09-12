package com.cn.base.common.log.impl;

import com.cn.base.common.log.Appender;
import com.cn.base.common.log.Layout;

public class ConsoleAppender extends Appender {
	private String target = "System.out";
	public void setTarget(String value)
	{
		String v = value.trim();
		if("System.out".equalsIgnoreCase(v))
			target = "System.out";
		else
			if("System.err".equalsIgnoreCase(v))
				target = "System.err";
	}
	  public ConsoleAppender()
	    {
	        target = "System.out";
	    }

	    public ConsoleAppender(Layout layout)
	    {
	    	this.target = "System.out";
	        setLayout(layout);
	    }
}
