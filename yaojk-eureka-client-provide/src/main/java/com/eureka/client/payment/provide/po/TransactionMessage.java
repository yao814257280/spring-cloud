package com.eureka.client.payment.provide.po;

import java.util.Date;
import javax.persistence.*;

@Table(name = "transaction_message")
public class TransactionMessage {
    @Id
    private Long id;

    /**
     * 消息内容，以json数据存储
     */
    private String message;

    /**
     * 队列名称
     */
    private String queue;

    /**
     * 0:等待消费，1:已消费，2:已死亡
     */
    private Byte status;

    /**
     * 发送消息的系统
     */
    @Column(name = "send_system")
    private String sendSystem;

    /**
     * 最近发送消费时间
     */
    @Column(name = "send_time")
    private Date sendTime;

    /**
     * 重复发送消息次数
     */
    @Column(name = "send_count")
    private Integer sendCount;

    /**
     * 消费消息的系统
     */
    @Column(name = "customer_system")
    private String customerSystem;

    /**
     * 消费时间
     */
    @Column(name = "customer_time")
    private Date customerTime;

    /**
     * 死亡时间
     */
    @Column(name = "die_time")
    private Date dieTime;

    /**
     * 死亡次数条件，由使用方决定，默认发送10还没被消费则标记为死亡，人工介入
     */
    @Column(name = "die_count")
    private Integer dieCount;

    /**
     * 写入时间
     */
    private Date ctime;

    /**
     * 更新时间
     */
    private Date utime;

    public static final String ID = "id";

    public static final String DB_ID = "id";

    public static final String MESSAGE = "message";

    public static final String DB_MESSAGE = "message";

    public static final String QUEUE = "queue";

    public static final String DB_QUEUE = "queue";

    public static final String STATUS = "status";

    public static final String DB_STATUS = "status";

    public static final String SEND_SYSTEM = "sendSystem";

    public static final String DB_SEND_SYSTEM = "send_system";

    public static final String SEND_TIME = "sendTime";

    public static final String DB_SEND_TIME = "send_time";

    public static final String SEND_COUNT = "sendCount";

    public static final String DB_SEND_COUNT = "send_count";

    public static final String CUSTOMER_SYSTEM = "customerSystem";

    public static final String DB_CUSTOMER_SYSTEM = "customer_system";

    public static final String CUSTOMER_TIME = "customerTime";

    public static final String DB_CUSTOMER_TIME = "customer_time";

    public static final String DIE_TIME = "dieTime";

    public static final String DB_DIE_TIME = "die_time";

    public static final String DIE_COUNT = "dieCount";

    public static final String DB_DIE_COUNT = "die_count";

    public static final String CTIME = "ctime";

    public static final String DB_CTIME = "ctime";

    public static final String UTIME = "utime";

    public static final String DB_UTIME = "utime";

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取消息内容，以json数据存储
     *
     * @return message - 消息内容，以json数据存储
     */
    public String getMessage() {
        return message;
    }

    /**
     * 设置消息内容，以json数据存储
     *
     * @param message 消息内容，以json数据存储
     */
    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    /**
     * 获取队列名称
     *
     * @return queue - 队列名称
     */
    public String getQueue() {
        return queue;
    }

    /**
     * 设置队列名称
     *
     * @param queue 队列名称
     */
    public void setQueue(String queue) {
        this.queue = queue == null ? null : queue.trim();
    }

    /**
     * 获取0:等待消费，1:已消费，2:已死亡
     *
     * @return status - 0:等待消费，1:已消费，2:已死亡
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置0:等待消费，1:已消费，2:已死亡
     *
     * @param status 0:等待消费，1:已消费，2:已死亡
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 获取发送消息的系统
     *
     * @return send_system - 发送消息的系统
     */
    public String getSendSystem() {
        return sendSystem;
    }

    /**
     * 设置发送消息的系统
     *
     * @param sendSystem 发送消息的系统
     */
    public void setSendSystem(String sendSystem) {
        this.sendSystem = sendSystem == null ? null : sendSystem.trim();
    }

    /**
     * 获取最近发送消费时间
     *
     * @return send_time - 最近发送消费时间
     */
    public Date getSendTime() {
        return sendTime;
    }

    /**
     * 设置最近发送消费时间
     *
     * @param sendTime 最近发送消费时间
     */
    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    /**
     * 获取重复发送消息次数
     *
     * @return send_count - 重复发送消息次数
     */
    public Integer getSendCount() {
        return sendCount;
    }

    /**
     * 设置重复发送消息次数
     *
     * @param sendCount 重复发送消息次数
     */
    public void setSendCount(Integer sendCount) {
        this.sendCount = sendCount;
    }

    /**
     * 获取消费消息的系统
     *
     * @return customer_system - 消费消息的系统
     */
    public String getCustomerSystem() {
        return customerSystem;
    }

    /**
     * 设置消费消息的系统
     *
     * @param customerSystem 消费消息的系统
     */
    public void setCustomerSystem(String customerSystem) {
        this.customerSystem = customerSystem == null ? null : customerSystem.trim();
    }

    /**
     * 获取消费时间
     *
     * @return customer_time - 消费时间
     */
    public Date getCustomerTime() {
        return customerTime;
    }

    /**
     * 设置消费时间
     *
     * @param customerTime 消费时间
     */
    public void setCustomerTime(Date customerTime) {
        this.customerTime = customerTime;
    }

    /**
     * 获取死亡时间
     *
     * @return die_time - 死亡时间
     */
    public Date getDieTime() {
        return dieTime;
    }

    /**
     * 设置死亡时间
     *
     * @param dieTime 死亡时间
     */
    public void setDieTime(Date dieTime) {
        this.dieTime = dieTime;
    }

    /**
     * 获取死亡次数条件，由使用方决定，默认发送10还没被消费则标记为死亡，人工介入
     *
     * @return die_count - 死亡次数条件，由使用方决定，默认发送10还没被消费则标记为死亡，人工介入
     */
    public Integer getDieCount() {
        return dieCount;
    }

    /**
     * 设置死亡次数条件，由使用方决定，默认发送10还没被消费则标记为死亡，人工介入
     *
     * @param dieCount 死亡次数条件，由使用方决定，默认发送10还没被消费则标记为死亡，人工介入
     */
    public void setDieCount(Integer dieCount) {
        this.dieCount = dieCount;
    }

    /**
     * 获取写入时间
     *
     * @return ctime - 写入时间
     */
    public Date getCtime() {
        return ctime;
    }

    /**
     * 设置写入时间
     *
     * @param ctime 写入时间
     */
    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    /**
     * 获取更新时间
     *
     * @return utime - 更新时间
     */
    public Date getUtime() {
        return utime;
    }

    /**
     * 设置更新时间
     *
     * @param utime 更新时间
     */
    public void setUtime(Date utime) {
        this.utime = utime;
    }
}