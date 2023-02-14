import java.util.Date;
import java.util.Timer;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import static java.util.concurrent.TimeUnit.SECONDS;

public class AmpelTest {

	public static void main(String[] args) {
				
		Ampelcontrol ampelcontrol = new Ampelcontrol();
		ampelcontrol.setState(new Wait());
		//Timer timer = new Timer();
		
		System.out.println(new Date() + " " +  ampelcontrol.getStateTitle());

        final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
	
        final Runnable runnable = new Runnable() {
        	long time_to[] = {55, 60, 90, 100};
            int countdownStarter = 0;

            public void run() {

                System.out.println(countdownStarter);
                countdownStarter++;
                
                for (int i = 0; i < 4; i++) {
	                if (countdownStarter == time_to[i]) {
	                	System.out.println("State " + " " + countdownStarter + " " + time_to[i]);
	                	System.out.println(new Date() + " " +  ampelcontrol.getStateTitle());
	                	ampelcontrol.nextState();
	                	
	                	time_to[i] = time_to[i] + 100;
	                	System.out.println(time_to[i]);
	                	if (i == 3) {
	                		i = 0;
	                	}
	                }
	                
	                
                }
            }
        };
        scheduler.scheduleAtFixedRate(runnable, 0, 1, SECONDS);
	}

}


