package com.lcafe8.observer;

//���������ɫ
public interface Watched
{
	public void addWatcher(Watcher watcher);

	public void removeWatcher(Watcher watcher);

	public void notifyWatchers(String str);
}
