/**
 * 
 */
package KI307.Bazhulin.Lab3;

import java.io.FileNotFoundException;

/**
 * Interface <code>Mission</code> implements mission for spaceship
 */
interface Mission
{
	/**
	 * Method taking off a spaceship
	 */
	void TakeOff();
	
	/**
	 * Method landing a spaceship 
	 */
	void Land();
	
	/**
	 * Method returns flight status
	 * @return flight status
	 */
	boolean getStatus();
}

/**
 * Class <code>ReusableSpaceship</code> implements reusable spaceship
 * @author SERHIY BAZHULIN
 * @version 1.0
 */
public class ReusableSpaceship extends Spaceship implements Mission {

	private int flightsCount;
	private boolean inMission;
	
	/**
	 * Constructor
	 * @throws FileNotFoundException
	 */
	public ReusableSpaceship() throws FileNotFoundException {
		// TODO Auto-generated constructor stub
		super();
		this.flightsCount=0;
	}
	
	/**
	 * Constructor
	 * @param fuel
	 * @param flightsCount
	 * @throws FileNotFoundException
	 */
	public ReusableSpaceship(double fuel, int flightsCount) throws FileNotFoundException {
		// TODO Auto-generated constructor stub
		super(fuel);
		this.flightsCount=flightsCount;
	}
	
	/**
	 * Method set amount of flights
	 * @param count
	 */
	public void setFlightsCount(int count)
	{
		this.flightsCount=count;
	}
	
	/**
	 * Method get flights count
	 * @return Flights count
	 */
	public int getFlightsCount()
	{
		return this.flightsCount;
	}

	@Override
	public void StartSpaceship() {
		// TODO Auto-generated method stub
		engine.StartEngine();
		fout.print("Engine of reusable spaceship was started\n");
	}

	@Override
	public void SwitchOffSapceship() {
		// TODO Auto-generated method stub
		engine.SwitchOffEngine();
		fout.print("Engine of reusable spaceship was switched off\n");
	}

	
	@Override
	public void RefuelSpaceship(double fuel) {
		// TODO Auto-generated method stub
		engine.Refuel(fuel);
		fout.print("Engine of reusable spaceship was refuel: "+fuel+"\n");
	}

	@Override
	public void TakeOff() {
		// TODO Auto-generated method stub
		this.inMission = true;
		fout.print("Reusable spaceship is taking off\n");
	}

	@Override
	public void Land() {
		// TODO Auto-generated method stub
		this.inMission = false;
		this.flightsCount++;
		fout.print("Reusable spaceship is landing\n");
	}

	@Override
	public boolean getStatus() {
		// TODO Auto-generated method stub
		return this.inMission;
	}

	
}
