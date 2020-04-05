public class FuncionesUsuario {

    public static int calculoImpuestos(Usuario usr) {
        int edadUsuario = usr.edad;

        if (edadUsuario < 18) {
            impuesto = 0;

            if (edadUsuario < 0) {
                System.out.println("La edad del usuario es invalida (menor a cero).");
            }
        } else if ((edadUsuario >= 18 && edadUsuario < 30) || (edadUsuario > 65)) {
            impuesto = 2000
        } else if (edadUsuario >= 30 && edadUsuario <= 65) {
            impuesto = 7000
        };

        if (impuesto > 0) {
            int cantidadHijos = usr.cantidadHijos;

            if (cantidadHijos > 0) {
                int porcentaje = cantidadHijos * 3;

                if (porcentaje > 50) {
                    porcentaje = 50
                }

                float porCiento = porcentaje * impuesto;
                porCiento = porCiento /= 100;
                impuesto -= porCiento
            }
        }

        return impuesto;

    }

    public static void cobroSueldo(Usuario usr, valor) {
        usr.setSaldo(valor)
    }
}