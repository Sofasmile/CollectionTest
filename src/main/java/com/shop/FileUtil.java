package com.shop;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.xml.XmlGenetare;
import org.apache.log4j.Logger;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
    private static final Logger LOGGER = Logger.getLogger(XmlGenetare.class.getName());
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().setDateFormat("dd/MM/yyyy").create();

    public static void writeToFile(List list, String filePath) {
        try (Writer writer = new FileWriter(filePath)) {
            GSON.toJson(list, writer);
        } catch (IOException e) {
            LOGGER.info(e.getMessage());
        }
    }

    public static List<Fruit> readFromFile(String filePath) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            Type fruitListType = new TypeToken<ArrayList<Fruit>>() {
            }.getType();
            return GSON.fromJson(bufferedReader, fruitListType);
        } catch (IOException e) {
            LOGGER.info(e.getMessage());
            return null;
        }
    }
}
