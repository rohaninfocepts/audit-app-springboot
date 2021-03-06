package com.audit.app.auditform.model.Response;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.sql.Date;

/**
 * Created by Infocepts India in 2017.
 */
@Component
@Scope (BeanDefinition.SCOPE_PROTOTYPE)
public class Project
{
    private int id;
    private String name;
    private String projectMgr;
    private Date scheduledOn;
    private Date conductedOn;
    private String auditor;
    private String auditee;

    public int getId ()
    {
        return id;
    }

    public void setId (final int id)
    {
        this.id = id;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (final String name)
    {
        this.name = name;
    }

    public String getProjectMgr ()
    {
        return projectMgr;
    }

    public void setProjectMgr (final String projectMgr)
    {
        this.projectMgr = projectMgr;
    }

    public Date getScheduledOn ()
    {
        return scheduledOn;
    }

    public void setScheduledOn (final Date scheduledOn)
    {
        this.scheduledOn = scheduledOn;
    }

    public Date getConductedOn ()
    {
        return conductedOn;
    }

    public void setConductedOn (final Date conductedOn)
    {
        this.conductedOn = conductedOn;
    }

    public String getAuditor ()
    {
        return auditor;
    }

    public void setAuditor (final String auditor)
    {
        this.auditor = auditor;
    }

    public String getAuditee ()
    {
        return auditee;
    }

    public void setAuditee (final String auditee)
    {
        this.auditee = auditee;
    }

    @Override
    public String toString ()
    {
        return "Project{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", projectMgr='" + projectMgr + '\'' +
                ", scheduledOn=" + scheduledOn +
                ", conductedOn=" + conductedOn +
                ", auditor='" + auditor + '\'' +
                ", auditee='" + auditee + '\'' +
                '}';
    }
}
