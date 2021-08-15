package net.kunmc.lab.shockwaveplugin.command;

import org.bukkit.configuration.file.FileConfiguration;

public class ConfigManager
{
    private static ConfigManager INSTANCE;
    private FileConfiguration config;

    public static ConfigManager getInstance() 
    {
        return INSTANCE;
    }

    public ConfigManager(FileConfiguration config)
    {
        INSTANCE = this;
        this.config = config;
    }
}

