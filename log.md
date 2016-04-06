#Meetings
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
 

