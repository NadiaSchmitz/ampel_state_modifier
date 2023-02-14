
public class Stay implements State {

	//private final String STATE_NAME = "Stay";
	//private final String STATE_COLOR = "Yellow";
	
	@Override
    public void nextState(Ampelcontrol ampelcontrol) {
		ampelcontrol.setState(new Wait());
    }
	
	@Override
    public String getStateName() {
        return StateName.WAIT.getStateName();
    }
	
	@Override
    public String getStateTitle() {
        return StateName.WAIT.getStateTitle();
    }

}
