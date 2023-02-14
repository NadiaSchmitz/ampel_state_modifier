
public class Drive implements State {

	//private final String STATE_NAME = "Drive";
	//private final String STATE_COLOR = "Green";
	
	@Override
    public void nextState(Ampelcontrol ampelcontrol) {
		ampelcontrol.setState(new Stay());
    }
	
	@Override
    public String getStateName() {
        return StateName.STAY.getStateName();
    }
	
	@Override
    public String getStateTitle() {
        return StateName.STAY.getStateTitle();
    }

}
