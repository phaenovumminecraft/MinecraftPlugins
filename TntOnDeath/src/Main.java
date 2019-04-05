import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.util.Vector;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {super.onEnable();
        Bukkit.getPluginManager().registerEvents(new Listener() {

            @EventHandler
            public void spielerStirbt(PlayerDeathEvent event) {
                for (int i = 0; i < 10; i++) {
                    Entity entity = event.getEntity().getWorld().spawnEntity(event.getEntity().getLocation(), EntityType.PRIMED_TNT);
                    entity.setVelocity(new Vector(5*(Math.random()-0.5f), 5*(Math.random()-0.5f),5*(Math.random()-0.5f)));
                }
            }
        }, this);
    }
}
