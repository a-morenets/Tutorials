/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samples.streams.samples.config;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Денис
 */
public class Config {
    private static final String CONFIG_FILE = "./src/config.properties";
    private static final String FILE_NAME = "file.name";
    private static Config instance;
    private String fileName;

    private Config() {
        load();
    }

    public static Config getInstance() {
        if (instance == null) {
            instance = new Config();
        }
        return instance;
    }

    public String getFileName() {
        return fileName;
    }

    private void load() {
        Properties props = new Properties();
//        try (InputStream in = new BufferedInputStream(new FileInputStream(CONFIG_FILE))) {
//            props.load(in);
//            fileName = props.getProperty(FILE_NAME);
//        } catch (Exception ex) {
//            Logger.getLogger(Config.class.getName()).log(Level.SEVERE, null, ex);
//        }
        try (InputStream in = new BufferedInputStream(
                getClass().getResourceAsStream("/config.properties"))) {

            props.load(in);
            fileName = props.getProperty(FILE_NAME);

        } catch (Exception ex) {
            Logger.getLogger(Config.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException(ex);
        }
    }
}
