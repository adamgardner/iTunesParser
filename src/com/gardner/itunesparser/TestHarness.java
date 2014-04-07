package com.gardner.itunesparser;

import java.io.File;

public class TestHarness
{

	public static void main(String[] args)
	{
		String strFilePath = buildFilePath("feed.xml");
		File oFeedFile = new File(strFilePath);
		
		if (oFeedFile.exists())
		{
			Parser.parse(oFeedFile);
		}
	}
	
	/*
	 * File path is current directory + com/garder/itunesparser/feed
	 * This gets us to the feed directory.
	 * Then the name of the XML file, which is 'feed.xml' by default
	 */
	private static String buildFilePath(String strFileName)
	{
		StringBuilder oPathBuilder = new StringBuilder();
		
		// Root path where this script began executing.
		oPathBuilder.append(System.getProperty("user.dir") + "/");
		oPathBuilder.append("src/com/gardner/itunesparser/feed/");
		oPathBuilder.append(strFileName);
		return oPathBuilder.toString();
	}

}
