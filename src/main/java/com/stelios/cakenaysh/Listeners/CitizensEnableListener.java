package com.stelios.cakenaysh.Listeners;

import com.stelios.cakenaysh.Util.Npc.Npcs;
import net.citizensnpcs.api.event.CitizensEnableEvent;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class CitizensEnableListener implements Listener {

    @EventHandler
    public void onCitizensEnable(CitizensEnableEvent e){
        System.out.println("Citizens has been enabled!");
        //Npcs.TEST_NPC.createNpc(new Location(Bukkit.getWorld("world"), 110,102,-38));
    }
}
