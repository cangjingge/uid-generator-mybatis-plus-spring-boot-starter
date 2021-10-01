package com.chungkui.uid.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;


import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author lyr
 * @since 2020-10-26
 */

@TableName("WORKER_NODE")
public class WorkerNode  {

    private static final long serialVersionUID = 1L;

    /**
     * auto increment id
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Long id;

    /**
     * host name
     */
    @TableField("HOST_NAME")
    private String hostName;

    /**
     * port
     */
    @TableField("PORT")
    private String port;

    /**
     * node type: ACTUAL or CONTAINER
     */
    @TableField("TYPE")
    private Integer type;

    /**
     * launch date
     */
    @TableField("LAUNCH_DATE")
    private LocalDate launchDate;

    /**
     * modified time
     */
    @TableField("MODIFIED")
    private LocalDateTime modified;

    /**
     * created time
     */
    @TableField("CREATED")
    private LocalDateTime created;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public LocalDate getLaunchDate() {
        return launchDate;
    }

    public void setLaunchDate(LocalDate launchDate) {
        this.launchDate = launchDate;
    }

    public LocalDateTime getModified() {
        return modified;
    }

    public void setModified(LocalDateTime modified) {
        this.modified = modified;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }
}
