package org.eddy.captcha;

import org.apache.commons.io.FileUtils;
import org.eddy.config.ImageConfig;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

/**
 * Created by Justice-love on 2017/7/17.
 */
public class CaptchaUtil {

    @Autowired
    private ImageConfig imageConfig;

    public void saveImage(String fileName, byte[] bytes) {
        Objects.requireNonNull(bytes);

        try {
            FileUtils.writeByteArrayToFile(new File(imageConfig.getImageLocation() + "/" + fileName), bytes);
        } catch (IOException e) {
            throw new RuntimeException("saveImage error", e);
        }
    }
}