/**
 * Created by lucas on 28/10/16.
 */
public class UsuarioMemento {
    private final String state;

    public UsuarioMemento(String state){
        this.state = state;
    }

    public String getSavedState() {
        return this.state;
    }
}
