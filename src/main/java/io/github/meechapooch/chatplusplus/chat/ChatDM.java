package io.github.meechapooch.chatplusplus.chat;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

public class ChatDM implements ChatThing {

    private final String otherPlayer;

    public ChatDM(String otherPlayer) {
        this.otherPlayer = otherPlayer;
    }

    public void sendMessage(String sender, String message) {
        sendMessage(Bukkit.getPlayer(sender), message);
    }

    @Override
    public String getName() {
        return otherPlayer;
    }

//    public void sendMessage(Player sender, String message) {
//        String recievedMessage = ChatColor.WHITE + "[" + ChatColor.GREEN + sender.getName() + ChatColor.WHITE + " -> " + ChatColor.LIGHT_PURPLE + "You" + ChatColor.WHITE + "]" + ChatColor.WHITE + message;
//
//
//        if(otherPlayer.toLowerCase().equals("console")) Bukkit.getConsoleSender().sendMessage(recievedMessage);
//        else Bukkit.getPlayer(otherPlayer).sendMessage(recievedMessage);
//
//        sender.sendMessage(ChatColor.WHITE + "[" + ChatColor.GREEN + "You" + ChatColor.WHITE + " -> " + ChatColor.LIGHT_PURPLE + otherPlayer + ChatColor.WHITE + "]" +
//                ChatColor.WHITE + message);
//    }

    public void sendMessage(CommandSender sender, String message) {
        String recievedMessage = ChatColor.WHITE + "[" + ChatColor.GREEN + sender.getName() + ChatColor.WHITE + " -> " + ChatColor.LIGHT_PURPLE + "You" + ChatColor.WHITE + "] " + ChatColor.WHITE + message;


        if (otherPlayer.equalsIgnoreCase("console")) Bukkit.getConsoleSender().sendMessage(recievedMessage);
        else Bukkit.getPlayer(otherPlayer).sendMessage(recievedMessage);

        sender.sendMessage(ChatColor.WHITE + "[" + ChatColor.GREEN + "You" + ChatColor.WHITE + " -> " + ChatColor.LIGHT_PURPLE + otherPlayer + ChatColor.WHITE + "] " +
                ChatColor.WHITE + message);
    }
}
