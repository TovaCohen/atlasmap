/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Mon Mar 02 02:58:34 EST 2015
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import org.apache.camel.component.salesforce.api.PicklistEnumConverter;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Salesforce DTO for SObject Approval
 */
@XStreamAlias("Approval")
public class Approval extends AbstractSObjectBase {

    // ParentId
    private String ParentId;

    @JsonProperty("ParentId")
    public String getParentId() {
        return this.ParentId;
    }

    @JsonProperty("ParentId")
    public void setParentId(String ParentId) {
        this.ParentId = ParentId;
    }

    // Status
    @XStreamConverter(PicklistEnumConverter.class)
    private StatusEnum Status;

    @JsonProperty("Status")
    public StatusEnum getStatus() {
        return this.Status;
    }

    @JsonProperty("Status")
    public void setStatus(StatusEnum Status) {
        this.Status = Status;
    }

    // RequestComment
    private String RequestComment;

    @JsonProperty("RequestComment")
    public String getRequestComment() {
        return this.RequestComment;
    }

    @JsonProperty("RequestComment")
    public void setRequestComment(String RequestComment) {
        this.RequestComment = RequestComment;
    }

    // ApproveComment
    private String ApproveComment;

    @JsonProperty("ApproveComment")
    public String getApproveComment() {
        return this.ApproveComment;
    }

    @JsonProperty("ApproveComment")
    public void setApproveComment(String ApproveComment) {
        this.ApproveComment = ApproveComment;
    }

}