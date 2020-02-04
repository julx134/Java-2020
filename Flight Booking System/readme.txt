I have implemented a UI system in the main method. Note that the createFlights() method
will create 10 flights via a set of random paramaeters - see createFlights()

Therefore, when starting the program, there is a chance that all 10 flights will not
be created because somewhere along the way, a Flight class was created with the same
destinatiom and origin. NOTE: THE CODE STILL WORKS EVEN IF ALL 10 FLIGHTS DO NOT SHOW UP.

In addition, in order for the UI to work, I implemeted a userChoose() method that
handles all the UI interactivity. I could've put it under the main method but it would
look too ugly or unreadable. So for readability, I seperated the UI aspect. 
For marking purposes, please assume that the userChoose() method is part of the main method.

Thank you!!!

