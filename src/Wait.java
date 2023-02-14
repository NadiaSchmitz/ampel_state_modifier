
public class Wait implements State {
	
	//private final String STATE_NAME = "Wait"; 
	//private final String STATE_COLOR = "Red";
	
	@Override
    public void nextState(Ampelcontrol ampelcontrol) {
		ampelcontrol.setState(new Ready());
    }
	
	@Override
    public String getStateName() {
        return StateName.READY.getStateName();
    }
	
	@Override
    public String getStateTitle() {
        return StateName.READY.getStateTitle();
    }

}
