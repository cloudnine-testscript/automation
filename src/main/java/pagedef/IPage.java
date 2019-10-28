package pagedef;

import java.util.List;

import agent.IAgent;
import agent.internal.IWindowActions;
import control.IControl;
import enums.Platform;

public interface IPage extends IWindowActions {
	IControl getControl(String name) throws Exception;

	List<IControl> getControls(String name) throws Exception;

	IAgent getAgent();

	Platform getPlatform();

	Identifier getIdentifier(String name);
}
