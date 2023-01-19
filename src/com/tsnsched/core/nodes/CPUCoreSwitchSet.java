package com.tsnsched.core.nodes;

import java.util.ArrayList;

public class CPUCoreSwitchSet extends TSNSwitch {
/**
	 * 
	 */
	private static final long serialVersionUID = 2633892673530982154L;
private ArrayList<CPUCoreSwitch> coreSwitchSet;
  public CPUCoreSwitchSet(String name) { super(name); }
  
  public CPUCoreSwitchSet(String name, int setSize, double maxPacketSize,
                          double timeToTravel, double portSpeed, double gbSize,
                          double cycleDurationLowerBound,
                          double cycleDurationUpperBound) {
	super(name, maxPacketSize, timeToTravel, portSpeed, gbSize,
	            cycleDurationLowerBound, cycleDurationUpperBound);
    ArrayList<CPUCoreSwitch> coreSwitchSet = new ArrayList<CPUCoreSwitch>();
    for (int i = 0; i < setSize; i++) {
      coreSwitchSet.add(new CPUCoreSwitch(
          name + "_" + i, maxPacketSize, timeToTravel, portSpeed, gbSize,
          cycleDurationLowerBound, cycleDurationUpperBound));
    }
    // cycle, same start and same duration. And for slots, it can not overlap
    
    // how is port added? by hand, or by network configuration. For CPU, it is APP->CPU->Switch
  }
}