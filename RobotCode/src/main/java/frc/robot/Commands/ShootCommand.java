package frc.robot.Commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.ShooterSubsystem;

public class ShootCommand extends CommandBase
{
	private ShooterSubsystem shooter;

	public ShootCommand(ShooterSubsystem shooter)
	{
		this.shooter = shooter;
		addRequirements(shooter);

	}

	public void execute()
	{
		shooter.setMotorpower(1, "shoot_button_down");
	}

	public void end()
	{
		shooter.setMotorpower(0, "shoot_button_release");
	}
}
