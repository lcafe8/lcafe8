package com.lcafe8.observer;

import java.util.ArrayList;
import java.util.List;

//具体主题角色,实现抽象主题角色接口
public class ConcreteWatched implements Watched
{
	private List<Watcher>  list = new ArrayList<Watcher>();
	//观察者的集合
	
	@Override
	public void addWatcher(Watcher watcher)
	{
		list.add(watcher);
	}

	@Override
	public void removeWatcher(Watcher watcher)
	{
		list.remove(watcher);
	}

	@Override
	public void notifyWatchers(String str)
	{
		for(Watcher watcher:list)
		{
			watcher.update(str);
		}
	}

}
