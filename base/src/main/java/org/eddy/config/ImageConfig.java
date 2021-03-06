package org.eddy.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by Justice-love on 2017/7/17.
 */
@ConfigurationProperties("thrush.image")
@Component
public class ImageConfig {

    public static String imageLocation;

    public static String url;

    public void setImageLocation(String imageLocation) {
        ImageConfig.imageLocation = imageLocation;
    }

    public void setUrl(String url) {
        ImageConfig.url = url;
    }
}
