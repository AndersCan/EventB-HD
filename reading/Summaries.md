Summaries
==============
Short summaries of papers & books read throughout the internship.

##Cruise Control In Hybrid Event-B 
*Richard Banach & Michael Butler*
Case study proving the validity of the need for Hybrid Event-B (HB). Time is a first-class citizen of HB; all variables and and functions are functions of time. Time: Readonly, Clock: Value increases with time, but can be set by events.

Two types of variables: discrete and continuous. Continuous variables, and the events that modify them are, are marked as PLIANT. Pliant variables are normally set to Reals. Invariant: Hold for any given time. '!' and "?' used to mark inputs and outputs of events.  Allows solving of differential equations. 

Concludes that Hybrid event B was able to incorporate a closed loop controller without issue. Even though the model modeled was simplified. 

> "This gives strong encouragement for the development of mechanical
> support for the Hybrid Event-B framework in the future."

## A method to refine time constraints in event B framework
*Joris Rehm*
An extension to J.R. Abrial, D. Cansell and D. Mery Election protocol. A solution to message passing with time constraints within Event-B.  

> "The main idea is to guard events with a time constraint, therefore
> those events can be observed only when the system reaches a specific
> time. We call those times **active times** and we say that events will
> "process" it"

    tick_tock = 
      any tm where
      tm elementOf N and
      tm > time /\
        (at != {} ==> tm <= min(at))
      then
        time := tm
      end
Progress is only made when the set `at` (active times) is empty, or `tm` is less than `min(at)`.
Producer events add to the set `at` while consumers remove.

## Co-simulating Event-B and Continuous Models via FMI
*Vitaly Savics, Micahel Butler and John Colley*

Uses Event-B with Functional Mock-up Language (FMI). FMI basically provides C headers that need to ble implemented to use out Event-B system.  Event-B and FMI and budled to a FMU (.zip file) and simulated on a FMI compliant tool. Although I am not clear on how they connected Event-B to FMI they conclude the results as promising for future work.

## The hemodialysis machine case study
Case study showing the control of a hemodialysis machine. Provides helpful diagrams to show how a HD machine works. Contains the procedure from start to finish of dialysis treatment.
(Not a complete step-by-step list)
 1. Preperation - 
	 2. Self-test
	 3. Connecting concentrate
	 4. Setting rinsing paramaters
	 5. Inserting, rinsing and testing the tubing system
	 6. Preparing the heparin pump
	 7. Setting treatment parameters
	 8. Rinsing the dialyser
 2. Therapy Initiation
	 3. Connecting the patient and starting therapy
		 4. (Sequence of steps done by nurse)
	 4. During Therapy
		 5. Monitoring of the patient and safety ranges
 3. Ending
	 4. Reinfusion
	 5. Emptying the dialyser
	 6. Emptying the cartridge after dialyzer drain
	 7. Overview of therapy carried out

Also contains many safety requirements of the system. Most requirements dealing with allowable values. Concludes that case study can be used to develop models with a high-level of safety. Actual model implementation will require additional knowledge of dialysis machines. Specifically domain knowledge of certain medical equipment and their function.

## Formalizing Hybrid Systems with Event-B
*Jean-Raymond Abrial, Wen Su and Huibiao Zhu*
Development of hybrid systems in Event-B and the rodin platform. Uses the same approach as Action Systems. In short, continuous machines are a refinement of discrete machines. Basically he shows models where his machines are first created as DE machines, then the refines them and adds Continuous variables. 

Variables are converted to functions that return the full history of a single transformation. For example, the transformation from 0 to 1, 0 --> 1, is replaced by 0 --> 0.1, 0.1 --> 0.2 ..., 0.9 --> 1 (this range contains all reals between 0 and 1). All events are responsible for updating the time (now) for the system. Rodin does not support real numbers so the examples use integers. The continuous part does not include differential equation as is normal for hybrid systems. They also added some integer division axioms that are not true when dealing with integers (x != 0 ---> x * (y/x) = y)

## On fitting A Formal Method Into Practice
Article that shows the attempt of getting Bosch to adopt the usage of Event-B to their development methodology. Learn that the usage of Problem Frames provides a great bridge between Event-B and informal requirements; engineers had trouble linking the formal modals to their requirements. Problem Frames were developed by Michael Jackson. 

> Event-B With its tools Rodin and ProB can be useful for improving the quality of requirements and of models that can serve as blue print for implementations.  

## Hemodialysis Machine in Hybrid Event-B
Shows the potential of how one can use HE to model a dialysis machine.  Uses Multi Machine Event-B and connects these together by using a interface. This allows for the refinement of sub-components, instead of "concatenated" machines in vanilla Event-B. The interface that connects the machines defines shared variables that can be changed by the other events. 

## Functional Documents for Computer Systems
*David Lorge Parnas & Jan Madey*

Describes the documents: 
 - System Requirements
 - System Design
 - Software Requirements 
 - Software Behaviour Specification
 - Module Interface Specification
 - Module Internal Design

> A critical step in documenting the requirements of a computer system is the indentification of the encrionmental quantities to be measured or controlled and the representaion of those quantities by mathematucal variables. Environmental quantities include: physical props(temperatures and pressures), the readings of user-visible displays, adminstrative information (number of people assigned to a given task), and even the wishes aof a human user. 
...
Useful to characterise each environmental quantity as either monitored, controlled or both.

Monitored are what the user wants the system to monitor. Controlled are what the system can control. *m* is used to denote *monitored* while *c* denotes *controlled*.

Goal of the paper is to describe the contents of key computer system documents, not their form. They do not provide information on **how** to represent the data, only **what** should be represented.
