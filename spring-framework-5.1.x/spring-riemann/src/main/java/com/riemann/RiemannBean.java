package com.riemann;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class RiemannBean implements InitializingBean, ApplicationContextAware {

	private ItBean itBean;

	public void setItBean(ItBean itBean) {
		this.itBean = itBean;
	}

	public RiemannBean() {
		System.out.println("RiemannBean 构造器...");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("RiemannBean afterPropertiesSet...");
	}

	public void print() {
		System.out.println("RiemannBean print方法业务逻辑执行...");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("RiemannBean setApplicationContext...");
	}

}
