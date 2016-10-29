/**
 * Created by lucas on 28/10/16.
 */
public interface Command {
    void addUsuario(Usuario u);
    void updateUsuario(Usuario u);
    Usuario getUsuario(String login);
}
