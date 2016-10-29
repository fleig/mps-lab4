import java.util.ArrayList;

/**
 * Created by lucas on 28/10/16.
 */
public class CareTakerUsuario {
    protected UsuarioMemento state;

    public CareTakerUsuario() {}

    public void setMemento(UsuarioMemento memento){
        this.state = memento;
    }

    public UsuarioMemento getMemento(){
        return state;
    }
}
