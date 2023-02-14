
public class Ready implements State {
	
	//private final String STATE_NAME = "Ready";
	//private final String STATE_COLOR = "Red+Yellow";
	
	@Override
    public void nextState(Ampelcontrol ampelcontrol) {
		ampelcontrol.setState(new Drive());
    }
	
	@Override
    public String getStateName() {
        return StateName.DRIVE.getStateName();
    }
	
	@Override
    public String getStateTitle() {
        return StateName.DRIVE.getStateTitle();
    }

}
