package me.aaron12345gr.bb;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.utils.Compression;
import net.dv8tion.jda.api.utils.cache.CacheFlag;

public class Brendan {

	// Version 2.0
	public static String prefix = "brendan please ";

	public static void main(String[] args) throws LoginException, InterruptedException {
		JDABuilder builder = JDABuilder.createDefault("token");

		builder.disableCache(CacheFlag.MEMBER_OVERRIDES, CacheFlag.VOICE_STATE);
		builder.setBulkDeleteSplittingEnabled(false);
		builder.setCompression(Compression.NONE);
		builder.setActivity(Activity.watching("pog"));

		builder.addEventListeners(new PleaseCommand());
		builder.build();

	}

}
