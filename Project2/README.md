# OOAD Project 2

### Names of team members: 
Thadeus Labuszewski, Ali Ostlund, Federico Aragon

### Comments:
None, this project was pretty straightforward and we simply followed the 
design outlined in the slides. The language we decided to use was Python 3 and
the enviornemnt was a Jupyter notebook. 

The strategy pattern we implemented is 
concerned with what the animals eat. An animal can either eat only vegetables 
(herbivore) meat (carnivore) or pet food (pet food). These algorithms are implemented
under the foodType class. Any time an Animal is instantiated, their eating behavior is 
determined based off this strategy pattern.

The obsever pattern we implemented was concerned with the ZooAnnouncer. First we had to make
the ZooKeeper observable which is why it has add, remove, and notify methods. Then we added
a Default Formatter which is the interface for the observers. Since we only needed on observer (ZooAnnoucer) there is only one obsever which is the ZooAnnouncer class. It only
has a notify method. Any time the ZooKeeper switches tasks, the ZooAnnouncer keeps track of
this and notifies via text output.

There is no special instructions to run our code. Just press the Run All Cells button
in the Jupyter Notebook.
