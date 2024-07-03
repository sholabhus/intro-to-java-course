package com.cbfacademy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileExtension {

    //`boolean check(String filename)`
 //`Map<String, int> map(List<String> filenames)
public static boolean check(String filename)throws FilenameException{
    String fileExtension =".java";

    if(filename == null || filename.isEmpty()) {
        throw new FilenameException("file name can't be null or empty ");
    }
        return filename.endsWith(fileExtension);
}


public static Map<String, Integer> map(List<String> filenames) {
       Map<String, Integer> fileNameMap = new HashMap<>();
       for(String fileName :filenames){  
        try{
            boolean isValid =check(fileName);
            fileNameMap.put(fileName, isValid ? 1:0);
        } catch(FilenameException exception) {
            fileNameMap.put(fileName, -1);
        }
       }
       return fileNameMap;
 
    }
    
}
