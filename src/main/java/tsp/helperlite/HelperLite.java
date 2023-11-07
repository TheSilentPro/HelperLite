package tsp.helperlite;

import org.bukkit.plugin.java.JavaPlugin;

import javax.annotation.Nonnull;

/**
 * @author TheSilentPro (Silent)
 */
public class HelperLite {

    private static JavaPlugin PLUGIN;

    /**
     * Initializes HelperLite.
     * Before doing anything, make sure you call this method!
     *
     * @param plugin Your plugins instance.
     */
    public static void init(JavaPlugin plugin) {
        PLUGIN = plugin;
    }

    @Nonnull
    public static JavaPlugin getPlugin() {
        if (PLUGIN == null) {
            throw new NullPointerException("Plugin instance is null!");
        }
        return PLUGIN;
    }

}