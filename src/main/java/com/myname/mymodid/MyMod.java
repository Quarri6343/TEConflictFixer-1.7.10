package com.myname.mymodid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import cpw.mods.fml.common.Mod;

@Mod(modid = MyMod.MODID, version = Tags.VERSION, name = "TEConflictFixer", acceptedMinecraftVersions = "[1.7.10]")
public class MyMod {

    public static final String MODID = "teconflictfixer";
    public static final Logger LOG = LogManager.getLogger(MODID);
}
