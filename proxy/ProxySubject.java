package com.lcafe8.proxy;

public class ProxySubject extends Subject
{
	private RealSubject realSubject = new RealSubject();
	//�����ɫ�ڲ��������ǽ�ɫ
	
	public void reguest()
	{
		this.preRequest();//�����ɫ�������ʵ��ɫ����ǰ����һЩ����
		
		realSubject.reguest();//��ʵ��ɫ��ɵ�����
		
		this.afterRequest();//�����ɫ�������ʵ��ɫ���������һЩ����
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
