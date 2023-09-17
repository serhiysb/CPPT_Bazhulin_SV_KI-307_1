/**
 * Lab3 package
 */
package KI307.Bazhulin.Lab2;

import java.io.*;

/**
 * Class <code>Spaceship</code> implements spaceship
 * @author SERHIY BAZHULIN
 * @version 1.0
 */
public class Spaceship  {
	private Engine engine;
	private ControlPanel controlPanel;
	private Door door;
	private PrintWriter fout;
	
	/**
	 * Constructor
	 * @throws FileNotFoundException
	 */
	public Spaceship() throws FileNotFoundException
	{
		engine = new Engine();
		controlPanel = new ControlPanel();
		door = new Door();
		
		fout = new PrintWriter(new File("Log.txt"));
	}
	
	/**
	 * Constructor
	 * @param <code>fuel</code> Fuel of engine
	 * @throws FileNotFoundException
	 */
	public Spaceship(double fuel) throws FileNotFoundException
	{
		engine = new Engine(fuel);
		controlPanel = new ControlPanel();
		door = new Door();
		
		fout = new PrintWriter(new File("Log.txt"));
	}
	
	/**
	 * Method implements fuel of engine in spaceship
	 * @param <code>fuel</code> Fuel of engine in spaceship
	 */
	public void RefuelSpaceship(double fuel)
	{
		engine.Refuel(fuel);
		
		fout.print("Engine refuel: "+fuel+"\n");
	}
	
	/**
	 * Method starts the engine
	 */
	public void StartSpaceship()
	{
		if(engine.StartEngine())
			fout.print("Engine was started\n");
		else
			fout.print("Fuel is not enough for started\n");
	}
	
	/**
	 * Method switches off the engine
	 */
	public void SwitchOffSapceship()
	{
		engine.SwitchOffEngine();
		fout.print("Engine was switched off\n");
	}
	
	/**
	 * Method returns fuel in engine
	 * @return Fuel of engine 
	 */
	public double getFuelStatus()
	{
		double fuel = engine.getFuel();
		return fuel;
	}
	
	/**
	 * Method returns status of engine
	 * @return Engine status
	 */
	public boolean getEngineSpaceshipStatus()
	{
		boolean status = engine.getEngineStatus();
		return status;
	}
	
	/**
	 * Method turns left a spaceship
	 */
	public void TurnLeftSpaceship()
	{
		controlPanel.TurnLeft();
		fout.print("Spaceship turned left\n");
	}
	
	/**
	 * Method turns right a spaceship
	 */
	public void TurnRightSpaceship()
	{
		controlPanel.TurnRight();
		fout.print("Spaceship turned right\n");
	}
	
	/**
	 * Method forward a spaceship
	 */
	public void ForwardSpacehip()
	{
		controlPanel.Forward();
		fout.print("Spaceship forward\n");
	}
	
	/**
	 * Method sets a speed for spaceship
	 * @param <code>speed</> Speed for spaceship
	 */
	public void SetSpeed(int speed)
	{
		controlPanel.SpeedChange(speed);
		fout.print("Spaceship speed set "+speed+"\n");
	}

	/**
	 * Method returns speed of spaceship
	 * @return Speed of spaceship
	 */
	public int getSpeedSpaceship()
	{
		return controlPanel.getSpeed();
	}
	
	/**
	 * Method opens door of spaceship
	 */
	public void OpenDoor()
	{
		door.Open();
		fout.print("Door of spaceship was opened\n");
	}
	
	/**
	 * Method closes door of spaceship
	 */
	public void CloseDoor()
	{
		door.Close();
		fout.print("Door of spaceship was closed\n");
	}
	
	/**
	 * Method returns status of door
	 * @return Door status
	 */
	public boolean getStatusDoor()
	{
		return door.getDoorStatus();
	}
	
	/**
	 * Method returns spaceship direction
	 * @return Direction of spaceship <code>ControlPanel.Direction</code> type
	 */
	public ControlPanel.Direction getDirectionSpaceship()
	{
		return controlPanel.getDirection();
	}
	
	/**
	 * Method releases used recourses
	 */
	public void dispose()
	{
		fout.close();
	}
}

/**
* @author BAZHULIN SERHIY
* Class <code>Engine</code> implements engine
*/
class Engine
{
	private double fuel;
	private boolean isStarted;
	
	/**
	 * Constructor
	 * @throws FileNotFoundException
	 */
	public Engine() throws FileNotFoundException
	{
		fuel = 0;
		isStarted = false;
	}
	
	/**
	 * Constructor
	 * @param fuel
	 * @throws FileNotFoundException
	 */
	public Engine(double fuel) throws FileNotFoundException
	{
		this.fuel = fuel;
	}
	
	/**
	 * Constructor
	 * @param fuel
	 * @param isStarted
	 * @throws FileNotFoundException
	 */
	public Engine(double fuel, boolean isStarted) throws FileNotFoundException
	{
		this.fuel=fuel;
		this.isStarted = isStarted;
	}
	
	/**
	 * Method starts the engine
	 */
	public boolean StartEngine()
	{
		if(fuel>0)
		{
			isStarted = true;
			return true;
		}
		else
			return false;
	}
	
	/**
	 * Method switches off the engine
	 */
	public void SwitchOffEngine()
	{
		isStarted = false;
	}
	
	/**
	 * Method refuel the engine
	 * @param fuel
	 */
	public void Refuel(double fuel)
	{
		this.fuel = fuel;
	}
	
	/**
	 * Method returns the fuel of engine
	 * @return The fuel value
	 */
	public double getFuel()
	{
		return fuel;
	}
	
	/**
	 * Method returns a status of engine
	 * @return A status of engine
	 */
	public boolean getEngineStatus()
	{
		return isStarted;
	}
}

/**
* @author BAZHULIN SERHIY
* Class <code>ControlPanel</code> implements control panel
*/
class ControlPanel
{
	enum Direction {RIGHT, LEFT, FORWARD}
	
	private int speed;
	private Direction direction;
	
	/**
	 * Constructor
	 */
	public ControlPanel()
	{
		speed = 0;
		direction=Direction.FORWARD;
	}
	
	/**
	 * Constructor
	 * @param <code>speed</code>
	 * @param <code>direction</code>
	 */
	public ControlPanel(int speed, Direction direction)
	{
		this.speed = speed;
		this.direction = direction;
	}
	
	/**
	 * Method set a speed for control panel
	 * @param <code>speed</code>
	 */
	public void SpeedChange(int speed)
	{
		this.speed=speed;
	}
	
	/**
	 * Method returns the set speed on control panel 
	 * @return The speed value
	 */
	public int getSpeed()
	{
		return speed;
	}
	
	/**
	 * Method sets the right direction to control panel
	 */
	public void TurnRight()
	{
		direction = Direction.RIGHT;
	}
	
	/**
	 * Method sets the left direction to control panel
	 */
	public void TurnLeft()
	{
		direction = Direction.LEFT;
	}
	
	/**
	 * Method sets the forward direction to control panel
	 */
	public void Forward()
	{
		direction = Direction.FORWARD;
	}

	/**
	 * Method returns direction of control panel
	 * @return Direction of control panel
	 */
	public Direction getDirection()
	{
		return direction;
	}
}

/**
* @author BAZHULIN SERHIY
* Class <code>Door</code> implements door
*/
class Door
{
	private boolean isClosed;
	
	/**
	 * Constructor
	 * @throws FileNotFoundException
	 */
	public Door() throws FileNotFoundException
	{
		isClosed = false;
	}
	
	/**
	 * Constructor
	 * @param isClosed
	 * @throws FileNotFoundException
	 */
	public Door(boolean isClosed) throws FileNotFoundException
	{
		this.isClosed = isClosed;
	}
	
	/**
	 * Method opens door
	 */
	public void Open()
	{
		isClosed = false;
	}
	
	/**
	 * Method closes door
	 */
	public void Close()
	{
		isClosed = true;
	}
	
	/**
	 * Method returns status of door 
	 * @return door status
	 */
	public boolean getDoorStatus()
	{
		return isClosed;
	}
}

