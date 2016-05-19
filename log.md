#Meetings

## 19.05.16
With regards to the event of cleaning the blood: 'Just observing the evolution of the cleaning. Can be modelled with a differential equation?'

On the topic of Discrete to continuous - 'Interesting problem that should be discussed in the paper: When to add time? It it a seperate system or a refinement of the discrete system?'

On the presentation: 'Present main problem: System for cleaning the blood, questions of discrete to continuous, chemical problems, what I solved and how I solved it, Maybe I can solve X with Hybrid Event-B'

With regards to further work on the model: Try to implement more requirements into the model.

## 03.05.16
Base Event-B machine/refinements should perhaps contain the possible events of the system. After all the events are added we can begin introducing the physical limitations of the events (Bloodpump must be on, etc)
Should try and complete several Event-B models. Need to define a list of subjects to talk about in final report:
 - Abstract
  * Need safe medical devices that can pass certifications while abeiding by a budget.
 - Introduction
  * Active Medical Devices
   * Challenges regarding safety of system
   * Certification & Cost
  * Event-B - briefly what it does and how/why it helps + refinement (introduce Rodin and ProB for animation (?))
  * Co-modeling - Discrete events and continuous events together are co-modelling. (Hybrid Event-B)
 - References
  * Atif Mashkoor - the hemodialysis machine case study & Towards the Trustworthy Development of Active Medical Devices
  * (Rest of readings from summary)
 - Hemodialysis Machine - why it's needed, what it does, how it works.
 - Event-B in general - Why do people use it? What is the value generated?
  * Methods of composition - Abrial & Butler composition.
  * How to ensure the safety of the system - nothing bad ever happens
 - HD Event-B Model - Dicuss the model(s) created for modeling the HD machine and choice of abstraction on machines.
  * How we chose to refine the machine.
  * Our level of abstraction
  * How we ensured the safety of the machine.
  * How to add continuous events and variables to the model
 - Problems encountered
  * Not clear what the correct solution is until you have tried (and failed)
  * Rodin does not hide useless information (Machines become quickly unreadable)
  * Reformating or changing events/design come at a high time cost. Too much manual labour.
  * Editor in general - Adding/editing new (events/guards/actions) etc is over complicated.
 - Summary
  * Were we able to create a HD machine that satisfies the requirements?
  * Conclusion
  * Future work

  



## 12.04.16
System tries to maintain some percentage that the human is no longer able to maintain himself
Look at the global system that is simulating the kidney: What is the purpose of the machine? How is it interacting with the paitient?

Sketch of the system.
Introduce abstract events for differential equations. Evolutin of variables --> Continuously according to some kinds of equations. 

Sue Wen & Abrial : Is it co-simulation (B & MathWorks)?
Master --> Identify new problems. 

Start classical modelling. Validate system with values from real cases. Real data fed into system --> real time animations. FDA might have data available regarding dialysis of real patients.

Think global view: Mission of the system : Cleaning, purifying, the blood.

Note: Possible to connect animator with an AI that attempts to invalidate the system? Could automatically search an animation wrt some invariant/heuristic. 

## 08.04.16
Make a list of model variables needed for satisfying the requirements. 
Dealing with userinput - When nurse interacts -> Interactinos are safe: add informal requirements that the nurse knows how to operate the system. The system is only usable under ceirtain circumstances: Nurse needs training.

Choice of variable Initiation might be worng with regards to the domain (Orange colour for aircraft lock).
Cognitive science - The system should help the patient & the Nurse should contribute positively.

Rewrite requirements if they collide

Next meeting Thuesday, 12.05.2016

## 06.04.16 - Forth meeting

Next meeting scheduled for Friday 15th. 09:00

 - Different ways of composition
	* Abrial Composition
		* Might be too complicated/ inefficient
	* Butler Composition
		* Event sharing
		* Should read
* Rodin editor improvements
	* Not possible to hide events
		* Implement a *hidden* attribute to the XML?
		* Makes it hard to focus on a few events
* Keep method
         1. Refine a specific feature of an abstract machine. Refine until the feature is concrete. 
         2. Hide/ignore the refined events, variables and invariants. Then repeat step 1 with the refined machine.

**Why  do people want to use Event-B? What is the value generated?**

![System, requirements and Event-B link][SRB]
 - Create a link between requirements and code
	 - Re-engineer the system
		 - From the System we can extract the requirements
		 - From the requirements we can generate Event-B models
		 - From the Event-B models we can generate the System.
For certification of the system we can give a Certification company the Event-B models
 - They can Re-inject requirements to the model (Testing)
 - Peer review of the model
 - A software engineer may ask a proclaimed Event-B expert to model a certain system. The model returned is tested by the engineer. If all the tests pass then the engineer may infer that the Event-B expert is infact an expert.
	 - Only an example, not a reality.
 
**Comments on current model**

 - Attach requirements to Event-B model
	 - Link events to requirements with ProR?
 - Current model is observing from the outside and ``zooming'' in on features
 - Should add some physiological features to the system.
	 - Behaviour of the body
	 - Understand/control the system (?)

## 29.03.16 - Third meeting
New meeting scheduled for Monday, April 4th.
* Read 4 model variable by Parnas.
* Indentify how system is composed: What are environment variables and what are system variables (+ Events)
  * Develop system + Environment model
  * Idea: Naming convention. Use Env_x to represent variables from the environment and Mod_x for model variables
* Model with high levels of abstractions and then refine.
* Prove safety and liveness
* Model should use annotations, Pro-R. Tracing requirements (Use 2.8, 3.2 has poor plug-in support)
* Michael Jackson - Paper or book regarding Environment/ Modelling in general
* In final paper, include machines and contexts. Talk about the most interesting events and variables
* During development of model. Identify key design patters on how to model the system. Try to generalize the pattern so that they may be used on other systems.
* Identify key topics that are difficult to model in DE Event-B and (perhaps) talk about how Hybrid Event-B would solve this issue.
 * Simultaneous events, event ordering, readability of Machines
 
 **For next meeting**: Create an initial (or several) models for the dialysis machine. Send them to Mery before Sunday.

##16.02.16 - Second meeting 
* Read, then describe the HD machine at a high level. Use Diagrams to describe the system.
* Identify what will be in Event-B
* What refinement to use
* Conclusion - Add features to Event-B (Extensions)
* Summerize what is missing in Rodin-Platform for analysing the HD machine
* Study the required Event-B extensions
 * Elements that can not be modeled
  * What are other languages doing?
  * Study Hybrid Event-B
What can you do in B?
Provide tools for translation

##10.02.16 First meeting 
Given "The Hemodialysis Machine Case Study" by Atif Mashkoor. Scheduled new meeting for Wednesday 16 @ 10.30. Shall present a potential sketch for an event-b model.
Notes:
* Proposing models in Event-B and translate them to Machine deployable code
* Show events easily translated to C-code
* PEMS is Dialysis machine
* No requirement for a fully modeled system, but highly desireable.
* Final goal - Library of transformations
 
[SRB]: https://raw.githubusercontent.com/AndersCan/EventB-Thesis/master/report/latex/plantuml/SRB.png "System, Requirements and Event-B"
