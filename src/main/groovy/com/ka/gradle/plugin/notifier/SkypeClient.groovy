package com.ka.gradle.plugin.notifier;

import com.skype.Skype;

public class SkypeClient implements IMClient {

	@Override
	public void sendMessage(IMNotifierPluginExtension pluginExtension, String message) {
		Skype.chat(pluginExtension.recipient).send(message)
	}
}
