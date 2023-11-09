package KI307.Bazhulin.Lab3;

import static java.lang.System.out;

import java.io.*;

/**
 * Spaceship Application class implement main methods for Spaceship class possibilities demonstration
 * @author SERHIY BAZHULIN
 * @version 1.0
 */

public class SpaceshipApp {

	/**
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		ControlPanel.Direction direction =null;
		ReusableSpaceship reusableSpaceship = new ReusableSpaceship();
//		reusableSpaceship.RefuelSpaceship(50);
//		out.print(reusableSpaceship.getFuelStatus()+"\n");
//		
//		reusableSpaceship.CloseDoor();
//		reusableSpaceship.StartSpaceship();
//		reusableSpaceship.SetSpeed(100);
//		reusableSpaceship.TakeOff();
//		out.print(reusableSpaceship.getStatus()+"\n");
//		
//		reusableSpaceship.TurnRightSpaceship();
//		direction = reusableSpaceship.getDirectionSpaceship();
//		if(direction==ControlPanel.Direction.FORWARD)
//			out.print("Forward direction\n");
//		else if(direction == ControlPanel.Direction.LEFT)
//			out.print("Left direction\n");
//		else
//			out.print("Right direction\n");
//		
//		reusableSpaceship.Land();
//		out.print(reusableSpaceship.getStatus()+"\n");
//		reusableSpaceship.SwitchOffSapceship();
//		reusableSpaceship.OpenDoor();
//		reusableSpaceship.dispose();
		
		System.out.print(reusableSpaceship.toString());
	}

}
