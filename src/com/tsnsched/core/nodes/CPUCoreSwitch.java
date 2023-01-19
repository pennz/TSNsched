package com.tsnsched.core.nodes;

import com.tsnsched.core.components.Port;

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
