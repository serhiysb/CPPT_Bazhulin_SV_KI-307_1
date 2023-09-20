/**
 * Lab3 package
 */
package KI307.Bazhulin.Lab2;

import java.io.*;

import static java.lang.System.out;

/**
 * Spaceship Application class implement main methods for Spaceship class possibilities demonstration
 * @author SERHIY BAZHULIN
 * @version 1.0
 */

public class SpaceshipApp
{
	/**
	* @param args
	* @throws FileNotFoundException
	*/
	public static void main(String[] args) throws FileNotFoundException
	{
		ControlPanel.Direction direction = null;
		Spaceship spaceship=new Spaceship();
		
		Spaceship spaceship1 = new Spaceship(5);
		Spaceship spaceship2 = new Spaceship(10);
		Spaceship spaceship3 = new Spaceship(20);
		Spaceship spaceship4 = new Spaceship(30);
		Spaceship spaceship5 = new Spaceship(20);
		f1();

		System.out.print(spaceship.getCountEngineFuel40());
		/*spaceship.RefuelSpaceship(50);
		out.print(spaceship.getFuelStatus());
		
		spaceship.CloseDoor();
		spaceship.StartSpaceship();
		spaceship.SetSpeed(100);
		
		spaceship.TurnRightSpaceship();
		direction = spaceship.getDirectionSpaceship();
		if(direction==ControlPanel.Direction.FORWARD)
			out.print("Forward direction\n");
		else if(direction == ControlPanel.Direction.LEFT)
			out.print("Left direction\n");
		else
			out.print("Right direction\n");
		
		spaceship.SwitchOffSapceship();
		spaceship.OpenDoor();
		spaceship.dispose();*/
	}
	public static void f1() throws FileNotFoundException
	{
		Spaceship spaceship5 = new Spaceship(40);
		
	}
}