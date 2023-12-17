from ReusableSpaceship import Mission, ReusableSpaceship
from Spaceship import Spaceship, Engine, ControlPanel, Door


if __name__ == "__main__":
    reusableSpaceship = ReusableSpaceship()
    reusableSpaceship.RefuelSpaceship(50)
    print(reusableSpaceship.getFuelStatus())

    reusableSpaceship.CloseDoor()
    reusableSpaceship.StartSpaceship()
    reusableSpaceship.SetSpeed(100)
    reusableSpaceship.TakeOff()

    reusableSpaceship.TurnRightSpaceship()
    direction = reusableSpaceship.getDirectionSpaceship()
    if direction == ControlPanel.Direction.FORWARD:
        print("Forward direction")
    elif direction == ControlPanel.Direction.LEFT:
        print("Left direction")
    else:
        print("Right direction")

    reusableSpaceship.Land()
    reusableSpaceship.SwitchOffSapceship()
    reusableSpaceship.OpenDoor()
    reusableSpaceship.dispose()
