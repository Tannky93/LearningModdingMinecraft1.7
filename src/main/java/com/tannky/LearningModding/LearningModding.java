package com.tannky.LearningModding;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid="LearningModding",name="Learning Modding",version="1.7.2-1.0")
public class LearningModding {

    @Mod.Instance("LearningModding")
    public static LearningModding instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
    // register items + blocks,network handling, mod config

    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
    // register gui,recipes,tile entities,general event handlers

    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){
    //wrap-ups

    }


}
