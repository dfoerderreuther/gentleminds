package df.gentleminds;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(GenleMindsMod.MOD_ID)
public class GenleMindsMod
{
    
    public static final String MOD_ID = "gentleminds";
    
    private static final Logger LOGGER = LogManager.getLogger();

    public GenleMindsMod() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        LOGGER.info("SETUP #### {} ####", MOD_ID);
    }
    
}
