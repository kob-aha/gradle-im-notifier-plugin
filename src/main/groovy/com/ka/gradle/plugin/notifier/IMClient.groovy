package com.ka.gradle.plugin.notifier;

public interface IMClient {

	public void sendMessage(IMNotifierPluginExtension pluginExtension, String message);
	
}
