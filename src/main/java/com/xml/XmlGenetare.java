package com.xml;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

public class XmlGenetare {
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
        FileOutputStream xmlFile = null;
        try {
            xmlFile = new FileOutputStream("listStructure.xml");
        } catch (FileNotFoundException e) {
            e.getMessage();
        }
        java.beans.XMLEncoder xmlEncoder = new java.beans.XMLEncoder(xmlFile);
        xmlEncoder.writeObject(list);
        xmlEncoder.close();
    }
}
