package org.hoteia.qalingo.core.jms.notification.producer;

import org.hoteia.qalingo.core.jms.cacheserveurmanagement.listener.AbstractMessageJms;

public class EmailnotificationMessageJms extends AbstractMessageJms {

    private String emailType;
    
    public String getEmailType() {
        return emailType;
    }
    
    public void setEmailType(String emailType) {
        this.emailType = emailType;
    }
    
}
