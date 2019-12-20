package org.firstinspires.ftc.teamcode.Autonomous.Red.Line;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;

import org.firstinspires.ftc.teamcode.Autonomous.BasicLine;

/**
 * Created by shell on 10/26/2019.
 */
@Disabled
@Autonomous(group = "Red:ZLine:SkyStone", name = "Red: Line: SkyStone Wall")
public class RedSkyStoneLineWall extends BasicLine {
	@Override
	protected Side getStartingSide() {
		return Side.SKYSTONE;
	}

	@Override
	protected Color getColor() {
		return Color.RED;
	}

	@Override
	protected Placement getFinalPlacement() {
		return Placement.WALL;
	}
}