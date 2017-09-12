package com.cn.base.common.log;

public abstract class Appender {
	 private String name;
	    private Layout layout;
		public void setName(String name) {
			this.name = name;

		}

		public String getName() {
			return name;
		}

		public void setLayout(Layout layout) {
			this.layout = layout;

		}

		public Layout getLayout() {
			return layout;

		}
}
