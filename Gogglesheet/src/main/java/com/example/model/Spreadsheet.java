package com.example.model;

import java.util.HashMap;
import java.util.Map;

public class Spreadsheet {
    private Map<String, Cell> cells = new HashMap<>();
    
    public void setCellValue(String cellId, String value) {
        cells.put(cellId, new Cell(value));
    }
    
    public String getCellValue(String cellId) {
        return cells.getOrDefault(cellId, new Cell("")).getValue();
    }
}