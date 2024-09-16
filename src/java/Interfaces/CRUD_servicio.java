package Interfaces;

import Modelo.Servicio;
import java.util.List;

public interface CRUD_servicio {
    public List listar();
    public Servicio list(int id);
    public boolean list(Servicio ser);
    public boolean add(Servicio ser);
    public boolean edit(Servicio ser);
    public boolean eliminar(int id);
}
