import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {super.onEnable();
        Bukkit.getPluginManager().registerEvents(new Listener() {

            @EventHandler
            public void spielerStirbt(PlayerDeathEvent event) {
                event.getEntity().getWorld().getBlockAt(event.getEntity().getLocation()).setType(Material.TNT);
            }


        }, this);
    }
}
