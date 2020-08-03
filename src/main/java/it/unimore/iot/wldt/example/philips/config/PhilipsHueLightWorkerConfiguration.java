package it.unimore.iot.wldt.example.philips.config;

import it.unimore.dipi.iot.wldt.worker.WldtWorkerConfiguration;

/**
 * Author: Marco Picone, Ph.D. (marco.picone@unimore.it)
 * Date: 24/07/2020
 * Project: Philips Hue Digital Twin Example - White Label Digital Twin - Java Framework
 */
public class PhilipsHueLightWorkerConfiguration implements WldtWorkerConfiguration {

    private String bridgeAddress;
    private String username;

    public PhilipsHueLightWorkerConfiguration() {
    }

    public PhilipsHueLightWorkerConfiguration(String bridgeAddress, String username) {
        this.bridgeAddress = bridgeAddress;
        this.username = username;
    }

    public String getBridgeAddress() {
        return bridgeAddress;
    }

    public void setBridgeAddress(String bridgeAddress) {
        this.bridgeAddress = bridgeAddress;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PhilipsHueWorkerConfiguration{");
        sb.append("bridgeAddress='").append(bridgeAddress).append('\'');
        sb.append(", username='").append(username).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
