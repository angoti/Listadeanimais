package professorangoti.com.listadeanimais;

public class Animal {
    private String nome;
    private int fotoID;

    public Animal(String nome, int fotoID) {
        this.nome = nome;
        this.fotoID = fotoID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getFotoID() {
        return fotoID;
    }

    public void setFotoID(int fotoID) {
        this.fotoID = fotoID;
    }
}
