package abstraction;

import java.io.Serializable;
import java.rmi.server.ServerRef;
import java.util.List;
import java.util.concurrent.CompletionService;

public interface UserService extends CommonService,List<String>,Serializable,CompletionService<String> {
	
    void addUser();
	void deleteUser();
	
	default void update() {}
	
	static void getAll() {
		System.out.println("----user list");
	}

}
