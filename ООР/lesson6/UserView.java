package group4386.gerasimava.lesson6;

import java.util.List;

public interface UserView<T extends User> {
	public void sendOnConsole(List<T> list);
}