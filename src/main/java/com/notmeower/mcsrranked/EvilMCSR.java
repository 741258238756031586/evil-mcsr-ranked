package com.notmeower.mcsrranked;

import de.florianreuth.asmfabricloader.api.event.PrePrePreLaunchEntrypoint;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EvilMCSR implements PrePrePreLaunchEntrypoint {

    public static Logger LOGGER = LogManager.getLogger("EvilMCSR");

    @Override
    public void onLanguageAdapterLaunch() {
        LOGGER.info("WAOW herro");
    }
}
