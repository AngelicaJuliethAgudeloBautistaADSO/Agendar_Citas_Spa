package Interfaces;

import Modelo.Cosmetologo;
import java.util.List;

public interface CRUD_cosmetologo {
    public List listar();
    public Cosmetologo list(int id);
    public boolean add (Cosmetologo cos);
    public boolean edit (Cosmetologo cos);
    public boolean eliminar (int id);
}
