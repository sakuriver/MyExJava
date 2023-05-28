/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.network.client;

/**
 * SDKとして提供する側のタスクサービスへの接続クライアントクラス
 */
public class TaskConnectClient {
    
    public String QueuePath(String project, String queue, String location ) {
        return "";
    }
    
    /**
     *@return  string
     *@param  task
     *@param parent
     */
    public String CreateTask(String task, String parent) {
        return task + parent;
    }
}
