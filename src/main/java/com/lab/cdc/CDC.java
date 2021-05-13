package com.lab.cdc;

public class CDC {
    private String sent;
    private String headline;
    private String description;
    private String alert_disease;
    private String areaDesc;
    private String circle;

    public String getSent() {
        return sent;
    }

    public String getHeadline() {
        return headline;
    }

    public String getDescription() {
        return description;
    }

    public String getAlert_disease() {
        return alert_disease;
    }

    public String getAreaDesc() {
        return areaDesc;
    }

    public String getCircle() {
        return circle;
    }

    @Override
    public String toString() {
        return "CDC{" + "sent=" + sent + ", headline=" + headline + ", description=" + description + ", alert_disease=" + alert_disease + ", areaDesc=" + areaDesc + ", circle=" + circle + '}';
    }
   
    
}
