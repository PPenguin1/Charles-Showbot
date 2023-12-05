package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.lib.core.motors.ITeamTalon;
import frc.lib.core.motors.TeamTalonFX;

public class DrivetrainSubsystem extends SubsystemBase
{
	private ITeamTalon leftDriveMotorMain;
	private ITeamTalon leftDriveMotorSub;
	private ITeamTalon rightDriveMotorMain;
	private ITeamTalon rightDriveMotorSub;

	public DrivetrainSubsystem()
	{
		leftDriveMotorMain = new TeamTalonFX("Subsystems.Drivetrain.LeftMain", 0);
		leftDriveMotorSub = new TeamTalonFX("Subsystems.Drivetrain.LeftSub", 0);
		rightDriveMotorMain = new TeamTalonFX("Subsystems.Drivetrain.RightMain", 0);
		rightDriveMotorSub = new TeamTalonFX("Subsytems.DriveTrain.RightSub", 0);

	}

}
