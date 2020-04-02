public class Usuario {
    String nombre;
    int cedula;
    String contrasena;
    int edad;
    int cantidadDeHijos;
    int saldo = 0;

    public void setNombre(String nombre) {
        nombre = nombre
    }
    public void setCedula(int cedula) {
        cedula = cedula
    }
    public void setContrasena(String contrasena) {
        contrasena = contrasena
    }
    public void setEdad(int edad) {
        edad = edad
    }
    public void setCantidadDeHijos(int cantidadDeHijos) {
        cantidadDeHijos = cantidadDeHijos
    }
    public void setSaldo(int saldo) {
        saldo = saldo
    }

    public String getNombre() {
        return nombre
    }
    public int getCedula() {
        return cedula
    }
    public String getContrasena() {
        return contrasena
    }
    public int getEdad() {
        return edad
    }
    public int getCantidadDeHijos() {
        return cantidadDeHijos
    }
    public int getSaldo() {
        return saldo
    }

    Usuario (String nom, int ci, String password, int edadUsuario, int hijos, int sal) {
        nombre = nom;
        cedula = ci;
        contrasena = password;
        edad = edadUsuario;
        cantidadDeHijos = hijos;
        saldo = sal;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true
        }
        if (obj == null) || (obj.getClass() != this.getClass()) {
            return false
        }
        Usuario userToCheck = (Usuario) obj;
        return cedula == userToCheck.cedula
    }
}