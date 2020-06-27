package com.busatod.graphics.raycasting;

import com.busatod.graphics.app.GraphicsApplication;
import com.busatod.graphics.app.Settings;

public class RayCasting extends GraphicsApplication
{
	public RayCasting()
	{
		Settings settings = new Settings();
		settings.title = "Ray Casting";
		start(settings);
	}
	
	@Override
	protected void appInit()
	{
	
	}
	
	@Override
	protected void appUpdate(long elapsedTime)
	{
	
	}
	
	@Override
	protected void appFinishOff()
	{
	
	}
	
	@Override
	protected void appPrintFinalStats()
	{
	
	}
	
	public static void main(String[] args)
	{
		new RayCasting();
	}
}
