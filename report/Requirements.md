#Requirements
Requirements from taken from the HD paper and categorized to their controlled element.
## Blood Pump
| Requirement | Description |
---|---
|S-4 | The BP is stopped when either the VRD detects blood or the BP has transported a predefined volume. |
|S-6 | The BP cannot be used for infusion outside the initiation phase, e.g., during saline infusion. |
|S-7 | When the blood flow stops because of BP failure during loss of main power, the blood should be returned to the patient manually. |
|S-11|  Once ``empty dialyzer'' has been confirmed, the BP cannot be started anymore. |
|R-2 | During initiation, the software shall monitor the blood flow in the EBC and if no flow is detected for more than 120 seconds, then the software shall stop the BP and execute an alarm signal. |
|R-3 | During initiation, if the machine is not in bypass, then the software shall monitor the blood flow in the EBC and if the actual blood flow is less than 70% of the set blood flow, then the software shall execute an alarm signal. |
|R-4 | During initiation, the software shall monitor the rotation direction of the BP and if the software detects that the BP rotates backwards, then the software shall stop the BP and execute an alarm signal. |
