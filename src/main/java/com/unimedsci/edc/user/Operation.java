package com.unimedsci.edc.user;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: huleehom
 * Date: 13-5-14
 * Time: PM9:51
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Operation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int operationId;

    @Column
    private String name;

    public int getOperationId() {
        return operationId;
    }

    public void setOperationId(int operationId) {
        this.operationId = operationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
