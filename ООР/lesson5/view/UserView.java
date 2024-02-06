package group4386.gerasimava.lesson5.view;

import group4386.gerasimava.lesson5.model.User;

import java.util.List;

public interface UserView<T extends User> {
	public void sendOnConsole(List<T> list);
}