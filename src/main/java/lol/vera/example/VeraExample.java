package lol.vera.example;

import lol.vera.example.command.ExampleCommand;
import org.bukkit.plugin.java.JavaPlugin;

public class VeraExample extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("example").setExecutor(new ExampleCommand());
    }
}
