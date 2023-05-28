/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.db.crm;

/**
 *
 * 顧客データ管理用の、サービスアカウント情報
 */
public class ServiceAccount {
    public int id;
    public String name;
    public String tel;
    public String deviceNumber;
    public String mailAddress;
    public ServiceAccount(
            int _id, 
            String _name, 
            String _tel, 
            String _deviceNumber,
            String _mailAddress
    ) {
        this.id = _id;
        this.name = _name;
        this.tel = _tel;
        this.deviceNumber = _deviceNumber;
        this.mailAddress = _mailAddress;
    }
}
