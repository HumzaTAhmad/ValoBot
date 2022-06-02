package com.bot;

import javax.security.auth.login.LoginException;

import com.bot.botCommands;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;
import net.dv8tion.jda.api.utils.ChunkingFilter;
import net.dv8tion.jda.api.utils.MemberCachePolicy;

public class ValoBot {
	public static void main(String[] args) throws LoginException {
		JDABuilder jda = JDABuilder.createDefault("OTc4Nzk1MDA3MDE0MjA3NTI4.GuILNA.pn0pZ8MRRVNpsdhla3E4H_QKQjUZ_MY_MF3Njg");
		jda.setActivity(Activity.watching("!test"));
		jda.setStatus(OnlineStatus.ONLINE);
		jda.addEventListeners(new botCommands());
		jda.setChunkingFilter(ChunkingFilter.ALL);
		jda.setMemberCachePolicy(MemberCachePolicy.ALL);
		jda.enableIntents(GatewayIntent.GUILD_MEMBERS);
		jda.build();
	}
	
}
