package gamelive.api;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import gamelive.api.resources.GameResource;
import gamelive.api.resources.NoticiaResource;
import gamelive.api.resources.SubscribeListResource;

public class GameLiveApplication extends Application {
	private Set<Object> singletons = new HashSet<Object>();
	private Set<Class<?>> classes = new HashSet<Class<?>>();
	
	public GameLiveApplication() {
		singletons.add(GameResource.getInstance());
		singletons.add(SubscribeListResource.getInstance());
		singletons.add(NoticiaResource.getInstance());
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
