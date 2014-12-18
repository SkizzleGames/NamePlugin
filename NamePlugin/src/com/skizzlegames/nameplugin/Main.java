package com.skizzlegames.nameplugin;
 
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;
 
public class Main extends JavaPlugin{
        public void onEnable(){
                getLogger().info("Plugin Enabled!");
        }
       
        public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
        	if(cmd.getName().equalsIgnoreCase("name")){
        	    }
            if (cmd.getName().equalsIgnoreCase("name")) {
                if (!sender.hasPermission("namep.name")) {
                        sender.sendMessage(ChatColor.RED + "You are not permitted to do this!");
                        return true;
        		       }
                }
                return true;
        }}
       