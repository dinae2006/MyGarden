package com.example.mygarden;

public class Item {
    private int imageID;
    private String storeName;
    private String plantName;
    private String describe;
    private String key;

    public Item() {
    }

    public Item(int imageID, String storeName, String plantName, String describe, String key) {
        this.imageID = imageID;
        this.storeName = storeName;
        this.plantName = plantName;
        this.describe = describe;
        this.key = key;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getPlantName() {
        return plantName;
    }

    public void setPlantName(String plantName) {
        this.plantName = plantName;
    }


    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }
}
