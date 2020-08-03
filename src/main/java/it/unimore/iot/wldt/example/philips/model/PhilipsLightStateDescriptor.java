package it.unimore.iot.wldt.example.philips.model;

/**
 * Author: Marco Picone, Ph.D. (marco.picone@unimore.it)
 * Date: 24/07/2020
 * Project: Philips Hue Digital Twin Example - White Label Digital Twin - Java Framework
 */
public class PhilipsLightStateDescriptor {

    private boolean on = false;

    public PhilipsLightStateDescriptor() {
    }

    public PhilipsLightStateDescriptor(boolean on) {
        this.on = on;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PhilipsLightStateDescriptor{");
        sb.append("on=").append(on);
        sb.append('}');
        return sb.toString();
    }
}
