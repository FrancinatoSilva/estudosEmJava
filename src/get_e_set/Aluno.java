package get_e_set;

public class Aluno {

    private String name;
    private int matricula;

    public Aluno(String name, int matricula) {
        this.name = name;
        this.matricula = matricula;
    }

    public String Getname() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
