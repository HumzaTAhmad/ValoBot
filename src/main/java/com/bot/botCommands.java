package com.bot;

import java.awt.Color;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class botCommands extends ListenerAdapter{
	public String prefix = "!";
	
	@Override
	public void onMessageReceived(MessageReceivedEvent event) {
		 String[] args = event.getMessage().getContentRaw().split(" ");
		 
		 if(args[0].equalsIgnoreCase(prefix + "test")) {
			 EmbedBuilder embed = new EmbedBuilder();
			 embed.setTitle("Embed Title");
			 embed.setDescription("This is the Embed Description");
			 embed.addField("Embed Field 1", "This is the content of Field 1", false);
			 embed.addField("Embed Field 2", "This is the content of Field 2", false);
			 embed.setColor(Color.blue);
			 embed.setFooter("Bot created by <@!322220501898362880>", event.getGuild().getOwner().getUser().getAvatarUrl());
			 event.getChannel().sendMessageEmbeds(embed.build()).queue();
		 }
	}
	
}


