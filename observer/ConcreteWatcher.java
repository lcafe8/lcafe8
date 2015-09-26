package com.lcafe8.observer;

//具体观察者角色，实现抽象观察者角色接口
public class ConcreteWatcher implements Watcher
{
	@Override
	public void update(String str)
	{
		System.out.println(str);
	}
}
