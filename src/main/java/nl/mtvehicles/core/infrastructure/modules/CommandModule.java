package nl.mtvehicles.core.infrastructure.modules;

import lombok.Getter;
import lombok.Setter;
import nl.mtvehicles.core.Main;
import nl.mtvehicles.core.commands.VehicleSubCommandManager;
import nl.mtvehicles.core.commands.VehicleTabCompleterManager;
import nl.mtvehicles.core.infrastructure.models.MTVehicleSubCommand;
import org.bukkit.command.PluginCommand;

import java.util.HashMap;

/**
 * Module for managing /mtv commands
 */
public class CommandModule {
    private static @Getter
    @Setter
    CommandModule instance;

    /**
     * HashMap mapping all /mtv subcommands and their respective classes
     */
    public static HashMap<String, MTVehicleSubCommand> subcommands = new HashMap<>();

    public CommandModule() {
        PluginCommand pluginCommand = Main.instance.getCommand("minetopiavehicles");

        if (pluginCommand != null) {
            pluginCommand.setExecutor(new VehicleSubCommandManager());
            pluginCommand.setTabCompleter(new VehicleTabCompleterManager());
        }
    }
}
