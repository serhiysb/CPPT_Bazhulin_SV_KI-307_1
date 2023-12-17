import os


class Spaceship:
    def __init__(self, fuel=0):
        self.fuel = fuel
        self.engine = Engine()
        self.controlPanel = ControlPanel()
        self.door = Door()
        self.tmp = 675
        self.fout = open("Log.txt", "w")

    def RefuelSpaceship(self, fuel):
        pass

    def StartSpaceship(self):
        pass

    def SwitchOffSapceship(self):
        pass

    def getFuelStatus(self):
        fuel = self.engine.getFuel()
        return fuel

    def getEngineSpaceshipStatus(self):
        status = self.engine.getEngineStatus()
        return status

    def TurnLeftSpaceship(self):
        self.controlPanel.TurnLeft()
        print("Spaceship turned left\n")
        self.fout.write("Spaceship turned left\n")

    def TurnRightSpaceship(self):
        self.controlPanel.TurnRight()
        print("Spaceship turned right\n")
        self.fout.write("Spaceship turned right\n")

    def ForwardSpacehip(self):
        self.controlPanel.Forward()
        print("Spaceship forward\n")
        self.fout.write("Spaceship forward\n")

    def SetSpeed(self, speed):
        self.controlPanel.SpeedChange(speed)
        print("Spaceship speed set " + str(speed) + "\n")
        self.fout.write("Spaceship speed set " + str(speed) + "\n")

    def getSpeedSpaceship(self):
        return self.controlPanel.getSpeed()

    def OpenDoor(self):
        self.door.Open()
        print("Door of spaceship was opened\n")
        self.fout.write("Door of spaceship was opened\n")

    def CloseDoor(self):
        self.door.Close()
        print("Door of spaceship was closed\n")
        self.fout.write("Door of spaceship was closed\n")

    def getStatusDoor(self):
        return self.door.getDoorStatus()

    def getDirectionSpaceship(self):
        return self.controlPanel.getDirection()

    def __str__(self):
        try:
            file = open("randomFile.txt", "w+")
            value = str(self.tmp)
            file.write(value)
            return "Data writed successfuly"
        except IOError as ex:
            return ex.strerror

    def dispose(self):
        self.fout.close()


class Engine:
    def __init__(self):
        self.fuel = 0
        self.isStarted = False

    def StartEngine(self):
        if self.fuel > 0:
            self.isStarted = True
        else:
            print("Fuel is not enough for starting of engine")

    def SwitchOffEngine(self):
        self.isStarted = False

    def Refuel(self, fuel):
        self.fuel = fuel

    def getFuel(self):
        return self.fuel

    def getEngineStatus(self):
        return self.isStarted


class ControlPanel:
    class Direction:
        RIGHT = "RIGHT"
        LEFT = "LEFT"
        FORWARD = "FORWARD"

    def __init__(self):
        self.speed = 0
        self.direction = self.Direction.FORWARD

    def SpeedChange(self, speed):
        self.speed = speed

    def getSpeed(self):
        return self.speed

    def TurnRight(self):
        self.direction = self.Direction.RIGHT

    def TurnLeft(self):
        self.direction = self.Direction.LEFT

    def Forward(self):
        self.direction = self.Direction.FORWARD

    def getDirection(self):
        return self.direction


class Door:
    def __init__(self):
        self.isClosed = False

    def Open(self):
        self.isClosed = False

    def Close(self):
        self.isClosed = True

    def getDoorStatus(self):
        return self.isClosed
