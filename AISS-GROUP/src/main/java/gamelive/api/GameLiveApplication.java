package gamelive.api;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

public class GameLiveApplication extends Application {
	private Set<Object> singletons = new HashSet<Object>();
	private Set<Class<?>> classes = new HashSet<Class<?>>();
	
	public GameLiveApplication() {
//
//		singletons.add();
//		singletons.add();
	}
	
	@Override
	public Set<Class<?>> getClasses() {
		return classes;
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}
}
