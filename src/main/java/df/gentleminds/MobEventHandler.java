package df.gentleminds;

import net.minecraft.entity.monster.MonsterEntity;
import net.minecraftforge.event.entity.living.LivingSpawnEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

/**
 * Event handler for monster spawn activities. Removes AI,agression and noise of monsters
 *
 * @author Dominik Foerderreuther <df@eleon.de>
 * @since 2021-06-14
 */
@Mod.EventBusSubscriber(modid = GenleMindsMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class MobEventHandler {
    
    @SubscribeEvent
    public static void spawn(LivingSpawnEvent event) {
        if (event.getEntityLiving() instanceof MonsterEntity) {
            MonsterEntity monster = (MonsterEntity) event.getEntityLiving();
            monster.setAggressive(false);
            monster.setNoAi(true);
            monster.setSilent(true);
            monster.setJumping(true);
        }
    }
}
