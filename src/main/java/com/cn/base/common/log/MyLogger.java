package com.cn.base.common.log;

public interface MyLogger {
      public abstract String getLoggerName();
      public abstract String getLoggerLevel();
      public abstract void info(String msg);
      public abstract void debug(String msg);
      public abstract void error(String msg);
      public abstract void trace(String msg);
      public abstract void info(Class className,String msg);
      public abstract void debug(Class className,String msg);
      public abstract void error(Class className,String msg);
      public abstract void trace(Class className,String msg);
      public abstract void error(Class className,Throwable throwable);
}
