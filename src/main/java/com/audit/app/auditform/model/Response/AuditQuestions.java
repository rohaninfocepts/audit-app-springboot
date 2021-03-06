package com.audit.app.auditform.model.Response;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by Infocepts India in 2017.
 */
@Component
@Scope (BeanDefinition.SCOPE_PROTOTYPE)
public class AuditQuestions
{
    private int auditd;
    private int quetionId;
    private String question;
    private int ComplianceStatus;
    private String remark;
    private int projectId;
    private int weightage;


    public int getAuditd ()
    {
        return auditd;
    }

    public void setAuditd (final int auditd)
    {
        this.auditd = auditd;
    }

    public int getQuetionId ()
    {
        return quetionId;
    }

    public void setQuetionId (final int quetionId)
    {
        this.quetionId = quetionId;
    }

    public String getQuestion ()
    {
        return question;
    }

    public void setQuestion (final String question)
    {
        this.question = question;
    }

    public int getComplianceStatus ()
    {
        return ComplianceStatus;
    }

    public void setComplianceStatus (final int complianceStatus)
    {
        ComplianceStatus = complianceStatus;
    }

    public String getRemark ()
    {
        return remark;
    }

    public void setRemark (final String remark)
    {
        this.remark = remark;
    }

    public int getProjectId ()
    {
        return projectId;
    }

    public void setProjectId (final int projectId)
    {
        this.projectId = projectId;
    }

    public int getWeightage ()
    {
        return weightage;
    }

    public void setWeightage (final int weightage)
    {
        this.weightage = weightage;
    }

    @Override
    public String toString ()
    {
        return "AuditQuestions{" +
                "auditd=" + auditd +
                ", quetionId=" + quetionId +
                ", question='" + question + '\'' +
                ", ComplianceStatus=" + ComplianceStatus +
                ", remark='" + remark + '\'' +
                ", projectId=" + projectId +
                ", weightage=" + weightage +
                '}';
    }
}
