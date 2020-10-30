package projetoclasseabtrata;

/**
 *
 * @author adaltoss
 */
public class Elefante extends  Mamifero {
    

    @Override
    public void amamentar() {
        System.out.println("Elefante amamentou");
    }

    @Override
    public void cadastrar() {
        System.out.println("Elefante cadastrado");
    }

    @Override
    public boolean editar() {
        System.out.println("Elefante editado");
        return true;
    }
    
}
