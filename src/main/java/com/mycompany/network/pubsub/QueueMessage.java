/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.network.pubsub;

/**
 * キューでやり取りするデータの構造
 */
public class QueueMessage {
    public String name;
    public int state;
    public String commandMessage;
    public String description;
    public MessageTopic target;
    public int execCode;
}
