package com.lcafe8.observer;

//����۲��߽�ɫ��ʵ�ֳ���۲��߽�ɫ�ӿ�
public class ConcreteWatcher implements Watcher
{
	@Override
	public void update(String str)
	{
		System.out.println(str);
	}
}
