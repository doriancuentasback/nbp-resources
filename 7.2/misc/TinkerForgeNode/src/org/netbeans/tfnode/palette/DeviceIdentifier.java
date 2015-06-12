package org.netbeans.tfnode.palette;

import com.tinkerforge.Device;

public class DeviceIdentifier {
    
    String name;
    String uid;
    short stackId;
    Device deviceType;

    public DeviceIdentifier(String name, String uid, short stackId) {
        this.name = name;
        this.uid = uid;
        this.stackId = stackId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public short getStackId() {
        return stackId;
    }

    public void setStackId(short stackId) {
        this.stackId = stackId;
    }

    public Device getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(Device deviceType) {
        this.deviceType = deviceType;
    }

}
