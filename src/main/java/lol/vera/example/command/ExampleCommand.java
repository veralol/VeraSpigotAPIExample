package lol.vera.example.command;

import lol.vera.spigot.VeraSpigotAPI;
import lol.vera.spigot.knockback.KnockbackProfile;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class ExampleCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender,
                             Command command, String s, String[] strings) {

        KnockbackProfile knockbackProfile =
                VeraSpigotAPI.INSTANCE.getImplementation().getActiveKnockbackProfile();

        commandSender.sendMessage(String.format(
                ChatColor.YELLOW + "Active profile: " + ChatColor.RED + "%s",
                knockbackProfile.getName()
        ));
        return true;
    }
}
