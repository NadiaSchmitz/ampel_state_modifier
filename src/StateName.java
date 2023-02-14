
public enum StateName {
	WAIT("--Rot-------- Warten"),
	READY("--Rot/Gelb--- Bereit"),
	DRIVE("--Grün------- Fahren"),
	STAY("--Gelb------- Gleich stehen bleiben");
	
	private String state_name;
	private String state_title;
	
	StateName(String state_title) {
       this.state_title = state_title;
    }
	
	public void setStateName(String state_name) {
		this.state_name = state_name;
	}
	
	public String getStateName() {
		return state_name;
	}
	
    public String getStateTitle() {
        return state_title;
    } 
}
