package su.liqiang.agents;

import ch.idsia.agents.Agent;
import ch.idsia.agents.controllers.BasicMarioAIAgent;
import ch.idsia.benchmark.mario.engine.sprites.Mario;
import ch.idsia.benchmark.mario.environments.Environment;

public class InputTest extends BasicMarioAIAgent implements Agent{

	public InputTest() {
		super("InputTest");
	}

	@Override
	public boolean[] getAction(){
		int key = (int) (Math.random() * Environment.numberOfKeys); 
	    action[key] = Math.random() < 0.5;

	    return action;
	}
}
