package com.pepperish.simplekitgui;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class KitCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        String message = "&cThis is a test message that should appear red, &3and this should appear green.";
        Player p = (Player) commandSender;
        p.sendMessage(ChatColor.translateAlternateColorCodes('&', message));
        return true;
    }
}
