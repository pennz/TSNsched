package com.tsnsched.core.nodes;

import com.tsnsched.core.components.Port;
import java.util.ArrayList;

public class CPUCoreSwitch extends TSNSwitch {

  public CPUCoreSwitch(String name) { super(name); }

  public CPUCoreSwitch(String name, double maxPacketSize, double timeToTravel,
                       double portSpeed, double gbSize,
                       double cycleDurationLowerBound,
                       double cycleDurationUpperBound) {
    super(name, maxPacketSize, timeToTravel, portSpeed, gbSize,
          cycleDurationLowerBound, cycleDurationUpperBound);
  }
}

public class CPUCoreSwitchSet extends TSNSwitch {
  private ArrayList<CPUCoreSwitch> coreSwitchSet;

  public CPUCoreSwitchSet(String name, int setSize, double maxPacketSize,
                          double timeToTravel, double portSpeed, double gbSize,
                          double cycleDurationLowerBound,
                          double cycleDurationUpperBound) {
    ArrayList<CPUCoreSwitch> coreSwitchSet = new ArrayList<CPUCoreSwitch>();
    for (int i = 0; i < setSize; i++) {
      coreSwitchSet.add(CPUCoreSwitch(
          name + "_" + i, maxPacketSize, timeToTravel, portSpeed, gbSize,
          cycleDurationLowerBound, cycleDurationUpperBound));
    }
    // cycle, same start and same duration. And for slots, it can not overlap
  }
}
