package com.lcafe8.proxy;

public class ProxySubject extends Subject
{
	private RealSubject realSubject = new RealSubject();
	//代理角色内部引用真是角色
	
	public void reguest()
	{
		this.preRequest();//代理角色在完成真实角色操作前进行一些操作
		
		realSubject.reguest();//真实角色完成的事情
		
		this.afterRequest();//代理角色在完成真实角色操作后进行一些操作
	}
	
	private void preRequest()
	{
		System.out.println("Pre-Request");
	}
	
	private void afterRequest()
	{
		System.out.println("After-Request");
	}
}
