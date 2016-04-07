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
| R-5 | During initiation, if the software detects that the pressure at the VP transducer exceeds the upper pressure limit, then the software shall stop the BP and execute an alarm signal
| R-6 | During initiation, if the software detects that the pressure at the VP transducer falls below the lower pressure limit, then the software shall stop the BP and execute an alarm signal. |
| R-7 | During initiation, if the software detects that the pressure at the AP transducer exceeds the upper pressure limit, then the software shall stop the BP and execute an alarm signal |
| R-8 |During initiation, if the software detects that the pressure at the AP transducer falls below the lower pressure limit, then the software shall stop the BP and execute an alarm signal. |
| R-9 | While connecting the patient, if the software detects that the pressure at the VP transducer exceeds +450mmHg for more than 3 seconds, then the software shall stop the BP and execute an alarm signal. |
| R-11 | While connecting the patient, if the software detects that the pressure at the AP transducer falls below the lower pressure limit for more than 1 second, then the software shall stop the BP and execute an alarm signal. |
| R-12 | During reinfusion, if the software detects that the pressure at the VP transducer exceeds +350mmHg for more than 3 seconds, then the software shall stop the BP and execute an alarm signal. |
| R-13 | During reinfusion, if the software detects that the pressure at the AP transducer falls below -350mmHg for more than 1 second, then the software shall stop the BP and execute an alarm signal. |
| R-14 | While connecting the patient, the software shall monitor the blood flow in the EBC and if no flow is detected, then the software shall stop the BP and execute an alarm signal. The blood flow can be detected by measuring the pump rotations with the speed sensor of the BP. |
| R-15 |While connecting the patient, the software shall monitor the filling blood volume of the EBC and if the filling blood volume exceeds 400 mL, then the software shall stop the BP and execute an alarm signal. The blood volume can be detected by measuring the pump rotations with the speed sensor of the BP |
| R-16 | While connecting the patient, the software shall use a timeout of 310 seconds after the first start of the BP. After this timeout, the software shall change to the initiation phase.|
| R-17 | While connecting the patient, the software shall monitor the blood flow direction and if the reverse direction is detected, then the software shall stop the BP and execute an alarm signal. The blood flow direction can be detected by the direction sensor of the BP |
| R-23 | If the machine is in the preparation phase and performing rinsing of the EBC or if the machine is connecting the patient or if the machine is in the initiation phase or if the machine is in the reinfusion process, then the software shall monitor the flow through the SAD sensor and if the flow through the SAD sensor exceeds 1200 mL/min, then the software shall stop the BP and execute an alarm signal|
