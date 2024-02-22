package com.comsystem.homework.service;

import com.comsystem.homework.model.RobotAction;
import com.comsystem.homework.model.RobotPlan;
import com.comsystem.homework.robot.RobotOperations;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class RobotOperationTests {

    private RobotOperations robotOperations = new RobotOperations();

   @Test
    void testMethodExcavateStonesFor1dayShouldReturn1Stone() {
       RobotPlan robotPlan = new RobotPlan(1,1, List.of(RobotAction.DIG));
       Assertions.assertEquals(robotPlan,robotOperations.excavateStonesForDays(1));
   }

   @Test
    void testMethodExcavateStonesFor0DayShouldReturn0DaysAnd0Stones() {
       RobotPlan robotPlan = new RobotPlan(0,0,new ArrayList<>());
       Assertions.assertEquals(robotPlan,robotOperations.excavateStonesForDays(0));
   }

   @Test
    void testMethodExcavateStonesFor5DayShouldReturn16Stones() {
       RobotPlan robotPlan = new RobotPlan(5,16,
               List.of(
                       RobotAction.CLONE,
                       RobotAction.CLONE,
                       RobotAction.CLONE,
                       RobotAction.CLONE,
                       RobotAction.DIG
               ));
       Assertions.assertEquals(robotPlan,robotOperations.excavateStonesForDays(5));
   }

   @Test
    void testMethodDaysRequiredToCollectStonesWith16StonesShouldReturn5Days() {
       RobotPlan robotPlan = new RobotPlan(5,16,
               List.of(
                       RobotAction.CLONE,
                       RobotAction.CLONE,
                       RobotAction.CLONE,
                       RobotAction.CLONE,
                       RobotAction.DIG
               ));
       Assertions.assertEquals(robotPlan,robotOperations.daysRequiredToCollectStones(16));
   }

   @Test
    void testMethodDaysRequiredToCollectStonesWith1StoneShouldReturn1Day() {
       RobotPlan robotPlan = new RobotPlan(1,1,List.of(RobotAction.DIG));
       Assertions.assertEquals(robotPlan,robotOperations.daysRequiredToCollectStones(1));
   }

   @Test
    void testMethodDaysRequiredToCollectStonesWith0StoneShouldReturn0Day() {
       RobotPlan robotPlan = new RobotPlan(0,0,new ArrayList<>());
       Assertions.assertEquals(robotPlan,robotOperations.daysRequiredToCollectStones(0));
   }
}
