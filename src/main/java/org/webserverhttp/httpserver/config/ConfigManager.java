package org.webserverhttp.httpserver.config;

public class ConfigManager
{

    private static ConfigManager myConfigManager;
    private static Config myCurrentCongfig;

    private ConfigManager()
    {

    }

    public static ConfigManager getInstance()
    {
        if(myConfigManager == null)
            myConfigManager = new ConfigManager();

        return myConfigManager;

    }

    public void loadConfigFile (String filePath)
    {

    }

    public void getCurrentConfig ()
    {

    }
}
