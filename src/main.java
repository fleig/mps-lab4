/**
 * Created by lucas on 28/10/16.
 */
public class main {
    public static void main(String[] args) {
        Usuario u = new Usuario("username");
        u.saveMemento();
        System.out.println(u.getLogin());
        u.setLogin("username2");
        System.out.println(u.getLogin());
        u.reverterNomeLogin();
        System.out.println(u.getLogin());
    }
}
