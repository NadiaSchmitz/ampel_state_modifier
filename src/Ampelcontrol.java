import java.time.Duration;
import java.time.LocalTime;

public class Ampelcontrol {

	private State state;
	
	public void nextState() {
		state.nextState(this);
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public State getState() {
		return state;
	}
	
	public String getStateName() {
		return state.getStateName();
	}
	
	public String getStateTitle() {
		return state.getStateTitle();
	}

}