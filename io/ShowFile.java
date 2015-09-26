package com.lcafe8.io;

import java.io.File;

public class ShowFile
{
	private static int depth = 0;

	public void show(File file)
	{
		if (file.isFile() || file.list().length == 0)
		{
			if (file.isDirectory())
			{
				// 目录后面加上\表示区分
				System.out.println(getTabs(depth) + file.getName() + "\\");
			} else
			{
				System.out.println(getTabs(depth) + file.getName());
			}
		} else
		{
			System.out.println(getTabs(depth) + file.getName());
			File[] names = file.listFiles();
			for (File f : names)
			{
				depth++;
				show(f);
				depth--;
			}
		}
	}

	private String getTabs(int depth)
	{
		StringBuffer tabs = new StringBuffer();
        for (int i = 0; i < depth; ++i)
        {
            tabs.append("\t");
        }

        return tabs.toString();
	}

	public static void main(String[] args)
	{
		ShowFile showFile = new ShowFile();
		showFile.show(new File("C:/text"));
	}
}
