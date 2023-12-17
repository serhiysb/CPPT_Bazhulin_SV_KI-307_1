import os
from Spaceship import Spaceship, Engine, ControlPanel, Door


class Mission:
    def TakeOff(self):
        pass

    def Land(self):
        pass

    def getStatus(self):
        pass


class ReusableSpaceship(Spaceship, Mission):
    def __init__(self, fuel=0, flightsCount=0):
        super().__init__(fuel)
        self.flightsCount = flightsCount
        self.inMission = False

    def setFlightsCount(self, count):
        self.flightsCount = count

    def getFlightsCount(self):
        return self.flightsCount

    def StartSpaceship(self):
        self.engine.StartEngine()

    def SwitchOffSapceship(self):
        self.engine.SwitchOffEngine()

    def RefuelSpaceship(self, fuel):
        self.engine.Refuel(fuel)

    def TakeOff(self):
        self.inMission = True

    def Land(self):
        self.inMission = False
        self.flightsCount += 1

    def getStatus(self):
        return self.inMission
