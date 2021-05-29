package nl.mtvehicles.core.Infrastructure.DataConfig;

import nl.mtvehicles.core.Infrastructure.Helpers.TextUtils;
import nl.mtvehicles.core.Infrastructure.Models.ConfigUtils;

public class DefaultConfig extends ConfigUtils {
    public DefaultConfig() {
        this.setFileName("config.yml");
    }

    public String getMessage(String key) {
        return TextUtils.colorize((String) this.getConfig().get(key));
    }
}
