package group4386.gerasimava.lesson4;

public interface UserController<T extends User> {
	void create(String surname, String firstname, String patronymic);
}