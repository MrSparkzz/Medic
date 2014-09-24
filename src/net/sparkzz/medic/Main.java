package net.sparkzz.medic;

import net.sparkzz.medic.util.FileManager;
import net.sparkzz.medic.util.Logger;
import org.spongepowered.api.event.SpongeEventHandler;
import org.spongepowered.api.plugin.Plugin;

/**
 * Created by Brendon on 9/12/2014.
 */
@Plugin(id = "Medic", name = this.NAME, version = this.VERSION)
public class Main {

	public final String NAME = "Medic", VERSION = "0.0.1-PRE";

	private static FileManager files = new FileManager();
	private static Logger logger = new Logger("Medic");

	@SpongeEventHandler
	public void onDisable() {
		logger.info(NAME + " v" + VERSION + " has been disabled");
	}

	@SpongeEventHandler
	public void onEnable() {
		logger.info(NAME + " v" + VERSION + " has been enabled");
	}
}