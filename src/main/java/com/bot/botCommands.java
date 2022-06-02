package com.bot;

import java.awt.Color;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class botCommands extends ListenerAdapter{
	public String prefix = "!";
	
	@Override
	public void onMessageReceived(MessageReceivedEvent event) {
		
		 String[] args = event.getMessage().getContentRaw().split(" ");

		 String name = args[1];
		 String tag = args[2];
		 
		 if(args[0].equalsIgnoreCase(prefix + "get")) {
			 System.out.println("Hello");
		 }
		 
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


