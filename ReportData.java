/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author adivh
 */
    public class ReportData {
    
    static int index=0;//keeping track of the number of objects already made and belongs to the class
    
    private String productCode;
    private String productName;
    private double warranty;
    private int category;
    private double price;
    private int stockLevels;
    private String supplier;
    
    
    public ReportData(String productCode,String productName,double warranty,int category,
            double  price,int stockLevels,String supplier){
        this.productCode=productCode;
        this.productName=productName;
        this.warranty=warranty;
        this.category=category;
        this.price=price;
        this.stockLevels=stockLevels;
        this.supplier=supplier;    
    }
    
    //getters
    public String getProductCode(){
        return this.productCode;
    }
    public String getProductName(){
        return this.productName;
    }
    public double getWarranty(){
        return this.warranty;
    }
    public int getCategory(){
        return this.category;
    }
    public double getPrice(){
        return this.price;
    }
    public int getstockLevels(){   
        return this.stockLevels;
    }
    public String getSupplier(){
        return this.supplier;
    }
    
    //setters
    public void setProductCode(String code){
        this.productCode=code;
    }
    public void setProductName(String prodName){
        this.productName=prodName;
    }
    public void setWarranty(int warranty){
        this.warranty=warranty;
    }
    public void setCategory(int cat){
        this.category=cat;
    }
    public void setPrice(double p){
        this.price=p;
    }
    public void setStockLevels(int stock){
        this.stockLevels=stock;
    }
    public void setSupplier(String supp){
        this.supplier=supp;
    }
    }







