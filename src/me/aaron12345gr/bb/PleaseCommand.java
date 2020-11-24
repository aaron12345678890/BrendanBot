package me.aaron12345gr.bb;

import java.awt.Color;
import java.util.Random;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class PleaseCommand extends ListenerAdapter {

	public void onMessageReceived(MessageReceivedEvent event) {
		Message msg = event.getMessage();
		MessageChannel ch = event.getChannel();
		String type = msg.getContentRaw();

		if (type.equalsIgnoreCase(Brendan.prefix + "help")) {
			ch.sendMessage("fuck offf").queue();

			EmbedBuilder info = new EmbedBuilder();
			info.setTitle("Commands");
			info.setDescription("Brendan please <help,ping, roll>");
			info.addField("Bot Maker Man", "aaron123#7969", false);
			info.setColor(Color.cyan);

			ch.sendMessage(info.build()).queue();
			info.clear();
		} else if (type.equalsIgnoreCase(Brendan.prefix + "ping")) {
			ch.sendMessage("pong").queue();
		} else if (type.equalsIgnoreCase("brendan is a bitch")) {
			ch.sendMessage("baned").queue();
		} else if (type.equalsIgnoreCase(Brendan.prefix + "roll")) {
			Random random = new Random();
			int roll = random.nextInt(6) + 1;
			ch.sendMessage("Your roll: " + roll).queue();
		} else if (type.equalsIgnoreCase("brendan")) {
			ch.sendMessage("what").queue();
		} else if (type.equalsIgnoreCase("fuck you brendan")) {
			ch.sendMessage("baned").queue();
		} else if (type.equalsIgnoreCase("thanks brendan")) {
			ch.sendMessage("no problem").queue();
		}

	}
}
