/**
 * Created by lucas on 28/10/16.
 */
public class Usuario {
    String login;
    CareTakerUsuario caretaker;

    public Usuario(String login) {
        caretaker = new CareTakerUsuario();
        this.login = login;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login){
        this.login = login;
    }

    public void saveMemento(){
        caretaker.setMemento(new UsuarioMemento(this.login));
    }

    public void reverterNomeLogin(){
        login = caretaker.getMemento().getSavedState();
    }
}
