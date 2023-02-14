
public interface State {
	
    String getStateName();
    String getStateTitle();
    
    void nextState(Ampelcontrol ampelcontrol);
 
}