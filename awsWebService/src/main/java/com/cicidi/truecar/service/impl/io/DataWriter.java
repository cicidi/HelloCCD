package com.cicidi.truecar.service.impl.io;

import com.cicidi.truecar.Constants;
import com.cicidi.truecar.model.database.Car;
import org.apache.log4j.Logger;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by wchen00 on 11/14/15.
 */
public class DataWriter {

    private static final Logger logger = Logger.getLogger(DataWriter.class);

    public File writeCarDetail(String content, Car car) throws IOException {
        try {

            File file = new File(Constants.local_dir + "/" + car.getYear() + "_" + car.getMake() + "_" + car.getModel() + ".csv");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close();
            logger.info("Done");
            return file;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void writeQuote(String content, String path) {
        try {
            File file = new File(path);
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close();
            logger.info("Done");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    ;
}

