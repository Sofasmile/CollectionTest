package com.xml;

import org.apache.log4j.Logger;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.beans.XMLEncoder;

public class XmlGenetare {
    private static final Logger LOGGER = Logger.getLogger(XmlGenetare.class.getName());

    public void makeMultiLayerStructure() {
        List<Map<List<Set<Integer>>, String>> listStructure = new ArrayList<>();
        Integer number = 6;
        Set<Integer> set = new HashSet<>(number);
        List<Set<Integer>> list = new ArrayList<>();
        list.add(set);
        Map<List<Set<Integer>>, String> map = new HashMap<>();
        map.put(list, "First");
        listStructure.add(map);
        makeXmlFile(listStructure);
    }

    private void makeXmlFile(List list) {
        try (FileOutputStream xmlFile = new FileOutputStream("listStructure.xml")) {
            XMLEncoder xmlEncoder = new XMLEncoder(xmlFile);
            xmlEncoder.writeObject(list);
        } catch (IOException e) {
            LOGGER.info(e.getMessage());
        }
    }
}
