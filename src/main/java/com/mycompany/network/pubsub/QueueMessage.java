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
    /**
     * キューメッセージ情報
     * @param _name            名称
     * @param _state           状態
     * @param _commandMessage  コマンドメッセージ文字列
     * @param _description     詳細文
     * @param _target          メッセージを送信するときのトピック情報
     * @param _execCode        実行コード
     */
    public QueueMessage(
        String _name,
        int _state,
        String _commandMessage,
        String _description,
        MessageTopic _target,
        int _execCode
    ) {
        this.name = _name;
        this.state = _state;
        this.commandMessage = _commandMessage;
        this.description = _description;
        this.target = _target;
        this.execCode = _execCode;
    }
}